import { Component, OnInit } from '@angular/core';
import { Note } from '../models/note';
import { NoteService } from '../services/note.service';
import { AuthService } from '../services/auth.service';
import { RouterService } from '../services/router.service';

@Component({
  selector: 'app-note-view',
  templateUrl: './note-view.component.html',
  styleUrls: ['./note-view.component.css']
})
export class NoteViewComponent implements OnInit {

  notes: Note[] = [];

  constructor(private noteService: NoteService, private authService: AuthService, private routerService: RouterService) { }

  ngOnInit(): void {
    this.refreshNotes();
  }

  refreshNotes() {
    this.getNotesFromService((data: Note[]) => { this.notes = data });
  }

  getNotesFromService(nextOperation: (data: Note[]) => void) {
    this.noteService.getNotes().subscribe({
      next: data => { nextOperation(data) },
      error: error => {
        console.error(error);
        alert("Failed to Fetch Notes Due to Server Error !!");
      }
    });
  }

  onSearch(event: any) {
    this.getNotesFromService((data: Note[]) => {
      this.notes = data
      if (event !== '' && event) {
        this.notes = this.notes.filter(note => note.title?.includes(event));
      }
    });
  }

  onSave(event: any) {
    if (event) {
      this.refreshNotes();
    }
  }

  onDelete(event:any){
    if(event){
      this.refreshNotes();
    }
  }

  logout(){
    this.authService.logout();
    this.routerService.navigateToLoginView();
  }
}
