import { Component, Input } from '@angular/core';
import { AuthService } from '../services/auth.service';
import { RouterService } from '../services/router.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  @Input()
  loggedIn: boolean;

  constructor(private authService: AuthService, private router: RouterService){
    this.loggedIn = false;
  }
  
  logout(){
    this.authService.logout();
    this.loggedIn = this.authService.isLoggedIn;
    this.router.goHome();
  }
}
