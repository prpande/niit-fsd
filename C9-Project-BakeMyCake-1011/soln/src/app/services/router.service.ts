import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class RouterService {

  constructor(private router: Router) { }

  goHome(){
    this.router.navigate([""]);
  }

  goCakeRequests(){
    this.router.navigate(["cake-requests"]);
  }

  goLogin(){
    this.router.navigate(["login"]);
  }
}
