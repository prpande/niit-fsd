import { Component } from '@angular/core'; 
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-navigation-panel',
  templateUrl: './navigation-panel.component.html',
  styleUrls: ['./navigation-panel.component.css']
})
export class NavigationPanelComponent {
 
  isLoggedIn: boolean = false;

  constructor( ) {}

  onLoggedIn($event: any) {
    this.isLoggedIn = !($event instanceof LoginComponent);
  }
}
