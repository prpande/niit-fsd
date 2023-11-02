import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Note } from '../models/note';

@Component({
  selector: 'app-note-add',
  templateUrl: './note-add.component.html',
  styleUrls: ['./note-add.component.css']
})
export class NoteAddComponent implements OnInit {

  noteTitleText?: string = '';
  noteContentText?: string = '';

  @Output()
  saveNoteEvent: EventEmitter<any> = new EventEmitter<any>();

  constructor() { }

  ngOnInit(): void {
  }

  saveNote() {
    if (this.noteContentText === '' || !this.noteContentText ||
      this.noteTitleText === '' || !this.noteTitleText) {
      alert("!! Invalid Input !!\nPlease enter valid note data.");
    }
    else {
      let id: number = Math.floor(Math.random() * 1000) + 1;
      let note: Note = {
        id: id,
        title: this.noteTitleText,
        content: this.noteContentText
      };

      this.saveNoteEvent.emit(note);
      this.noteTitleText = '';
      this.noteContentText = '';
    }
  }
}
