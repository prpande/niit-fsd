import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { FruitDetailComponent } from "./fruit-detail/fruit-detail.component";
import { FruitManagerComponent } from "./fruit-manager/fruit-manager.component";

const routes: Routes = [{
    path: "home",
    component: FruitManagerComponent
},
{
    path: "fruit-detail/:id",
    component: FruitDetailComponent
}]

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ],
    exports: [RouterModule]
})
export class AppRoutingModule {

}