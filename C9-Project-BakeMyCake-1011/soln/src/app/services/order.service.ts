import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from 'src/models/order';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  order_url = "https://my-json-server.typicode.com/prpande/bakemycake/orders";

  constructor(private http:HttpClient) { }

  saveOrder(order: Order): Observable<Order>{
    return this.http.post<Order>(this.order_url, order);
  }

  getOrders(): Observable<Order[]>{
    return this.http.get<Order[]>(this.order_url);
  }
}
