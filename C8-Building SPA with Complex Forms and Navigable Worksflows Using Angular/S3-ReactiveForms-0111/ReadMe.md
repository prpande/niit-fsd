<!-- omit in toc -->
# Develop Interactive Reactive Forms Inside SPA - 01/11

Reactive Forms in Angular provide a more flexible and dynamic approach to handling forms compared to Template-Driven Forms.

<!-- omit in toc -->
## Content

- [Setting Up Reactive Forms](#setting-up-reactive-forms)
- [1. FormControl](#1-formcontrol)
- [2. FormGroup](#2-formgroup)
- [3. FormBuilder](#3-formbuilder)
- [4. FormArray](#4-formarray)
- [5. Reactive Form in HTML](#5-reactive-form-in-html)
- [6. Form Validation](#6-form-validation)
- [7. Dynamic Forms](#7-dynamic-forms)
- [8. Form Submission](#8-form-submission)
- [9. Reactive Form Events](#9-reactive-form-events)
- [Putting It All Together Example Component](#putting-it-all-together-example-component)
- [Validator Functions in Angular](#validator-functions-in-angular)
  - [1. Built-in Validators](#1-built-in-validators)
    - [a. Required Validator](#a-required-validator)
    - [b. MinLength and MaxLength Validators](#b-minlength-and-maxlength-validators)
    - [c. Pattern Validator](#c-pattern-validator)
  - [2. Custom Validators](#2-custom-validators)
  - [3. Asynchronous Validators](#3-asynchronous-validators)
  - [4. Validator Composition](#4-validator-composition)

## Setting Up Reactive Forms

To start working with Reactive Forms in Angular, you need to import the `ReactiveFormsModule` in your application module.

```typescript
// app.module.ts
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  imports [ReactiveFormsModule],
  // ...
})
export class AppModule {}
```

Now, let's delve into the key concepts and features of Reactive Forms.

## 1. FormControl

A `FormControl` is the basic building block of Reactive Forms. It represents an individual form control, such as an input field or a checkbox.

```typescript
// Creating a FormControl
import { FormControl } from '@angular/forms';

const usernameControl = new FormControl('JohnDoe');
```

## 2. FormGroup

A `FormGroup` is a collection of `FormControl` instances that represents a form. It allows you to organize form controls into a single object.

```typescript
// Creating a FormGroup
import { FormGroup, FormControl } from '@angular/forms';

const userForm = new FormGroup({
  username new FormControl('JohnDoe'),
  password new FormControl(''),
});
```

## 3. FormBuilder

The `FormBuilder` service simplifies the creation of `FormGroup` instances by providing convenient methods.

```typescript
// Using FormBuilder
import { FormBuilder } from '@angular/forms';

const formBuilder = new FormBuilder();

const userForm = formBuilder.group({
  username ['JohnDoe'],
  password [''],
});
```

## 4. FormArray

A `FormArray` is similar to `FormGroup` but represents an array of form controls. It's useful when dealing with dynamic forms with a variable number of controls.

```typescript
// Creating a FormArray
import { FormArray, FormControl } from '@angular/forms';

const hobbiesArray = new FormArray([
  new FormControl('Reading'),
  new FormControl('Gaming'),
]);
```

## 5. Reactive Form in HTML

Bind the Reactive Form controls to your HTML template using the `formControlName` directive.

```html
<!-- Example Using Reactive Form in HTML -->
<form [formGroup]="userForm" (ngSubmit)="onSubmit()">
  <label for="username">Username</label>
  <input type="text" id="username" formControlName="username" />

  <label for="password">Password</label>
  <input type="password" id="password" formControlName="password" />

  <button type="submit">Submit</button>
</form>
```

## 6. Form Validation

Reactive Forms provide built-in validators and the ability to create custom validators for form controls.

```typescript
// Example Adding Validators to FormControls
import { Validators } from '@angular/forms';

const userForm = new FormGroup({
  username new FormControl('', [Validators.required, Validators.minLength(3)]),
  password new FormControl('', Validators.required),
});
```

## 7. Dynamic Forms

Reactive Forms shine when dealing with dynamic forms. You can dynamically add or remove form controls as needed.

```typescript
// Example Dynamically Adding FormControls
import { FormArray, FormControl } from '@angular/forms';

const hobbiesArray = new FormArray([]);

addHobby(hobby string) void {
  this.hobbiesArray.push(new FormControl(hobby));
}
```

## 8. Form Submission

Handle form submission by subscribing to the `valueChanges` observable of the form.

```typescript
// Example Handling Form Submission
onSubmit() void {
  console.log('Form submitted', this.userForm.value);
}
```

## 9. Reactive Form Events

Reactive Forms provide various events like `valueChanges` and `statusChanges` that you can subscribe to for dynamic updates and real-time validation.

```typescript
// Example Subscribing to Form Changes
this.userForm.valueChanges.subscribe(value => {
  console.log('Form value changed', value);
});

this.userForm.statusChanges.subscribe(status => {
  console.log('Form status changed', status);
});
```

## Putting It All Together Example Component

Let's put these concepts together in an example Angular component.

```typescript
// app.component.ts
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector 'app-root',
  template `
    <form [formGroup]="userForm" (ngSubmit)="onSubmit()">
      <label for="username">Username</label>
      <input type="text" id="username" formControlName="username" />

      <label for="password">Password</label>
      <input type="password" id="password" formControlName="password" />

      <button type="submit">Submit</button>
    </form>
  `,
})
export class AppComponent {
  userForm FormGroup;

  constructor(private formBuilder FormBuilder) {
    this.userForm = this.formBuilder.group({
      username ['', [Validators.required, Validators.minLength(3)]],
      password ['', Validators.required],
    });
  }

  onSubmit() void {
    console.log('Form submitted', this.userForm.value);
  }
}
```

## Validator Functions in Angular

Validator functions are used to perform validation on form controls, ensuring that the data entered by the user meets certain criteria. Angular provides a set of built-in validators, and you can also create custom validators.

### 1. Built-in Validators

Angular offers several built-in validators that you can apply to form controls.

#### a. Required Validator

The `Validators.required` validator ensures that a form control has a non-empty value.

```typescript
// Adding Required Validator
import { Validators } from '@angular/forms';

const userForm = new FormGroup({
  username new FormControl('', Validators.required),
  // ...
});
```

#### b. MinLength and MaxLength Validators

Use `Validators.minLength` and `Validators.maxLength` to enforce a minimum and maximum length for a form control.

```typescript
// Adding MinLength and MaxLength Validators
const userForm = new FormGroup({
  username new FormControl('', [Validators.minLength(3), Validators.maxLength(10)]),
  // ...
});
```

#### c. Pattern Validator

The `Validators.pattern` validator enforces a specific pattern using a regular expression.

```typescript
// Adding Pattern Validator
const userForm = new FormGroup({
  username new FormControl('', Validators.pattern(/^[a-zA-Z0-9]+$/)),
  // ...
});
```

### 2. Custom Validators

You can create custom validator functions to implement complex validation logic.

```typescript
// Custom Validator Function
function forbiddenUsernameValidator(forbiddenUsernames string[]) {
  return (control FormControl) { [key string] any } | null => {
    const forbidden = forbiddenUsernames.includes(control.value);
    return forbidden ? { 'forbiddenUsername' { value control.value } }  null;
  };
}

// Using Custom Validator
const userForm = new FormGroup({
  username new FormControl('', [Validators.required, forbiddenUsernameValidator(['admin', 'root'])]),
  // ...
});
```

### 3. Asynchronous Validators

For asynchronous validation tasks, you can create async validators that return promises or observables.

```typescript
// Asynchronous Validator Function
function asyncUsernameValidator() AsyncValidatorFn {
  return (control AbstractControl) Promise<ValidationErrors | null> | Observable<ValidationErrors | null> => {
    return of({ 'asyncError' true }).pipe(delay(1000));
  };
}

// Using Asynchronous Validator
const userForm = new FormGroup({
  username new FormControl('', [Validators.required], [asyncUsernameValidator()]),
  // ...
});
```

### 4. Validator Composition

You can compose multiple validators using the `Validators.compose` function.

```typescript
// Combining Validators
const userForm = new FormGroup({
  username new FormControl('', Validators.compose([Validators.required, Validators.minLength(3)])),
  // ...
});
```
