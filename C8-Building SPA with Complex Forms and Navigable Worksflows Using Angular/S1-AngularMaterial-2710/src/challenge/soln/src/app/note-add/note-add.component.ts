import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Note } from '../models/note';
import { NoteService } from '../services/note.service';

@Component({
  selector: 'app-note-add',
  templateUrl: './note-add.component.html',
  styleUrls: ['./note-add.component.css']
})
export class NoteAddComponent implements OnInit {

  note: Note = {};
  showNoteAddForm: boolean = false;

  @Output()
  saveNoteEvent: EventEmitter<any> = new EventEmitter<any>();

  constructor(private noteService: NoteService) { }

  ngOnInit(): void {
  }

  saveNote() {
    this.noteService.addNote(this.note).subscribe({
      next: () => {
        this.saveNoteEvent.emit(this.note);
        this.note.title = '';
        this.note.content = '';
        alert('Note Added');
      },
      error: error => {
        console.error(error);
        alert(" Failed to Add Note Due to Server Error !!");
      }
    });
  }

  toggleAddNoteDisplay() {
    this.showNoteAddForm = !this.showNoteAddForm;
  }
}
