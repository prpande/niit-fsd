import { Component, OnInit } from '@angular/core';
import { Note } from '../models/note';
import { NOTES } from '../models/notes';

@Component({
  selector: 'app-note-view',
  templateUrl: './note-view.component.html',
  styleUrls: ['./note-view.component.css']
})
export class NoteViewComponent implements OnInit {

  Notes: Note[] = NOTES;

  constructor() { }

  ngOnInit(): void {
  }

  onSearch(event: any) {
    this.Notes = NOTES;
    if (event !== '' && event) {
      this.Notes = NOTES.filter(note => note.title?.includes(event));
    }
  }

  onSave(event: any){
    if(event)
    {
      NOTES.push(event);
    }
  }
}
