import { Component } from '@angular/core';
import { AuthService } from './services/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'bake-my-cake';
  isLoggedIn: boolean;
  constructor(private authService: AuthService){
    this.isLoggedIn = false;
  }

  checkLoggedIn(){
    this.isLoggedIn = this.authService.isLoggedIn;
    console.log(`checkLoggedIn: ${this.isLoggedIn}`);
  }
}
