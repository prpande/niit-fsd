### Demo 2 :: Fruit Fantasy – Add Fruit

#### Implementation Steps

1. This demo is in continuation to the `demo 3` of `Sprint 3 - Implement Interactions between Angular Components`.
2. Modify the `add-fruit` component's template and style files to create a view that accepts `fruit` details. (Refer to the demo solution code provided for designing and styling)
3. Define property `fruit` of type `Fruit` and implement 2-way binding between component class and template for each of the properties of `fruit` object.
4. In the `add-fruit` component's class, define method `add()` that gets invoked when the `Add` button is clicked.
5. Create service named `fruitService` using the Angular CLI command (given below) and ensure the service class gets created under `services` folder.
    `ng generate service services/fruit` or `ng g s services/fruit`
6. Inject `HttpClient` dependency in `FruitService` class which will be used for making HTTP requests and get `Observable` in return.
7. Run the json-server that serves `fruit` data from `fruits.json` file located under `fruit-fantasy-data` folder.
8. Define string property `URL` and assign it with the request URL for `fruits` API. (`http://localhost:3000/fruits`)
9. Define method `addFruit()` in the `fruitService` class to make `POST` request with the URL defined in `URL` property along with `fruit` data. The `fruit` data will be received by the parameter in `addFruit()` method. The method should return the Observable returned by the `post` method.
10. To consume `fruitService` in `add-fruit` component, inject the service in the constructor of the `add-fruit` component's class.
    ```typescript
    constructor(private fruit: FruitService) { }
    ```
11. In the `add()` method of the component's class, call the `fruitService` method with `fruit` property data and call `subscribe()` method on the observable returned.
12. The `subscribe()` method will have to raise alert with the message `Fruit Added` for the data received as response from the server.
    ```typescript
        add() {
            if (this.fruit.name)
                this.fruitService.addFruit(this.fruit).subscribe(data => {
                    alert("Fruit Added");
                    this.fruit = {};
                });
        }
    ```
13. Run the code, enter fruit details and click on `Add` button.
14. Successful operation should result into an alert being raised by the browser with the message `Fruit Added`.