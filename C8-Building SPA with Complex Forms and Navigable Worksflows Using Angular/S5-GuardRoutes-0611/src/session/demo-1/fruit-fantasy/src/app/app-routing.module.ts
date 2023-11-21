import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { FruitDetailComponent } from "./fruit-detail/fruit-detail.component";
import { FruitManagerComponent } from "./fruit-manager/fruit-manager.component";
import { LoginComponent } from "./login/login.component";
import { NotFoundComponent } from "./not-found/not-found.component";
import { AuthGuard } from "./services/auth.guard";

const routes: Routes = [{
    path: "home",
    component: FruitManagerComponent,
    canActivate: [AuthGuard]
},
{
    path: "fruit-detail/:id",
    component: FruitDetailComponent,
    canActivate: [AuthGuard]
},
{
    path: "login",
    component: LoginComponent
},
{
    path: "",
    redirectTo: "/home",
    pathMatch: "full"
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