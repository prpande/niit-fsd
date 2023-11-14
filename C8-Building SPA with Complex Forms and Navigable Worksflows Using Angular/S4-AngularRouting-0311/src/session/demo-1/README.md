### Demo-1 :: Enable Routing in Fruit-Fantasy

#### Implementation Steps

Refer to the following guidelines for modifying the solution code:

1. Import `RouterModule` and `Routes` type
    - Create new file with the name `app-routing.module.ts`
    - Add class `AppRoutingModule` in this file.
    - Decorate the class with `@NgModule` decorator.
    - Import `RouterModule` and `Routes` type from `@angular/router` module.
2. Define Routes
    - In `app-routing.module.ts` file declare const `routes` of type `Routes`.
    - Assign array of objects to the `routes` constant.
        - Each object in the array will contain 
            - `path` property
                - The value of this property is a string that matches the URL in the browser address bar
            - `component` property
                -  The value of this property is the component that the router should create when navigating to this route.
        - To map the `home` URL with `FruitManagerComponent`, the first object of this array will contain following value:
        ```ts
            {
                path: "home",
                component: FruitManagerComponent
            }
        ```
    - In the `imports` property of `@NgModule` metadata object, call the `forRoot()` on the `RouterModule`. The method should take `routes` constant as its parameter.
    - Add the `RouterModule` to the list of `exports` in the `@NgModule` metadata object.
    ```ts
        @NgModule({
            imports: [
                RouterModule.forRoot(routes)
            ],
            exports: [RouterModule]
        })
        export class AppRoutingModule {
        }
    ```
3. Add routes to the application
    - In `app.module.ts` file, import `AppRoutingModule` and add it to the `imports` list of metadata object of `@NgModule()`. 
    - In `navigation-panel.component.html` file, replace the selector `<app-fruit-manager>` with `<router-outlet>`
    - Modify the first anchor tag located in `<mat-nav-list>` to create link for `Fruit-Manager` component
    ```html
        <a routerLink="../home" mat-list-item href="#">Home</a>
    ```
    - In the `header.component.html` file, under the `div` element with id `icons` wrap the Material Icon selector for `home` with anchor tag. This tag will also create a link for `Fruit-Manager` component.
    ```html
        <div id="icons">
            <a routerLink="../home"><mat-icon>home</mat-icon></a>
            <mat-icon>settings</mat-icon>
        </div>
    ```
4. Run the app. By default the `Fruit-Manager` component is not loaded and hence only the navigation panel with toolbar is visible. Click on any of the `home` icon and the `Fruit-Manager` component gets loaded.
