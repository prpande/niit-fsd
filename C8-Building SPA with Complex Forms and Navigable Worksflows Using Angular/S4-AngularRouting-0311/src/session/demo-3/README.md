### Demo-3 :: Configure Wild Card Routes and Route Redirects in Fruit-Fantasy App

#### Implementation Steps

Refer to the following guidelines for modifying the solution code:

1. Setting up redirects
    - Update the route definition in `AppRoutingModule` to set up redirect to `/home`
    ```ts
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
        }]
    ```
    - Run the app and observe the app launches with `Fruit-Manager` component. The route URL shows the path `/home`
2. Setting up Wild Card Route
    - Create `Not-Found` component 
    - Add the following code in template of `Not-Found` component
    ```html
        <mat-card id="message">
            <mat-card-title>
                <h1>Page Not Found</h1>
                <h2>Invalid URL !!</h2>
            </mat-card-title>
            <mat-card-subtitle>
                <a routerLink="../home">Back to Home</a>
            </mat-card-subtitle>
        </mat-card>
    ```
    - Style the `Not-Found` component with style code given below:
    ```css
        #message {
            display: flex;
            flex-direction: column;
            width: 300px;
            text-align: center;
            margin: auto;
            margin-top: 40px;
        }

        a {
            color: #c2185b;
        }
    ```
    - Update the route definition in `AppRoutingModule` to set up wild card route.
    ```ts
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
    ```
    - Run the app and type some invalid URL in browser. The app should redirect to `Not-Found` component.
