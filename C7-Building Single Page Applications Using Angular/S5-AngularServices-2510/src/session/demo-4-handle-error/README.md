### Demo 4 :: Fruit Fantasy - Handle Error Response

#### Implementation Steps

1. This demo is in continuation to the `demo 3` of this sprint. In this demo, error handling code will be provided to handle error response received while making HTTP requests.
2. To handle error while making `post` request, modify the `add()` method in `add-fruit.component.ts` file as shown below:
    ```typescript
        add() {
            if (this.fruit.name)
            this.fruitService.addFruit(this.fruit).subscribe({
                next: data => {
                this.fruitAdded.emit(this.fruit);
                this.fruit = {};
                },
                error: e => {
                alert("Failed to Add Fruit due to Network Error !! Please Try Again Later");
                }
            });
        }
    ```
3. To handle error while making `get` request, modify the `ngOnit()` method in `fruit-manager.component.ts` file as shown below:
    ```typescript
        ngOnInit(): void {
            this.fruitService.getFruits().subscribe({
            next: data => {
                this.fruits = data;
            },
            error: e => {
                alert("Network Error !! Please Try Again Later");
            }
            });
        }
    ```
4. Also modify the code in `onSearchTextChanged()` method in `FruitManager` component class as shown below:
    ```typescript
    onSearchTextChanged(fruitName: string) {
        this.fruitService.getFruits().subscribe({
        next: data => {
            if (fruitName || fruitName !== '') {
                fruit.name?.includes(fruitName));
            }
            else
                this.fruits = data;
        },
        error: e => {
            alert("Network Error !! Please Try Again Later");
        }
        });
    }
    ```
5. To test for error handling, change the port in request URL in `fruitService` class with an invalid value.
6. Run the code and observe the alert raised with error message on:
    - app launch
        - fetch operations should fail due to invaid port number
    - adding new fruit
        - add operation should fail due to invalid port number