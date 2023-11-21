import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LandingViewComponent } from './landing-view/landing-view.component';
import { OrderViewComponent } from './order-view/order-view.component';
import { LoginViewComponent } from './login-view/login-view.component';
import { CakeRequestsViewComponent } from './cake-requests-view/cake-requests-view.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { loginGuard } from './guards/login.guard';
import { canDeactivateGuard } from './guards/can-deactivate.guard';

const routes: Routes = [
  {
    path: "home",
    component: LandingViewComponent
  },
  {
    path: "order/:id",
    component: OrderViewComponent,
    canDeactivate: [canDeactivateGuard]
  },
  {
    path: "login",
    component:LoginViewComponent,
  },
  {
    path: "cake-requests",
    component: CakeRequestsViewComponent,
    canActivate: [loginGuard]
  },
  {
    path: "",
    redirectTo: "/home",
    pathMatch: "full"
  },
  {
    path: "**",
    component: PageNotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
