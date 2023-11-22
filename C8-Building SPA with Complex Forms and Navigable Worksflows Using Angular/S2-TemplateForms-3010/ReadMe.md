<!-- omit in toc -->
# Developing Interactive Template-Driven Forms Inside SPA - 30/10

<!-- omit in toc -->
## Content

- [Setting Up a Template-Driven Form](#setting-up-a-template-driven-form)
- [NgModel Directive](#ngmodel-directive)
- [Form Submission](#form-submission)
- [Form Validation](#form-validation)
- [NgForm and NgModelGroup](#ngform-and-ngmodelgroup)
- [Control Status and CSS Classes](#control-status-and-css-classes)
- [Form Controls](#form-controls)
- [ngModelChange](#ngmodelchange)
- [Disabling the Submit Button](#disabling-the-submit-button)
- [Putting It All Together Example Component](#putting-it-all-together-example-component)
- [Best Practices](#best-practices)

## Setting Up a Template-Driven Form

To get started with a Template-Driven Form in Angular, you need to import the `FormsModule` in your application module.

```typescript
// app.module.ts
import { FormsModule } from '@angular/forms';

@NgModule({
  imports [FormsModule],
  // ...
})
export class AppModule {}
```

Now, let's delve into the key concepts and features of Template-Driven Forms.

## NgModel Directive

The `ngModel` directive is a fundamental part of Template-Driven Forms. It establishes a two-way data binding between the form control and the associated model.

```html
<!-- Example Text Input with ngModel -->
<input type="text" name="username" [(ngModel)]="user.username" />
```

## Form Submission

To handle form submission, you can use the `(ngSubmit)` event and call a method in your component.

```html
<!-- Example Form with ngSubmit -->
<form (ngSubmit)="onSubmit()">
  <!-- Form controls go here -->
  <button type="submit">Submit</button>
</form>
```

## Form Validation

Template-Driven Forms support both built-in and custom validations. Use HTML5 validation attributes or Angular directives like `required` and `pattern`.

```html
<!-- Example Required Input with Validation -->
<input type="text" name="username" [(ngModel)]="user.username" required />
<div *ngIf="!user.username">Username is required</div>
```

## NgForm and NgModelGroup

`NgForm` and `NgModelGroup` are directives that help in organizing and validating forms. `NgForm` represents the entire form, while `NgModelGroup` groups related form controls.

```html
<!-- Example Using NgForm and NgModelGroup -->
<form #myForm="ngForm" (ngSubmit)="onSubmit(myForm)">
  <div ngModelGroup="user">
    <input type="text" name="username" [(ngModel)]="user.username" required />
    <input type="password" name="password" [(ngModel)]="user.password" required />
  </div>
  <button type="submit">Submit</button>
</form>
```

## Control Status and CSS Classes

Angular automatically adds CSS classes to form controls based on their validation status. You can use these classes for styling and customization.

```html
<!-- Example Styling Based on Control Status -->
<input type="text" name="username" [(ngModel)]="user.username" required />
<div *ngIf="!user.username" class="error-message">Username is required</div>
```

## Form Controls

Template-Driven Forms support various form controls, such as text inputs, checkboxes, radio buttons, and more. Each form control can have its own set of validations.

```html
<!-- Example Checkbox and Radio Button -->
<input type="checkbox" name="subscribe" [(ngModel)]="user.subscribe" />
<input type="radio" name="gender" value="male" [(ngModel)]="user.gender" />
<input type="radio" name="gender" value="female" [(ngModel)]="user.gender" />
```

## ngModelChange

The `ngModelChange` event allows you to execute a function when the value of an input changes.

```html
<!-- Example ngModelChange -->
<input type="text" name="username" [(ngModel)]="user.username" (ngModelChange)="onUsernameChange()" />
```

## Disabling the Submit Button

You can disable the submit button until the form is valid using the `ngModel` status.

```html
<!-- Example Disabling Submit Button -->
<button type="submit" [disabled]="myForm.invalid">Submit</button>
```

## Putting It All Together Example Component

Let's bring together these concepts into an example component.

```typescript
// app.component.ts
import { Component } from '@angular/core';

@Component({
  selector 'app-root',
  template `
    <form #myForm="ngForm" (ngSubmit)="onSubmit(myForm)">
      <div ngModelGroup="user">
        <input type="text" name="username" [(ngModel)]="user.username" required />
        <div *ngIf="!user.username" class="error-message">Username is required</div>

        <input type="password" name="password" [(ngModel)]="user.password" required />
        <div *ngIf="!user.password" class="error-message">Password is required</div>
      </div>

      <input type="checkbox" name="subscribe" [(ngModel)]="user.subscribe" />

      <input type="radio" name="gender" value="male" [(ngModel)]="user.gender" />
      <input type="radio" name="gender" value="female" [(ngModel)]="user.gender" />

      <button type="submit" [disabled]="myForm.invalid">Submit</button>
    </form>
  `,
  styles [`
    .error-message {
      color red;
    }
  `]
})
export class AppComponent {
  user = { username '', password '', subscribe false, gender '' };

  onSubmit(form any) void {
    console.log('Form submitted', form.value);
  }
}
```

## Best Practices

1. Keep Forms Simple
   - Break down complex forms into smaller, manageable components.

2. Use Reactive Forms for Complex Scenarios
   - For forms with dynamic controls or complex validation logic, consider using reactive forms.

3. Leverage Form Controls
   - Utilize form controls for additional functionalities like disabling, enabling, or resetting individual controls.

4. Handle Async Operations Carefully
   - Be mindful of handling async operations, ensuring proper error handling and unsubscribing from observables.

5. Optimize Validation Messages
   - Display validation messages only when the user interacts with the form controls to avoid unnecessary distractions.
