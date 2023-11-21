import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  AdminUserName: string;
  AdminPassword: string;

  constructor() { 
    this.AdminUserName = "Admin";
    this.AdminPassword = "Admin0987"
  }
}
