import { Component } from '@angular/core';
import { Calc } from '../util';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'simple-web-app';
  calc: Calc = new Calc();

  add(x: number, y: number) {
    return this.calc.add(x, y);
  }

}
