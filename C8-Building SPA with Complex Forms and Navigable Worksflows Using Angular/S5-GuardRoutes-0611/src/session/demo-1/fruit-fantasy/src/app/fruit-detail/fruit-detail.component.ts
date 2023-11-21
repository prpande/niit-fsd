import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Fruit } from '../models/fruit';
import { FruitService } from '../services/fruit.service';
import { RouteService } from '../services/route.service';

@Component({
  selector: 'app-fruit-detail',
  templateUrl: './fruit-detail.component.html',
  styleUrls: ['./fruit-detail.component.css']
})
export class FruitDetailComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute,
    private fruitService: FruitService,
    private routeService: RouteService) { }

  fruit: Fruit = { price: 0, unit: "" };
  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(params => {
      let id = params.get("id") ?? 0;
      this.fruitService.getFruit(+id).subscribe(data => {
        this.fruit = data;
      })
    });
  }

  editFruit() {
    this.fruitService.editFruit(this.fruit?.id, this.fruit).subscribe(data => {
      this.fruit = data;
      this.routeService.toHome();
    })
  }

}
