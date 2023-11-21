import { Component, Input } from '@angular/core';
import { Item } from 'src/models/item';

@Component({
  selector: 'app-item-card',
  templateUrl: './item-card.component.html',
  styleUrls: ['./item-card.component.css']
})
export class ItemCardComponent {

  @Input()
  menuItem?: Item;

  onClick(){
    // navigate to order-view
  }
}
