import { Component } from '@angular/core';
import { MOVIES } from '../models/movies';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  dashboardTitle: string = "List of Movies"
  movies = MOVIES;
}
