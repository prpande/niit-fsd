import { Component, OnInit } from '@angular/core';
import { RouterService } from '../services/router.service';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  email: string = "";
  password: string = "";

  constructor(private routerService: RouterService, private authService: AuthService) { }

  ngOnInit(): void {
    this.navigateToNotesViewIfLoggedIn();
  }

  login(){
    this.authService.login(this.email, this.password);
    this.navigateToNotesViewIfLoggedIn();
  }

  navigateToNotesViewIfLoggedIn(){
    if(this.authService.isLoggedIn()){
      this.routerService.navigateToNotesView();
    }
  }
}
