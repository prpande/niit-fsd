import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { AuthService } from '../services/auth.service';
import { RouteService } from '../services/route.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  @Output() 
  loggedIn: EventEmitter<boolean> = new EventEmitter<boolean>(false);
  vendorCode: string = "";
  
  constructor(private authService: AuthService,
    private fruitRouterService: RouteService ) { }

  ngOnInit(): void {
  }

  validateVendorCode() {
    if(this.vendorCode === "VEN22022022") {
      this.authService.login();
      this.loggedIn.emit(true);
      this.fruitRouterService.toHome();
    }
  }
}
