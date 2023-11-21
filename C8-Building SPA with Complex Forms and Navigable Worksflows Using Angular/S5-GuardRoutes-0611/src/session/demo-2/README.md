### Demo-2 :: Prevent Losing Unsaved Changes

#### Implementation Steps

Refer to the following guidelines for modifying the solution code:

1. Add `CanDeactivate` route guard using the command
    `ng generate guard can-deactivate` or `ng g g can-deactivate`

    1. The `CanDeactivate` guard should be applied specifically to `FruitDetailComponent`
        - Modify the class definition by replacing `CanDeactivateComponent` with `FruitDetailComponent`
        - The type of `component` parameter in `canDeactivate()` method should be changed to `FruitDetailComponent`
    2. The `canDeactivate()` method should check whether `component` contains definition of `canDeactivate` method
        - if true, the `canDeactivate()` method of `FruitDetailComponent` must be called and its value must be returned.
        ```ts
            return component.canDeactivate ? component.canDeactivate() : true;
        ```
        - if false, value `true` must be returned
    3. Add `CanDeactivateGuard` to `FruitDetail` component in route configuration
        ```ts
            {
                path: "fruit-detail/:id",
                component: FruitDetailComponent,
                canActivate: [AuthGuard],
                canDeactivate: [CanDeactivateGuard]
            }
        ```

2. Refactor `FruitDetail` component to implement confirmation workflow for unsaved edit changes
    1. Add boolean property `editStatus` initialized with value `false`.
    2. Define `canDeactivate()` method that checks for value of `editStatus` property
        - if the value is not true, it should call the JavaScript function `confirm()` to take confirmation from the user for leaving the view with unsaved changes.
        - if the value is true, value `true` must be returned.
        ```ts
              canDeactivate(){
                if(!this.editStatus) {
                    let response = confirm("Changes are not saved. Do you still want to Leave?")
                    return response;
                }
                else
                    return true;
            }
        ```
    3. Set the `editStatus` property to `false` when the component initializes and fetches the fruit for the `id` read from the route
        ```ts
            ngOnInit(): void {
                this.activatedRoute.paramMap.subscribe(params => {
                let id = params.get("id") ?? 0;
                this.fruitService.getFruit(+id).subscribe(data => {
                    this.fruit = data;
                    this.editStatus = false;
                })
                });
            }
        ```
    4. Set the `editStatus` property to `true` in the `editFruit()` method after the changes have been saved at the server
        ```ts
            editFruit() {
                this.fruitService.editFruit(this.fruit?.id, this.fruit).subscribe(data => {
                    this.fruit = data;
                    this.editStatus = true;
                    this.routeService.toHome();
                })
            }
        ```