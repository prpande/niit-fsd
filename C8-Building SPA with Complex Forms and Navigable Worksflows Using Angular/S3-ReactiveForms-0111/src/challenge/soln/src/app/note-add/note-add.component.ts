import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Note } from '../models/note';
import { NoteService } from '../services/note.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-note-add',
  templateUrl: './note-add.component.html',
  styleUrls: ['./note-add.component.css']
})
export class NoteAddComponent implements OnInit {

  note: Note = {};
  showNoteAddForm: boolean = false;
  minDate: Date;
  @Output()
  saveNoteEvent: EventEmitter<any> = new EventEmitter<any>();

  constructor(private noteService: NoteService, private _matSnackBar: MatSnackBar) { 
    this.minDate = new Date(Date.now());
  }

  ngOnInit(): void {
  }

  saveNote(noteForm: any) {
    this.noteService.addNote(noteForm.value).subscribe({
      next: () => {
        this.saveNoteEvent.emit(noteForm.value);
        this._matSnackBar.open('Note added successfully', 'success', {
          duration: 5000,
          panelClass: ['mat-toolbar', 'mat-primary']
        })
        noteForm.resetForm();
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
