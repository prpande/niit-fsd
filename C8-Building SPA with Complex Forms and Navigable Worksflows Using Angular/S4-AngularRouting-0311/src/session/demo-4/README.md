### Demo-4 :: Enable Navigation from Fruit-Detail to Home View

#### Implementation Steps

Refer to the following guidelines for modifying the solution code:

1. Add `RouteService` to enable programmatic navigation
    - Create Angular Service with name `RouteService`.
    - Inject Angular `Route` service in `RouteService`
    - Add method `toHome()` in the `RouteService`
    - Call the `navigate()` method of the `Route` service.
    - Pass an array with string that matches the path URL ("" or "home") to route to home view
        ```ts
            toHome() {
                this.routerService.navigate([""]);
            }
        ```
2. Navigate from `Fruit-Detail` component to home view post edit operation.
    - Inject `RouteService` in `Fruit-Detail` component.
    - Inside `editFruit()` method, call the `toHome()` method of `RouteService` post getting response for edit request.
    ```ts
        editFruit() {
            this.fruitService.editFruit(this.fruit?.id, this.fruit).subscribe(data => {
                this.fruit = data;
                this.routeService.toHome();
            })
        }
    ```