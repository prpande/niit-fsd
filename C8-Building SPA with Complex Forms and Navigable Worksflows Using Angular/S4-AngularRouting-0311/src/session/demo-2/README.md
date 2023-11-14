### Demo-2 :: Create View to Edit Selected Fruit

#### Implementation Steps

Refer to the following guidelines for modifying the solution code:

1. Update `FruitService` with methods to fetch fruit by id and edit fruit
    - In `fruitService` class, add the method `getFruit()` with `id` as parameter. The method should make HTTP request and fetch fruit for the given id.
    ```ts
        getFruit(id?: number) : Observable<Fruit> {
            return this.http.get<Fruit>(`${this.URL}/${id}`);
        }
    ```
    - In `fruitService` class, add the method `editFuit()` with `id` and `fruit` as parameters. The method should update the fruit object with given id with fruit parameter data.
    ```ts
        editFruit(id?: number, fruit?: Fruit) {
            return this.http.put<Fruit>(`${this.URL}/${id}`,fruit);
        }
    ```
    
2. Add component `Fruit-Detail`
    - The component should display the details of fruit whose id is received from the route.
        - Implement `ngOnInit()` method to read `id` from the route using ActivatedRoute interface in `fruit-detail.component.ts` file
        - Invoke the service method `getFruit(id: number)` and pass the `id` value.
        - The service method returns the data of fruit whose `id` matches with the value of `id` passed.
        - Declare `fruit` property and assign it with the `fruit` object returned by the service method.
        ```ts
            fruit: Fruit = {price: 0, unit: ""} ;
            ngOnInit(): void {
                this.activatedRoute.paramMap.subscribe(params => {
                let id = params.get("id") ?? 0;
                this.fruitService.getFruit(+id).subscribe(data => {
                    this.fruit = data;
                })
                });
            }
        ```
        - The component should have `editFruit()` method defined, that gets invoked when the user clicks on `edit` button.
        ```ts
            editFruit() {
                this.fruitService.editFruit(this.fruit?.id, this.fruit).subscribe(data => {
                this.fruit = data;
                })
            }
        ```
    - Modify the template of `Fruit-Detail` component with following code:
        ```html
            <mat-card mat-ripple [matRippleCentered]="true" class="card-content">
            <img src="../../assets/fruits/{{fruit.name}}.jpg" alt="" width="280px" height="250px">
            <mat-card-content>
                <h4>{{fruit.name}}</h4>
                ${{fruit.price}} per {{fruit.unit}}
                <form id="edit-form">
                    <mat-form-field class="input-field" appearance="legacy">
                        <mat-label>Price ($)</mat-label>
                        <input matInput [(ngModel)]="fruit.price" name="price" type="text" >
                    </mat-form-field>
                    <mat-form-field class="input-field" appearance="legacy">
                        <mat-label>Per Pound / Piece</mat-label>
                        <input matInput [(ngModel)]="fruit.unit" name="unit" type="text" >
                    </mat-form-field>
                </form>
            </mat-card-content>
            <mat-card-actions>
                <button color="accent" mat-icon-button (click)="editFruit()">
                    <mat-icon>edit</mat-icon>
                </button>
                <button color="accent" mat-icon-button>
                    <mat-icon>delete</mat-icon>
                </button>
            </mat-card-actions>
        </mat-card>
        ```
    - Style this component with below CSS code:
        ```css
            .card-content {
                text-align: center;
                margin: auto;
                padding: 12px;
                width: fit-content;
            }
            #edit-form {
                display: flex;
                flex-direction: column;
            }
        ```
2. Define Route to navigate to `Fruit-Detail` component
    - The route to `Fruit-Detail` component should be defined with parameter. The parameter contains the value of `id` of selected fruit.
    - In `AppRoutingModule`, add one more route definition in the routes array.
    ```ts
        const routes: Routes = [{
            path: "home",
            component: FruitManagerComponent
        },
        {
            path: "fruit-detail/:id",
            component: FruitDetailComponent
        }]
    ```
    - In template of `Fruit-Card` component add the `routerLink` attribute to anchor tag and assign it the path value `../fruit-detail/{{fruit.id}}`
    ```html
        <a routerLink="../fruit-detail/{{fruit?.id}}">
            <mat-card mat-ripple [matRippleCentered]="true" class="card-content">
                ...
            </mat-card>
        </a>
    ```
3. Run the app. By default the `Fruit-Manager` component is not loaded and hence only the navigation panel with toolbar is visible. 
    - Click on any of the `home` icon and the `Fruit-Manager` component gets loaded.
    - Select any fruit card and the app should navigate to `Fruit-Detail` component displaying the details of selected fruit with price and unit in editable mode.
    - Make some changes in these fields and click on `edit` button.
    - Click on `home` icon located in toolbar. The app should navigate to `Fruit-Manager` component.
    - Confirm the changes are reflecting in the fruit that was selected.
