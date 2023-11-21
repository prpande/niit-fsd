import { Component, Input } from '@angular/core';
import { Item } from 'src/models/item';

@Component({
  selector: 'app-item-details',
  templateUrl: './item-details.component.html',
  styleUrls: ['./item-details.component.css']
})
export class ItemDetailsComponent {

  @Input()
  item?:Item;

  constructor(){}
}
