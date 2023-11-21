import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  _isLoggedIn: boolean = false;

  constructor() { }

  login(email: string, password: string){
    this._isLoggedIn = email === "admin@email.com" && password === "Admin1234";
  }

  logout(){
    this._isLoggedIn = false;
  }

  isLoggedIn(){
    return this._isLoggedIn;
  }
}
