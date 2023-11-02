### Demo 1 :: Implement Logging Using Angular Service

#### Implementation Steps

1. Create component named `registration` using Angular CLI command.
2. Design registration view by modifying the `registration.component.html` and `registration.component.css` codes. (Refer to the demo solution code provided for designing and styling).
3. The `registration` component should be rendered by `app` component.
4. In the `registration` component's class, define method `register()` that gets invoked when the `Register` button is clicked.
5. Create service named `loggerService` using the Angular CLI command (given below) and ensure the service class gets created under `services` folder.
    `ng generate service services/logger` or `ng g s services/logger`
6. Define methods in `loggerService` class to log messages, debugging details, errors, information on console. (Refer to the solution code for method definitions).
7. To consume `loggerService` in `registration` component, inject the service in the constructor of the `registration` component's class.
    ```typescript
        constructor(private logger: LoggerService) { }
    ```
8. In the `register()` method of the component's class, call the `loggerService` methods to log messages, debugging details, errors, information on console. (Refer to the solution code provided for calling `loggerService` methods).
9. Run the code, enter registration details and click on `Register` button.
10. Open `Console` tab in `developer tools` to check the logs.