import { Component } from '@angular/core';
import { NOTES } from '../models/notes';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  notes = NOTES
  searchText: string = '';
  searchNote() {
    this.notes = NOTES;
    if (this.searchText !== '' && this.searchText) {
      this.notes = this.notes.filter(note => note.title?.startsWith(this.searchText.toLowerCase()));
    }
  }
}
