import { Injectable } from '@angular/core';
import { UserService } from './user.service';
import { RouterService } from './router.service';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private loggedIn: boolean;

  constructor(private userService: UserService, private router: RouterService) {
    this.loggedIn = false;
   }

   get isLoggedIn(): boolean{
    return this.loggedIn;
   }

   login(username: string, password: string) : boolean{
    if(username === this.userService.AdminUserName && password === this.userService.AdminPassword){
      this.loggedIn = true;      
      console.log("Logged In");
    }

    return this.loggedIn;
  }
   
  logout(){
    this.loggedIn = false;
    console.log("Logged Out");
  }
}
