import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Note } from '../models/note';
import { NoteService } from '../services/note.service';
import { RouterService } from '../services/router.service';

@Component({
  selector: 'app-note',
  templateUrl: './note.component.html',
  styleUrls: ['./note.component.css']
})
export class NoteComponent implements OnInit {

  @Input()
  note?: Note;

  @Output()
  deleteNoteEvent: EventEmitter<any> = new EventEmitter<any>();

  constructor(private noteService: NoteService, private router: RouterService) { }

  ngOnInit(): void {
  }

  deleteNote(){
    this.noteService.deleteNote(this.note?.id).subscribe(data =>{
      this.deleteNoteEvent.emit(this.note);
    })
  }

  editNote(){
    this.router.navigateToNoteEditView(this.note?.id);
  }
}
