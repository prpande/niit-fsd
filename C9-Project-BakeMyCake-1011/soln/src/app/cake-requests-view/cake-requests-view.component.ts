import { Component, OnInit } from '@angular/core';
import { OrderService } from '../services/order.service';
import { Order } from 'src/models/order';
import { RestErrorHandlerService } from '../services/rest-error-handler.service';

@Component({
  selector: 'app-cake-requests-view',
  templateUrl: './cake-requests-view.component.html',
  styleUrls: ['./cake-requests-view.component.css']
})
export class CakeRequestsViewComponent implements OnInit {
  orders: Order[];

  tableDisplayArray: Order[];

  currentPage: number;
  pageSize: number;
  totalSize: number;
  constructor(private orderService: OrderService, private restErrorSvc: RestErrorHandlerService) {
    this.orders = [];
    this.tableDisplayArray = [];
    this.currentPage = 0;
    this.pageSize = 10;
    this.totalSize = 0;
  }
  ngOnInit(): void {
    this.orderService.getOrders().subscribe({
      next: data => {
        this.orders = data;
        this.totalSize = this.orders.length;
        this.generateOrderArray();
      },
      error: err => {
        this.restErrorSvc.processFetchError(err);
      }
    })
  }

  dateToString(date: any) { return (new Date(date)).toDateString(); }
  address(order: Order) {
    return `${order.customerInfo?.address?.line1}, 
                                ${order.customerInfo?.address?.line2},
                                ${order.customerInfo?.address?.landmark},
                                ${order.customerInfo?.address?.city},
                                ${order.customerInfo?.address?.state} -
                                ${order.customerInfo?.address?.pincode}`
  }

  handlePageEvent(event: any) {
    this.currentPage = event.pageIndex;
    this.pageSize = event.pageSize;
    this.generateOrderArray();
  }

  generateOrderArray() {
    let start = this.currentPage * this.pageSize;
    let end = start + this.pageSize;
    this.tableDisplayArray = this.orders.slice(start, end);
  }
}
