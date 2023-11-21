import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { FruitDetailComponent } from "./fruit-detail/fruit-detail.component";
import { FruitManagerComponent } from "./fruit-manager/fruit-manager.component";
import { LoginComponent } from "./login/login.component";
import { NotFoundComponent } from "./not-found/not-found.component";
import { AuthGuard } from "./services/auth.guard";
import { CanDeactivateGuard } from "./services/can-deactivate.guard";

const routes: Routes = [{
    path: "home",
    component: FruitManagerComponent,
    canActivate: [AuthGuard]
},
{
    path: "fruit-detail/:id",
    component: FruitDetailComponent,
    canActivate: [AuthGuard],
    canDeactivate: [CanDeactivateGuard]
},
{
    path: "",
    redirectTo: "/home",
    pathMatch: "full"
},
{
    path: "login",
    component: LoginComponent
},
{
    path: "**",
    component: NotFoundComponent
}]

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ],
    exports: [RouterModule]
})
export class AppRoutingModule {

}