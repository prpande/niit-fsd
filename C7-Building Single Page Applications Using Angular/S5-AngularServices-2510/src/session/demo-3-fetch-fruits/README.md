### Demo 3 :: Fruit Fantasy – Fetch Fruits

#### Implementation Steps

1. This demo is in continuation to the `demo 2` of this sprint. Till the previous sprint, the fruits data was read from `Fruits` array defined in `Fruits.ts` file. 

    - In this demo, the data will be read from the server.
2. Define method `getFruits()` in `fruitService` class to make `GET` request with the URL defined in `URL` property to fetch fruits data. The method should return the Observable returned by the `get` method.
3. `FruitManager` component should fetch fruits data from server by consuming `fruitService`. To consume the service, inject the service in the constructor of the `FruitManager` component's class.
    ```typescript
        constructor(private fruit: FruitService) { }
    ```
4. The data should be fetched when the component's property gets initialized and hence implement `OnInit` interface lifecycle method `ngOnInit()` to call `getFruits()` method of the `fruitService`.
5. Call the `subscribe()` method on the observable returned by the `getFruits()` method and for the data returned returned with the response, store it in `fruits` property of the `FruitManager` component.
    ```typescript
        ngOnInit(): void {
            this.fruitService.getFruits().subscribe(data => {
            this.fruits = data;
            })
        }
    ```
6. Run the code and this time the fruits data displayed would be the data received with the response received from the server.
7. Also, modify the code for `onSearchTextChanged()` method to refresh data when search text is cleared.
    ```typescript
        onSearchTextChanged(fruitName: string) {
            this.fruitService.getFruits().subscribe({
            next: data => {
                if (fruitName || fruitName !== '') {
                    this.fruits = data.filter(fruit => fruit.name?.includes(fruitName));
                }
                else
                    this.fruits = data;
            }
            });
        }
    ```
8. To update the `fruits` array in `FruitManager` component, the `add-fruit` component must emit event when the fruit data is successfully sent to the server.
    ```typescript
        @Output()
        fruitAdded: EventEmitter<Fruit> = new EventEmitter<Fruit>();
        add() {
            if (this.fruit.name)
                this.fruitService.addFruit(this.fruit).subscribe(data => {
                    alert("Fruit Added");
                    this.fruitAdded.emit(this.fruit); //event emitted
                    this.fruit = {};
                });
        }
    ```
9. The `FruitManager` component must listen to the event emitted by `add-fruit` component and associate an handler that gets invoked when the event is emitted.
    ```html
        <app-add-fruit (fruitAdded) = "onFruitAdded($event)"></app-add-fruit>
    ```
10. Define the handler method `onFruitAdded()` in `FruitManager` component class to push the fruit added to the `Fruits` array.
    ```typescript
        //event handler
        onFruitAdded(fruit: Fruit) {
            this.fruits.push(fruit);
        }
    ```