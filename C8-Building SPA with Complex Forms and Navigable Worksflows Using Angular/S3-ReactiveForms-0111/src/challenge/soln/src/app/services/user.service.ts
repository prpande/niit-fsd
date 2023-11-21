import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../models/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  url: string = " http://localhost:3000/users";

  constructor(private http: HttpClient) { }

  addUser(user: User) : Observable<User>{
    return this.http.post(this.url, user);
  }
}
