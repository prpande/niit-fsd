import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Item } from 'src/models/item';
import { ItemService } from '../services/item.service';

@Component({
  selector: 'app-order-view',
  templateUrl: './order-view.component.html',
  styleUrls: ['./order-view.component.css']
})
export class OrderViewComponent implements OnInit{

  item?: Item;
  orderInProgress: boolean;

  constructor(private activatedRoute: ActivatedRoute, private itemService: ItemService){
    this.item = {};
    this.orderInProgress = true;
  }

  ngOnInit(): void {
    this.orderInProgress = true;
    this.activatedRoute.paramMap.subscribe(data =>{
      let id = data.get("id") ?? 0;
      this.itemService.getItem(+id).subscribe({
        next: data=>{
          this.item = data;
        }
      })
    })
  }

  orderPlacedEvent(){
    this.orderInProgress = false;
  }
  
  canDeactivate(): boolean{
    if(this.orderInProgress){
      let response = confirm("Order has not been placed. Do you still want to leave?")
      return response;
    }
    else{
      return true;
    }
  }
}
