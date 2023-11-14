import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { FruitManagerComponent } from "./fruit-manager/fruit-manager.component";

const routes: Routes = [{
    path: "home",
    component: FruitManagerComponent
}]

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ],
    exports: [RouterModule]
})
export class AppRoutingModule {

}