import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Feedback } from '../model/feedback';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {

  url: string = "http://localhost:3000/feedbacks";
  constructor(private http:HttpClient) { }

  saveFeedback(formData: Feedback): Observable<Feedback>{
    return this.http.post(this.url, formData);
  }
}
