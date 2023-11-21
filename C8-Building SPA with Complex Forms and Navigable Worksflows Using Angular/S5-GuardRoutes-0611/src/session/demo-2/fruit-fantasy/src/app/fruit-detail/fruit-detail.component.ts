import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Fruit } from '../models/fruit';
import { FruitService } from '../services/fruit.service';
import { RouteService } from '../services/route.service';

@Component({
  selector: 'app-fruit-detail',
  templateUrl: './fruit-detail.component.html',
  styleUrls: ['./fruit-detail.component.css']
})
export class FruitDetailComponent implements OnInit  {

  editStatus: boolean = false;

  constructor(private activatedRoute: ActivatedRoute,
    private fruitService: FruitService,
    private routeService: RouteService) { }
  
  canDeactivate(){
    if(!this.editStatus) {
      let response = confirm("Changes are not saved. Do you still want to Leave?")
      return response;
    }
    else
      return true;
  }

  fruit: Fruit = { price: 0, unit: "" };
  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(params => {
      let id = params.get("id") ?? 0;
      this.fruitService.getFruit(+id).subscribe(data => {
        this.fruit = data;
        this.editStatus = false;
      })
    });
  }

  editFruit() {
    this.fruitService.editFruit(this.fruit?.id, this.fruit).subscribe(data => {
      this.fruit = data;
      this.editStatus = true;
      this.routeService.toHome();
    })
  }

}
