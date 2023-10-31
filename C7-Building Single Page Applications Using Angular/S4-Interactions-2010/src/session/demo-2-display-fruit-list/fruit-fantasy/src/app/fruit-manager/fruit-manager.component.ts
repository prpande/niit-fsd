import { Component, OnInit } from '@angular/core';
import { Fruit } from '../models/fruit';
import { FRUITS } from '../models/fruits';

@Component({
  selector: 'app-fruit-manager',
  templateUrl: './fruit-manager.component.html',
  styleUrls: ['./fruit-manager.component.css']
})
export class FruitManagerComponent implements OnInit {

  fruits: Fruit[] = FRUITS;

  constructor() { 
  }
  
  ngOnInit(): void {
    console.log(this.fruits);
  }

}
