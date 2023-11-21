import { Component, OnInit } from '@angular/core';
import { NoteService } from '../services/note.service';
import { ActivatedRoute } from '@angular/router';
import { Note } from '../models/note';
import { RouterService } from '../services/router.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-note-edit',
  templateUrl: './note-edit.component.html',
  styleUrls: ['./note-edit.component.css']
})
export class NoteEditComponent implements OnInit {

  editNoteForm: FormGroup = this.fb.group({
    title: ['', [Validators.required]],
    content: ['',[Validators.required, Validators.minLength(5)]]
  });
  
  note: Note = {};
  submitStatus: boolean = false;

  constructor(private noteService: NoteService, private activatedRoute: ActivatedRoute, private routerService: RouterService, private fb: FormBuilder) { }
  
  get title(){ return this.editNoteForm.get('title')}
  get content(){ return this.editNoteForm.get('content')}
  
  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(data =>{
      let id = data.get('id') ?? 0;
      this.noteService.getNote(+id).subscribe(data =>{
        this.note = data;
        this.editNoteForm.setValue({
          title:this.note.title,
          content:this.note.content
        });
        this.submitStatus = false;
      });
    });
  }

  editNote(){
    this.note.title = this.title?.value;
    this.note.content = this.content?.value;
    this.noteService.modifyNote(this.note.id, this.note).subscribe(data => {
      this.note = data;      
      this.submitStatus = true;
      this.routerService.navigateToNotesView();
    });
  }

  canDeactivate(){
    if(!this.submitStatus)
    {
      this.submitStatus = confirm("The page has unsaved changes. Click Ok if you want to stay on the same page. Else, click Cancel");
    }

    return this.submitStatus;
  }
}
