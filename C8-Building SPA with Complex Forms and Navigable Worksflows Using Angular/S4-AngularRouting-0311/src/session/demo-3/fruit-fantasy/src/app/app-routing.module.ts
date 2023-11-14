import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { FruitDetailComponent } from "./fruit-detail/fruit-detail.component";
import { FruitManagerComponent } from "./fruit-manager/fruit-manager.component";
import { NotFoundComponent } from "./not-found/not-found.component";

const routes: Routes = [{
    path: "home",
    component: FruitManagerComponent
},
{
    path: "fruit-detail/:id",
    component: FruitDetailComponent
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