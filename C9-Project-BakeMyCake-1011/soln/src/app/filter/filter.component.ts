import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { ItemService } from '../services/item.service';

@Component({
  selector: 'app-filter',
  templateUrl: './filter.component.html',
  styleUrls: ['./filter.component.css']
})
export class FilterComponent implements OnInit {

  categories: string[];

  selectedCategories: string[];

  @Output()
  filterEvent: EventEmitter<string[]>;

  constructor(private itemService: ItemService) {
    this.categories = [];
    this.selectedCategories = [];
    this.filterEvent = new EventEmitter<string[]>();
  }

  ngOnInit(): void {
    this.itemService.getItems().subscribe(data => {
      this.categories = data.reduce((list, item) => {
        if (!list.find(cat => cat === item.category)) {
          list.push(item.category as string);
        }
        return list;
      }, [] as string[]);
    })
  }

  onClick(event: any) {
    let element: HTMLElement = event.target as HTMLElement;
    let category: string = element.textContent as string
    let index: number = this.selectedCategories.indexOf(category)
    if (index == -1) {
      element.classList.add("selected");
      this.selectedCategories.push(category);
    }
    else {
      this.selectedCategories.splice(index, 1);
      element.classList.remove("selected");
    }
    
    this.filterEvent.emit(this.selectedCategories);
  }

  select(item: any) {
    this.selectedCategories.push(item);
  }

  isActive(item: any) {
    return this.selectedCategories.findIndex(item) > -1
  }

  onClear(event:any){
    let clearButton = event.target as HTMLElement;
    let container = clearButton.parentElement?.parentElement;
    let buttons = container?.getElementsByTagName("button") as HTMLCollection
    for (let index = 0; index < buttons.length; index++) {
      buttons[index].classList.remove("selected");      
    }

    this.selectedCategories = [];
    this.filterEvent.emit(this.selectedCategories);
  }
}
