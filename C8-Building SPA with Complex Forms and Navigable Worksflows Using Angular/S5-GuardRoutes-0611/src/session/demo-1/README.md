### Demo-1 :: Prevent Unauthenticated Access in Fruit-Fantasy apps

#### Implementation Steps

Refer to the following guidelines for modifying the solution code:

1. Add `authentication` service using the command

        `ng generate service services/auth` or `ng g s services/auth`
    1. In `AuthService` class add boolean property `isLogged` and initialize it with value `false`.
    2. In `AuthService` class add method `login()` method that assigns value `true` to `isLoggedIn` property.
    3. In `AuthService` class add method `logout()` method that assigns value `false` to `isLoggedIn` property.
2. Add `Login` component to the `Fruit-Fantasy` app
    1. In `AppRoutingModule`, to the `Routes` array, add route definition for routing to `LoginComponent`
        ```ts
            {
                path: "login",
                component: LoginComponent
            }
        ```
    2. In the `RouteService` add method `toLogin()` that allows navigation to `login` view.
        ```ts
            toLogin() {
                this.routerService.navigate(["login"]);
            }
        ```
    3. Add `AuthService` and `RouteService` to the `Login` component
    4. Define string property `vendorCode` to the `Login` component and initialize it with empty string.
    5. Define Output property `loggedIn` of type EventEmitter.
        ```ts
            vendorCode: string = "";
            @Output() 
            loggedIn: EventEmitter<boolean> = new EventEmitter<boolean>(false);
        ```
    6. Add `validateVendorCode()` method to validate the inputted `vendorCode` value.
        - if the code is valid (use any hardcoded value to validate vendor code)
            - call the `login()` method of `AuthService` 
            - call the `toHome()` method of `RouteService` to navigate user to `Fruit-Manager` view.
            - emit `loggedIn` event with value `true`
        ```ts
            validateVendorCode() {
                if(this.vendorCode === "VEN22022022") {
                this.authService.login();
                this.loggedIn.emit(true);
                this.fruitRouterService.toHome();
                }
            }
        ```
    6. In the template of `Login` component add an input field to accept vendor code and a button which calls the `validateVendorCode()` method when clicked. (User Angular Material components for designing `login` view)
        ```html
            <div id="vendor-form">
                <mat-form-field appearance="legacy">
                    <mat-label>Enter Vendor Code</mat-label>
                    <input type="text" name="vendorCode" placeholder="Vendor Code" [(ngModel)]="vendorCode" matInput>
                </mat-form-field>
                <button type="submit" mat-flat-button (click)="validateVendorCode()">Submit</button>
            </div>
        ```
3.  Add `CanActivate` route guard using the command

        `ng generate guard services/auth` or `ng g g services/auth`

    1. In `AuthGuard` class implement `canActivate()` method of `CanActivate` guard interface.
    2. Inject `AuthService` and `RouteService` to the `AuthGuard`
    3. The `canActivate()` method should check the value of `isLoggedIn` property of `AuthService`
        - if the value of `isLoggedIn` property is true, `canActivate()` method should return true.
        - if the value of `isLoggedIn` property is false,
        `canActivate()` method should call `toLogin()` method of `RouteService` and return `false`.
        ```ts
            canActivate(
                route: ActivatedRouteSnapshot,
                state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
                if(this.authService.isLoggedIn)
                    return true;
                else {
                    this.routeService.toLogin();
                    return false;
                }      
            }
        ```
4. Add `CanActivate` route guard to route with path `home` and `fruit-detail/:id` in the `app-routing.module.ts` file 
    ```ts
        const routes: Routes = [{
            path: "home",
            component: FruitManagerComponent,
            canActivate: [AuthGuard]
        },
        {
            path: "fruit-detail/:id",
            component: FruitDetailComponent
        },
        {
            path: "login",
            component: LoginComponent,
            canActivate: [AuthGuard]
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
5. Add login / logout links
    1. In `Header` component add Input property `loggedIn` of type boolean with initial value set to `false`.
        ```ts
            @Input()
            loggedIn: boolean = false;
        ```
    2. Inject `AuthService` and `RouteService` in this component
    3. Define `logout()` method that allows user to logout and redirect back to `login` view
        ```ts
            logout() {
                this.authService.logout();
                this.loggedIn = this.authService.isLoggedIn;
                this.routerService.toLogin();
            }
        ```
    4. In the template of `Header` component add 2 `mat-icon` components, one for login and one for logout
        - Use *ngIf to display any of them at at time.
        - The `login` icon when clicked should navigate user to `login` view.
        - The `logout` icon when clicked should call the `logout()` method
        ```html
            <div color="primary" id="header">
                <h2>Fruit Fantasy - Vendor View</h2>
                <div id="icons">
                    <a routerLink="../home">
                        <mat-icon>home</mat-icon>
                    </a>
                    <mat-icon *ngIf="loggedIn!==true" matTooltip="login" routerLink="login">login</mat-icon>
                    <mat-icon *ngIf="loggedIn===true" matTooltip="logout" (click)="logout()">logout</mat-icon>
                    <mat-icon>settings</mat-icon>
                </div>
            </div>
        ```
6. Refactor `Navigation-Panel` component to handle the login / logout actions
    1. Declare boolean property `isLoggedIn` with initial value set to `false`.
    2. Add `onLoggedIn()` method that modifies the value of `isLoggedIn` property based on the component navigated.
        - If `Navigation-Panel` loads `LoginComponent`, `isLoggedIn` property takes the value `true`, otherwise `false`.
        ```ts
            onLoggedIn($event: any) {
                this.isLoggedIn = !($event instanceof LoginComponent);
            }
        ```
    3. In the template of `Navigation-Panel` component, bind the `loggedIn` property of `Header` component with the `isLoggedIn` property of `Navigation-Panel` component
        ```html
            <app-header [loggedIn]=isLoggedIn></app-header>
        ```
    4. The router-outlet should call the `onLoggedIn()` method every time `activate` event is fired
        ```html
            <router-outlet (activate)="onLoggedIn($event)"></router-outlet>
        ```
