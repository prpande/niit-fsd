import { Component } from '@angular/core';
import { UserService } from '../services/user.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { AuthService } from '../services/auth.service';
import { RouterService } from '../services/router.service';

@Component({
  selector: 'app-login-view',
  templateUrl: './login-view.component.html',
  styleUrls: ['./login-view.component.css']
})
export class LoginViewComponent {

  showPassword: boolean;
  loginForm: FormGroup;
  constructor(private fb: FormBuilder, private authService: AuthService, private snackBar: MatSnackBar, private router: RouterService) {
    this.showPassword = false;
    this.loginForm = this.fb.group({
      username: ['', [Validators.required]],
      password: ['', [Validators.required]]
    });
  }

  get username() { return this.loginForm.get('username'); }
  get password() { return this.loginForm.get('password'); }

  onSubmit(){
    console.log(this.username?.value);
    console.log(this.password?.value);
    if(this.authService.login(this.username?.value, this.password?.value)){
      this.router.goCakeRequests();
    }
    else{
      this.snackBar.open("Incorrect Username & Password Combination!",
          'Try Again',
          { duration: 10000, panelClass: ['mat-toolbar','mat-primary'], verticalPosition:"top" })
      }

    this.loginForm.reset();
  }

  toggleShowPassword() {
    this.showPassword = !this.showPassword;
  }
}
