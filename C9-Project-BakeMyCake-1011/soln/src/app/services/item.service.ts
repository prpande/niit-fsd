import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Item } from 'src/models/item';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  itemUrl: string = "https://my-json-server.typicode.com/prpande/bakemycake/items";

  constructor(private http:HttpClient) { }

  getItems(): Observable<Item[]>{
    return this.http.get<Item[]>(this.itemUrl);
  }

  getItem(id: number): Observable<Item>{
    return this.http.get<Item>(`${this.itemUrl}/${id}`);
  }
}
