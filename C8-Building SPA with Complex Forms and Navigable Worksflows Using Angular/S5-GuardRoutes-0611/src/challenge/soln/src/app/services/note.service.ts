import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Note } from '../models/note';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NoteService {

  note_url: string = "http://localhost:3000/notes"
  constructor(private http: HttpClient) { }

  getNotes(): Observable<Note[]>{
    return this.http.get<Note[]>(this.note_url);
  }

  getNote(id?: number): Observable<Note>{
    return this.http.get<Note>(`${this.note_url}/${id}`);
  }

  addNote(note: Note): Observable<Note>{
    return this.http.post<Note>(this.note_url, note);
  }

  modifyNote(id?: number, note?: Note): Observable<Note>{
    return this.http.put<Note>(`${this.note_url}/${id}`, note);
  }

  deleteNote(id?: number){
    return this.http.delete(`${this.note_url}/${id}`);
  }
}
