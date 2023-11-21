import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class RouterService {

  constructor(private router:Router) { }

  navigateToNotesView(){
    this.router.navigate(["notes"]);
  }

  navigateToNoteEditView(id?: number){
    this.router.navigate(["notes", id]);
  }

  navigateToLoginView(){
    this.router.navigate(["login"]);
  }
}
