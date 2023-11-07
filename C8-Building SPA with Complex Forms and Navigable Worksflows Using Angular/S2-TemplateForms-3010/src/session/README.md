## Sprint 2: Develop Interactive Template-Driven Forms Inside SPA

### This sprint has 4 demos

[**Demo 1: Create a User Profile Form**](demo-1-user-form)

Create a simple user profile form using Angular template driven forms to add a new user with details like username, email id and phone. 
Perform the followign steps:
- Create a type “User” in the model folder with “username”, “email”, and “phone” as its properties. 
- Add FormsModule to application root module​ to work with template-driven forms. 
- For using material componnets in the Angular project using the following command: 
    `ng add @angular/material` 
- Add MatInputModule, MatButtonModule and MatToolbarModule to application root module.
- Perform the following steps to create a component “user-form”: 
    - Add a mat-toolbar component with title as "User Profile Form" inside the html file.
    ```html
        <mat-toolbar color="primary">
        <span>User Profile Form</span>
        </mat-toolbar>
    ```
    - Add HTML form element and call the onSubmit() method using event binding.
    ```html
     <form (ngSubmit)="onSubmit()">
    ```  
    - Design a user profile form by defining HTML form fields for username, email, and phone. 
    - Add the “ngModel” directive and the “name” attribute to each form control. For example:
    ```html
       <mat-form-field appearance="legacy">
            <mat-label>UserName</mat-label>
            <input matInput type="text" name="user.username" [(ngModel)]="user.username">
        </mat-form-field>
    ```
    - Declare two buttons—“Submit” and “Cancel”.  
     ```html
    <button color="accent" type="reset" mat-raised-button>Cancel</button>
    <button color="primary" type="submit" mat-raised-button>Submit</button>
    ```
    - On clicking the “Submit” button, the onSubmit() method in .ts file is invoked, which displays a message on form submission.
    ```ts
     onSubmit() {
     alert("User details submitted!!")
     }
    ``` 
    - The “Cancel” button, when clicked, clears the contents in the form field. 
    - To confirm that two-way data binding works for the entire user model, add a new text binding with the json pipe in the template. 
    ```html
     {{user|json}}
     ```
    - Note: Angular pipes are used in template expressions to transform strings, currency amounts, and other data for display. The json pipe serializes data to a string at the top of the component's template.  
     

[**Demo 2: Track Form and Form Control Status in Profile Form**](demo-2-track-user-form-status)

Access the ngForm instance using the local template variable to retrieve the form status of user profile form. ​Provide visual feedback for invalid status of form controls by accessing them using template reference variable and change their appearance.

Perform the following steps:  
- Modify the Demo 1 “user-Profile” form by adding a template reference variable “#userform” to the form.  
- Add the “novalidate” attribute to the form to disable the browser's native form validation. 
```html
 <form (ngSubmit)="onSubmit(userForm)" #userForm="ngForm" novalidate>
```
- Add the required attributes to each form control element. 
- Add a `<mat-hint>` element that contains a suitable message. 
- Show or hide the message by binding the properties of the “username” control to the `<mat-hint>` element’s "hidden" property. 
- Add a conditional  message to the “username” input box.
```html
<input matnput type="text" name="usenname" [(ngModel)]="user.username"
                        #username="ngModel" required>
<mat-hint [hidden]="username.valid || username.pristine">
    User Name is required
</mat-hint>
```
- Repeat steps 5, 6, and 7 for “email” and “phone” form fields. 
- Use the template reference variable “#userform” to bind the form’s “valid” property to the “Submit” button's “disabled” property. 
- Bind the “Cancel” button's “click” event to the form’s resetForm() method. This will clear the form field values and its validations. 
```html
<div>
    <button (click)="userForm.resetForm()" mat-raised-button type="reset">Cancel</button>
    <button [disabled]="userForm.invalid" mat-raised-button type="submit" >Submit</button>
</div>
```
- Add custom CSS styles to the dynamically added CSS classes “ng-valid” and “ng-invalid” to the form controls by the Angular framework. These are used to create a strong visual feedback when the values are invalid. 
```css
.ng-valid[required],
.ng-valid.required {
    border-left: 3px solid #42A948;
}
.ng-invalid:not(form) {
    border-left: 3px solid #a94442;
}
.ng-submitted {
    border: 2px solid indigo;
}
```
- Wrap the entire form in a `<div>` element and bind the element’s "hidden" property to the “UserFormComponent.submitted” property. 
- The main form is visible initially because the submitted property is false until it is submitted. Once the form is submitted, the submitted flag is set to true inside th onSubmit() method and hence the form disappears.
``` ts
 onSubmit(userForm:NgForm) {
    this.submitted = true;
  }
```
- The user profile details are displayed once the form is submitted.
```html
<div [hidden]="!submitted">
    <h2>You submitted the following:</h2>
    <table>
        <tr>
            <td>User Name: </td>
            <td>{{user.username }}</td>
        </tr>
        <tr>
            <td>Email: </td>
            <td>{{ user.email }}</td>
        </tr>
        <tr>
            <td>Phone: </td>
            <td>{{ user.phone }}</td>
        </tr>
    </table>
</div>
```  
- Run the application using the `ng-serve` command. 
- Open the browser's developer console and inspect the `<input>` element that represents the username to observe the various form control states and see how the classes are added and removed by the Angular framework. 
- Check that the form submit button is disabled when the field values are “touched”, “dirty”, and “invalid”. 
- Check that when all the required fields are in “valid” state, the submit button is enabled and an alert message is displayed on successful form submission. 

