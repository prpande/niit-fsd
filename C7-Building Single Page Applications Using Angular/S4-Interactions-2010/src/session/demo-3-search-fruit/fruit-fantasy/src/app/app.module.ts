import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FruitManagerComponent } from './fruit-manager/fruit-manager.component';
import { FruitListComponent } from './fruit-list/fruit-list.component';
import { FruitCardComponent } from './fruit-card/fruit-card.component';
import { SearchComponent } from './search/search.component';
import { IconComponent } from './icon/icon.component';
import { HeaderComponent } from './header/header.component';
import { AddFruitComponent } from './add-fruit/add-fruit.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    FruitManagerComponent,
    FruitListComponent,
    FruitCardComponent,
    SearchComponent,
    IconComponent,
    HeaderComponent,
    AddFruitComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
