import { Component, OnInit } from '@angular/core';
import { Feedback } from '../model/feedback';
import { MatSnackBar } from '@angular/material/snack-bar';
import { FeedbackService } from '../services/feedback.service';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {

  feedback: Feedback = {};
  location = ['Huntsville', 'Springdale', 'Orlando','Augusta', 'New York'];

  constructor(private _snackBar: MatSnackBar, private feedbackService: FeedbackService) { }

  ngOnInit(): void {
  }

  onSubmit(feedbackForm: any){
    this.feedbackService.saveFeedback(feedbackForm.value).subscribe({
      next:()=>{
        this._snackBar.open('Feedback submitted successfully', 'success', {
          duration: 5000,
          panelClass: ['mat-toolbar', 'mat-primary']
        })
    },
    error:()=>{
      alert("Failure while connecting to server, try again!!");
    }})
    feedbackForm.resetForm();
  }
}