[**Demo 3: Add Fruit Form in Fruit Fantasy App**](demo-3-add-fruit-form)

Modify the add fruit form created in the previous sprint to have various form fields like fruit name, price, unit, nutrients and benefits.​

Add ngForm, ngModel directives to the add fruit form to access its properties and understand the data flow in template-driven forms.

Perform the following steps:  

- In continuation with the fruit fantasy demo created in the previous sprint, modify the “add fruit” form. 
- Add FormsModule in the application root module to enable the forms feature. 
- Modify the form by adding a template reference variable “#addForm” to the form. 
- Add the “novalidate” attribute to the form to disable the browser’s native form validation. 
```html
  <form (ngSubmit)="onSubmit(addForm)" #addForm="ngForm" novalidate>
```
- Add the “name” attribute to each form element that Angular uses to register the element with the parent `<form>`.  
- Add the “ngModel” directive to each form control element to bind the controls with data model properties that use a two-way binding syntax. 
```html
<input matInput name="fruitname" [(ngModel)]="fruit.name" type="text" placeholder="Name">
```
- Add fields such as “nutrients” and “benefits” to the form. 
- Declare array “nutrients” and “benefits” in the .ts file as properties to be able to populate the “nutrients” and “benefits” field values in the form. 
- Use the `<mat-select>` element to create a drop-down list for “nutrients” and “benefits” values.​ 
- Use the “*ngFor” directive with `<mat-option>` to load the list of “nutrients” and “benefits” values. 
```html
        <mat-form-field appearance="fill">
            <mat-label>Nutrients</mat-label>
            <mat-select id="nutrient" name="nutrient" [(ngModel)]="fruit.nutrients" multiple>
                <mat-option *ngFor="let nutrient of nutrients" [value]="nutrient">{{nutrient}}</mat-option>
            </mat-select>
        </mat-form-field>
```
- Add `<button>` of type “submit” to enable form submission.​ 
```html
    <button color="primary" mat-fab type="submit">
        <mat-icon>add</mat-icon>
    </button>
```
- Define the constructor to create a “MatSnackBar” instance:​ 
  ```ts 
    constructor (private _snackBar: MatSnackBar){ } 
- Successful form submission should result in a “Fruits added successfully” message and an unsuccessful submission should result in a “Failed to add fruit due a network error!! Please try again later” message. Inside the `onSubmit()` method, the service method is used to store the captured form details in the json server.  

[**Demo 4: Add Validators in Fruit Fantasy App**](demo-4-validate-fruit-form)

Add Built-in validators like required, minlength and pattern to add fruit form to validate various form control elements. Display custom error messages for each of the invalid status of form controls.

Perform the following steps;

- In continuation with demo 3, add validation to each form field. 
- Add a template reference variable to each form field to access the form control within the template. 
- Use this reference variable to check the control state for its errors.
- Use `*ngIf` on the `<mat-error>` element to display multiple error messages.

```html
    <input matInput name="fruitname" required minlength="3" [(ngModel)]="fruit.name" type="text" #fruitname="ngModel" placeholder="Name">
    <mat-error *ngIf="fruitname.errors?.required">
        Fruit name is required
    </mat-error>
    <mat-error *ngIf="fruitname.errors?.minlength">
        Fruit name minimum length is {{fruitname.errors?.minlength?requiredLength}}
    </mat-error>
    
```
- Disable the Submit button by adding the “disabled” attribute when the form status is invalid. 
```html
    <button color="primary" mat-raised-button type="submit" [disabled]="!addForm.valid">
        Add
    </button>
```
- Execute the application to see custom validation error messages getting displayed for various invalid status of form controls.