import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../services/user.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { User } from '../models/user';

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {

  registerForm: FormGroup = this.fb.group({
    firstName: ['', [Validators.required, Validators.minLength(2)]],
    lastName: [''],
    email: ['', [Validators.required, Validators.pattern(/^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i)]],
    password: ['', [Validators.required, Validators.pattern(/^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/)]],
    confirmPassword: ['', [Validators.required, Validators.pattern(/^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/)]],
    gender: [''],
    age: [0, [this.validateUserAge]],
    phone: ['', [Validators.pattern(/^[789]\d{9,9}$/)]],
    address: this.fb.group({
      street: [''],
      city: [''],
      state: [''],
      zipCode: ['', [Validators.pattern(/^\d{5,6}$/)]]
    })
  }, { validators: [this.confirmPasswordValidator] });

  constructor(private fb: FormBuilder, private userService: UserService, private _snackBar: MatSnackBar) {
  }

  get firstName() { return this.registerForm.get("firstName") }

  get lastName() { return this.registerForm.get("lastName") }

  get email() { return this.registerForm.get("email") }

  get password() { return this.registerForm.get("password"); }

  get confirmPassword() { return this.registerForm.get("confirmPassword"); }

  get age() { return this.registerForm.get("age"); }

  get phone() { return this.registerForm.get("phone"); }

  get zipCode() { return this.registerForm.get("address.zipCode"); }

  ngOnInit(): void {
  }

  validateUserAge(ageControl: AbstractControl) {
    const age = ageControl.value as number;
    return age >= 18 ? null : { invalidAge: true };
  }

  confirmPasswordValidator(formGroupControl: AbstractControl) {
    const passwordValue = formGroupControl.get('password')?.value;
    const confirmPasswordValue = formGroupControl.get('confirmPassword')?.value;
    if (!passwordValue || !confirmPasswordValue) {
      return null;
    }
    if (passwordValue != confirmPasswordValue) {
      return { passwordMismatch: true };
    }
    return null;
  }

  onSubmit() {
    let userInfo: User = this.registerForm.value as User;
    this.userService.addUser(userInfo).subscribe({
      next: () => {
        this._snackBar.open("Congrats!!You have submitted the form!!",
          'success',
          { duration: 5000, panelClass: ['mat-toolbar', 'mat-primary'] });
        this.registerForm.reset();
      },
      error: () => {
        this._snackBar.open("Failed to register user!! Please Try Again Later",
          'Failure',
          { duration: 3000, panelClass: ['mat-toolbar', 'mat-warn'] })
      }
    })
  }
}
