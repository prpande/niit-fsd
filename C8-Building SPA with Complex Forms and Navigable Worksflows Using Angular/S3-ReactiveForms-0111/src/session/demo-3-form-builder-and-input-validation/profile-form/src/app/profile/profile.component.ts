import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  maxDate: Date = new Date();

  profileForm = this.fb.group({
    firstName: ['', Validators.required],
    lastName: ['', [Validators.required,Validators.minLength(2)]],
    password: ['', [Validators.required, Validators.pattern(/^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/)]],
    confirmPassword: ['', [Validators.required, Validators.pattern(/^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/)]],
    gender: [''],
    dateOfBirth: ['', Validators.required],
    phone: ['',[Validators.pattern(/^[789]\d{9,9}$/)]],
    address: this.fb.group({
      street: [''],
      city: [''],
      state: [''],
      zip: ['']
    })
  });
  constructor(private fb: FormBuilder) { this.maxDate.setDate(this.maxDate.getDate() - 1); }

  get firstName(){return this.profileForm.get("firstName")}

  get lastName(){return this.profileForm.get("lastName")}

  get dateOfBirth(){return this.profileForm.get("dateOfBirth")}

  get phone(){return this.profileForm.get("phone");}

  get password(){return this.profileForm.get("password");}

  get confirmPassword(){return this.profileForm.get("confirmPassword");}


  ngOnInit(): void {
  }

  onSubmit():void{
    console.log(this.profileForm.value);
  }

}
