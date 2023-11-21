import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { FruitManagerComponent } from './fruit-manager/fruit-manager.component';
import { FruitListComponent } from './fruit-list/fruit-list.component';
import { FruitCardComponent } from './fruit-card/fruit-card.component';
import { SearchComponent } from './search/search.component';
import { HeaderComponent } from './header/header.component';
import { AddFruitComponent } from './add-fruit/add-fruit.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatGridListModule } from '@angular/material/grid-list';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatExpansionModule } from '@angular/material/expansion';
import { MatRippleModule } from '@angular/material/core';
import { NavigationPanelComponent } from './navigation-panel/navigation-panel.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { MatTooltipModule } from '@angular/material/tooltip';
import { AppRoutingModule } from './app-routing.module';
import { FruitDetailComponent } from './fruit-detail/fruit-detail.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    FruitManagerComponent,
    FruitListComponent,
    FruitCardComponent,
    SearchComponent,
    HeaderComponent,
    AddFruitComponent,
    NavigationPanelComponent,
    FruitDetailComponent,
    NotFoundComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatCardModule,
    MatIconModule,
    MatButtonModule,
    MatInputModule,
    MatGridListModule,
    MatExpansionModule,
    MatRippleModule,
    LayoutModule,
    MatSidenavModule,
    MatListModule,
    AppRoutingModule,
    MatTooltipModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
