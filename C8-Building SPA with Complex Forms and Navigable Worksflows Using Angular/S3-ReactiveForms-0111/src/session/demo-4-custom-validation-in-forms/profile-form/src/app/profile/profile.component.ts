import { Component, OnInit, ViewChild } from '@angular/core';
import { AbstractControl, FormBuilder, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  maxDate: Date = new Date();

  profileForm = this.fb.group({
    firstName: ['', Validators.required],
    lastName: ['', [Validators.required, Validators.minLength(2)]],
    password: ['', [Validators.required, Validators.pattern(/^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/)]],
    confirmPassword: ['', [Validators.required, Validators.pattern(/^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/)]],
    gender: [''],
    dateOfBirth: ['', Validators.required],
    phone: ['', [Validators.pattern(/^[789]\d{9,9}$/)]],
    address: this.fb.group({
      street: [''],
      city: [''],
      state: [''],
      zip: ['']
    })
  }, { validators: [this.mustMatchValidator] });

  constructor(private fb: FormBuilder, private _snackBar: MatSnackBar) { this.maxDate.setDate(this.maxDate.getDate() - 1); }

  get firstName() { return this.profileForm.get("firstName") }

  get lastName() { return this.profileForm.get("lastName") }

  get dateOfBirth() { return this.profileForm.get("dateOfBirth") }

  get phone() { return this.profileForm.get("phone"); }

  get password() { return this.profileForm.get("password"); }

  get confirmPassword() { return this.profileForm.get("confirmPassword"); }

  ngOnInit(): void {
  }

  onSubmit(): void {
    console.log(this.profileForm.value);
    this._snackBar.open('Congrats!!You have submiited the form!!', 'success', {
      duration: 5000,
      panelClass: ['mat-toolbar', 'mat-primary']
    });
     this.profileForm.reset();
    }

  mustMatchValidator(fg: AbstractControl) {
    const passwordValue = fg.get("password")?.value;
    const confirmPasswordValue = fg.get("confirmPassword")?.value;
    if (!passwordValue || !confirmPasswordValue) {
      return null;
    }
    if (passwordValue != confirmPasswordValue) {
        return { mustMatch: false }
    }
    return null;
  }
}


