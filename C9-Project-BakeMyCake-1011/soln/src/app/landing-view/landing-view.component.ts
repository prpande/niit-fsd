import { Component, OnInit } from '@angular/core';
import { Item } from 'src/models/item';
import { ItemService } from '../services/item.service';
import { RestErrorHandlerService } from '../services/rest-error-handler.service';

@Component({
  selector: 'app-landing-view',
  templateUrl: './landing-view.component.html',
  styleUrls: ['./landing-view.component.css']
})
export class LandingViewComponent implements OnInit {

  menuItems: Item[];
  filteredItems: Item[];

  selectedFilters: string[];
  searchString: string;

  constructor(private itemService: ItemService, private restErrorSvc: RestErrorHandlerService) {
    this.menuItems = [];
    this.filteredItems = [];
    this.selectedFilters = [];
    this.searchString = "";
  }

  ngOnInit(): void {
    this.itemService.getItems().subscribe({
      next: data => {
        this.menuItems = data;
        this.filteredItems = this.menuItems;
      },
      error: err => {
        this.restErrorSvc.processFetchError(err);
      }
    })
  }

  filterItems(){
    this.filteredItems = this.menuItems;
    if(this.selectedFilters.length > 0)
    {
      this.filteredItems = this.menuItems.filter(item => this.selectedFilters.indexOf(item.category as string) > -1);
    }
    if(this.searchString && this.searchString !== "")
    {
      this.filteredItems = this.filteredItems.filter(item => item.name?.toLowerCase().includes(this.searchString.toLowerCase()));
    }
  }

  onTextChange(searchText: string) {
    this.searchString = searchText;
    this.filterItems();
  }

  onFilterSelection(filters: string[]){
    this.selectedFilters = filters;    
    this.filterItems();
  }
}
