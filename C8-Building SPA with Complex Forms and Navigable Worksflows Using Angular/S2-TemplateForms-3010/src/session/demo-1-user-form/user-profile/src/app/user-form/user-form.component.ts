import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../model/user';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {
  user: User;
  
  constructor() {
    this.user={id:1, username:'James',email:'james@gmail.com',phone:8910989021}
   }

  ngOnInit(): void {
  }
  onSubmit() {
    alert("User details submitted!!")
    }
}
