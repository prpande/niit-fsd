<!-- omit in toc -->
# Develop SPA using Angular Components - 16/10

<!-- omit in toc -->
## Contents

- [Multi-page Applications (MPA) vs Single-page Applications (SPA)](#multi-page-applications-mpa-vs-single-page-applications-spa)
- [Building Project with Angular CLI](#building-project-with-angular-cli)
  - [Getting Started with Angular CLI](#getting-started-with-angular-cli)
    - [Installation](#installation)
    - [Creating a New Project](#creating-a-new-project)
    - [Project Structure](#project-structure)
  - [Key Concepts in Angular](#key-concepts-in-angular)
    - [Components](#components)
    - [Modules](#modules)
    - [Services](#services)
    - [Directives](#directives)
  - [Section 3: Angular CLI Features and Nuances](#section-3-angular-cli-features-and-nuances)
    - [3.1 Generating Components and Services](#31-generating-components-and-services)
    - [Building and Serving](#building-and-serving)
    - [Testing](#testing)
- [Angular Components](#angular-components)
  - [Anatomy of an Angular Component](#anatomy-of-an-angular-component)
    - [Component Definition](#component-definition)
    - [Component Lifecycle Hooks](#component-lifecycle-hooks)
  - [Component Communication](#component-communication)
    - [Input Properties](#input-properties)
    - [Output Properties and EventEmitter](#output-properties-and-eventemitter)
  - [Component Templating and Styling](#component-templating-and-styling)
    - [Template Binding](#template-binding)
    - [ngFor and ngIf Directives](#ngfor-and-ngif-directives)
  - [Component Dependency Injection](#component-dependency-injection)
- [Angular Project Structure](#angular-project-structure)
  - [`src` Directory](#src-directory)
  - [Application Code Structure](#application-code-structure)
    - [`app` Directory](#app-directory)
    - [Components files](#components-files)
    - [Services files](#services-files)
  - [Configuration Files](#configuration-files)
    - [`angular.json`](#angularjson)
    - [`tsconfig.json`](#tsconfigjson)
  - [Build and Configuration](#build-and-configuration)
    - [`node_modules`](#node_modules)
    - [`package.json`](#packagejson)
  - [Testing files](#testing-files)
    - [`karma.conf.js` and `tsconfig.spec.json`](#karmaconfjs-and-tsconfigspecjson)
    - [`e2e` Directory](#e2e-directory)
- [Interpolation and Property Binding](#interpolation-and-property-binding)
  - [Understanding Interpolation](#understanding-interpolation)
    - [What is Interpolation?](#what-is-interpolation)
    - [Using Interpolation for Data Binding](#using-interpolation-for-data-binding)
    - [Handling Expressions](#handling-expressions)
  - [Unveiling Property Binding](#unveiling-property-binding)
    - [What is Property Binding?](#what-is-property-binding)
    - [Binding to HTML Properties](#binding-to-html-properties)
    - [Dynamic Styling with Property Binding](#dynamic-styling-with-property-binding)
  - [Combining Interpolation and Property Binding](#combining-interpolation-and-property-binding)
    - [Creating Dynamic URLs](#creating-dynamic-urls)
    - [Reacting to User Events](#reacting-to-user-events)
  - [Best Practices and Considerations](#best-practices-and-considerations)
    - [Escaping HTML](#escaping-html)
    - [Handling Null and Undefined](#handling-null-and-undefined)
- [Event Binding in Angular](#event-binding-in-angular)
  - [Basics of Event Binding](#basics-of-event-binding)
    - [What is Event Binding?](#what-is-event-binding)
    - [Syntax of Event Binding](#syntax-of-event-binding)
  - [Responding to User Actions](#responding-to-user-actions)
    - [Handling Click Events](#handling-click-events)
    - [Keyboard Events](#keyboard-events)
    - [Mouse Events](#mouse-events)
  - [Passing Data with Events](#passing-data-with-events)
    - [Using Event Payloads](#using-event-payloads)
- [Two-Way Binding with `ngModel`](#two-way-binding-with-ngmodel)
  - [Basics of Two-Way Binding](#basics-of-two-way-binding)
    - [What is Two-Way Binding?](#what-is-two-way-binding)
    - [Enabling Two-Way Binding with ngModel](#enabling-two-way-binding-with-ngmodel)
  - [NgModel Properties and Features](#ngmodel-properties-and-features)
    - [Binding to Different Properties](#binding-to-different-properties)
    - [Using ngModelChange Event](#using-ngmodelchange-event)
    - [NgModel Directive with Template Reference Variable](#ngmodel-directive-with-template-reference-variable)
  - [Handling Forms with ngModel](#handling-forms-with-ngmodel)
    - [Form Validation](#form-validation)

## Multi-page Applications (MPA) vs Single-page Applications (SPA)

Multi-page Applications (MPA) and Single-page Applications (SPA) represent distinct architectural patterns for organizing and delivering web content. The primary difference lies in how these applications handle navigation and user interactions.

1. **Architecture:**

   - **Multi-page Applications (MPA):**
     MPAs follow a traditional web architecture where each page corresponds to a separate HTML file. When users navigate between pages, the server sends a request, and a new HTML page is loaded. This process typically involves a full-page reload.

   - **Single-page Applications (SPA):**
     SPAs, on the other hand, load a single HTML page and dynamically update the content as the user interacts with the application. The initial page load is usually more substantial, as it includes the entire application code. Subsequent interactions trigger asynchronous requests to the server for data, allowing for a smoother user experience without full-page reloads.

2. **User Experience:**

   - **Multi-page Applications (MPA):**
     MPAs often experience full-page reloads when users navigate between different sections of the application. While this approach is suitable for certain scenarios, it may result in slower perceived performance and a less seamless user experience.

   - **Single-page Applications (SPA):**
     SPAs provide a more fluid user experience by eliminating full-page reloads. Once the initial page is loaded, subsequent interactions feel faster as only the necessary data is fetched and updated dynamically, creating a desktop-application-like feel.

3. **Performance:**

   - **Multi-page Applications (MPA):**
     MPAs may suffer from slower performance due to the need for complete page reloads. However, they can benefit from browser caching to optimize subsequent visits to the same pages.

   - **Single-page Applications (SPA):**
     SPAs can offer faster performance after the initial load since only data is exchanged between the client and server, reducing the amount of transferred content. However, the initial load may be heavier, requiring efficient code-splitting and bundling strategies.

4. **Development and Maintenance:**

   - **Multi-page Applications (MPA):**
     MPAs are often simpler to develop and maintain, especially for smaller projects. Each page is a standalone entity, making it easier to manage and update without affecting other parts of the application.

   - **Single-page Applications (SPA):**
     SPAs can be more complex to develop and maintain, particularly as the application grows. Managing state, handling navigation, and optimizing for search engines can pose challenges that need careful consideration.

5. **SEO (Search Engine Optimization):**

   - **Multi-page Applications (MPA):**
     MPAs generally have better SEO out-of-the-box because search engines can crawl individual pages easily due to distinct URLs.

   - **Single-page Applications (SPA):**
     SPAs may face challenges with SEO, as search engines traditionally struggle with indexing dynamic content loaded asynchronously. Techniques like server-side rendering or pre-rendering are often employed to address these concerns.

## Building Project with Angular CLI

Angular is a powerful, open-source framework that simplifies the process of building dynamic, single-page web applications. Leveraging TypeScript, a superset of JavaScript, Angular facilitates the development of scalable and maintainable code.

### Getting Started with Angular CLI

#### Installation

Angular CLI (Command Line Interface) is a powerful tool for initializing, developing, and maintaining Angular applications. To install Angular CLI globally, run the following command:

```bash
npm install -g @angular/cli
```

#### Creating a New Project

Use the following command to create a new Angular project:

```bash
ng new my-angular-project
```

This command prompts you to select various project options, such as routing and styling, providing a customized setup for your needs.

#### Project Structure

Angular projects have a well-defined structure. Key directories include:

- `src`: Contains the source code of your application.
- `app`: The main application module and components reside here.
- `assets`: Stores static assets like images and fonts.
- `angular.json`: Configuration file for Angular CLI.

### Key Concepts in Angular

#### Components

Components are the building blocks of an Angular application. They encapsulate the application's logic and user interface. Here's an example of a basic component:

```typescript
// app.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<h1>Hello, {{ name }}!</h1>',
})
export class AppComponent {
  name = 'Angular';
}
```

#### Modules

Modules in Angular help organize the application into functional units. The main application module is defined in `app.module.ts`:

```typescript
// app.module.ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule],
  bootstrap: [AppComponent],
})
export class AppModule {}
```

#### Services

Services are reusable components that provide shared functionality across multiple parts of an application. Here's a simple service example:

```typescript
// data.service.ts
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class DataService {
  getData(): string {
    return 'Data from the service';
  }
}
```

#### Directives

Angular directives are special tokens in the markup that tell the library to do something to a DOM element. For example, the `ngIf` directive conditionally displays content:

```html
<!-- app.component.html -->
<h1 *ngIf="showHeader">Header is displayed!</h1>
```

### Section 3: Angular CLI Features and Nuances

#### 3.1 Generating Components and Services

Angular CLI provides commands to easily generate components, services, and other artifacts. For instance, to generate a new component:

```bash
ng generate component my-component
```

#### Building and Serving

Angular CLI simplifies the build and development process. Use the following commands:

```bash
ng build         # Build the application
ng serve         # Start the development server
```

#### Testing

Angular CLI integrates testing tools for unit and end-to-end testing. Run unit tests using:

```bash
ng test
```

## Angular Components

Angular, developed by Google, has become a cornerstone in modern web development, providing a robust framework for building dynamic and scalable applications. At the heart of Angular's architecture are components, the primary building blocks that encapsulate both the logic and the user interface of an application.

### Anatomy of an Angular Component

#### Component Definition

An Angular component is a TypeScript class decorated with the `@Component` decorator. This decorator provides metadata about the component, such as its selector, template, styles, and more. Here's a simple example:

```typescript
// app.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<h1>Hello, {{ name }}!</h1>',
  styles: ['h1 { color: #4285f4; }'],
})
export class AppComponent {
  name = 'Angular';
}
```

#### Component Lifecycle Hooks

Angular components go through a lifecycle, and developers can hook into various stages to perform actions. Common lifecycle hooks include `ngOnInit`, `ngOnChanges`, and `ngOnDestroy`. For instance:

```typescript
// app.component.ts
import { Component, OnInit, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<h1>Hello, {{ name }}!</h1>',
})
export class AppComponent implements OnInit, OnDestroy {
  name = 'Angular';

  ngOnInit() {
    console.log('Component initialized');
  }

  ngOnDestroy() {
    console.log('Component destroyed');
  }
}
```

### Component Communication

#### Input Properties

Components can receive input data through input properties. Use the `@Input` decorator to bind a property to an external value. Example:

```typescript
// child.component.ts
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child',
  template: '<p>{{ childMessage }}</p>',
})
export class ChildComponent {
  @Input() childMessage: string;
}
```

#### Output Properties and EventEmitter

For emitting custom events from a component, use output properties and `EventEmitter`. Example:

```typescript
// child.component.ts
import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  template: '<button (click)="sendMessage()">Send Message</button>',
})
export class ChildComponent {
  @Output() messageEvent = new EventEmitter<string>();

  sendMessage() {
    this.messageEvent.emit('Hello from the child!');
  }
}
```

### Component Templating and Styling

#### Template Binding

Angular's template syntax allows for dynamic data binding and expressions. For example, property binding:

```html
<!-- app.component.html -->
<h1 [style.color]="isRed ? 'red' : 'blue'">Dynamic Color</h1>
```

#### ngFor and ngIf Directives

Angular provides powerful directives for rendering lists (`ngFor`) and conditionally displaying elements (`ngIf`). Example:

```html
<!-- app.component.html -->
<ul>
  <li *ngFor="let item of items">{{ item }}</li>
</ul>

<div *ngIf="showElement">This element is shown conditionally</div>
```

### Component Dependency Injection

Angular's dependency injection system allows components to receive dependencies from an external source. Services are a common use case:

```typescript
// data.service.ts
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class DataService {
  getData(): string {
    return 'Data from the service';
  }
}
```

```typescript
// app.component.ts
import { Component } from '@angular/core';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  template: '<p>{{ dataService.getData() }}</p>',
})
export class AppComponent {
  constructor(private dataService: DataService) {}
}
```

## Angular Project Structure

### `src` Directory

The `src` directory is the heart of your Angular project, containing the source code and assets.

- `app`: This directory holds your application components, services, and modules.
- `assets`: Static assets like images, fonts, and global stylesheets reside here.
- `environments`: Configuration files for different environments (e.g., `environment.prod.ts` for production).

```plaintext
project/
|-- src/
|   |-- app/
|   |-- assets/
|   |-- environments/
|   |   |-- environment.prod.ts
|   |   |-- environment.ts
```

### Application Code Structure

#### `app` Directory

The `app` directory is where the bulk of your application resides. It contains components, services, modules, and other related files.

- `app.component.ts`: The root component of your application.
- `app.module.ts`: The main application module where you declare components, services, and other features.
- `app-routing.module.ts`: If you use Angular Router, this module handles application navigation.

```plaintext
project/
|-- src/
|   |-- app/
|   |   |-- app.component.ts
|   |   |-- app.module.ts
|   |   |-- app-routing.module.ts
```

#### Components files

Individual components have their own directories containing their TypeScript, HTML, CSS, and test files.

```plaintext
project/
|-- src/
|   |-- app/
|   |   |-- my-component/
|   |   |   |-- my-component.component.ts
|   |   |   |-- my-component.component.html
|   |   |   |-- my-component.component.css
|   |   |   |-- my-component.component.spec.ts
```

#### Services files

Services, responsible for reusable business logic, reside in the `app` directory.

```plaintext
project/
|-- src/
|   |-- app/
|   |   |-- my-service/
|   |   |   |-- my-service.service.ts
|   |   |   |-- my-service.service.spec.ts
```

### Configuration Files

#### `angular.json`

This configuration file controls various aspects of your Angular project, such as build settings, assets, and global styles.

```plaintext
project/
|-- angular.json
```

#### `tsconfig.json`

The TypeScript configuration file sets compiler options and includes/excludes files from compilation.

```plaintext
project/
|-- tsconfig.json
```

### Build and Configuration

#### `node_modules`

This directory contains the dependencies installed via npm.

```plaintext
project/
|-- node_modules/
```

#### `package.json`

The `package.json` file lists the project dependencies, scripts, and metadata.

```plaintext
project/
|-- package.json
```

### Testing files

#### `karma.conf.js` and `tsconfig.spec.json`

These files are part of the Angular testing setup.

```plaintext
project/
|-- karma.conf.js
|-- tsconfig.spec.json
```

#### `e2e` Directory

End-to-end testing configuration and specifications are located here.

```plaintext
project/
|-- e2e/
```

## Interpolation and Property Binding

Angular's powerful templating system allows developers to seamlessly integrate behavior and data into views. Two key techniques for achieving this are interpolation and property binding.

### Understanding Interpolation

#### What is Interpolation?

Interpolation in Angular is a way to embed expressions within double curly braces (`{{ }}`) directly in the HTML template. These expressions are evaluated, and their results are inserted into the HTML at runtime.

#### Using Interpolation for Data Binding

```html
<!-- app.component.html -->
<h1>Welcome, {{ username }}!</h1>
<p>Your balance is: ${{ balance + bonus }}</p>
```

#### Handling Expressions

Interpolation can handle simple expressions, method calls, and ternary operations.

```html
<!-- app.component.html -->
<p>{{ isActive ? 'Active' : 'Inactive' }}</p>
<p>{{ calculateTotal(10, 20) }}</p>
```

### Unveiling Property Binding

#### What is Property Binding?

Property binding is a technique in Angular that allows you to set the value of an HTML element's property directly from a component's property. It's denoted by square brackets (`[]`).

#### Binding to HTML Properties

```html
<!-- app.component.html -->
<img [src]="imageUrl" alt="Angular Logo" />
<button [disabled]="isButtonDisabled">Click me</button>
```

#### Dynamic Styling with Property Binding

```html
<!-- app.component.html -->
<p [style.color]="isError ? 'red' : 'green'">This is a dynamic text.</p>
```

### Combining Interpolation and Property Binding

#### Creating Dynamic URLs

```html
<!-- app.component.html -->
<a [href]="'/users/' + userId">Visit Profile</a>
```

#### Reacting to User Events

```html
<!-- app.component.html -->
<button (click)="onButtonClick()">Click me</button>
<p *ngIf="showMessage">Button Clicked!</p>
```

### Best Practices and Considerations

#### Escaping HTML

Be cautious when interpolating user-generated content to prevent XSS vulnerabilities.

```html
<!-- app.component.html -->
<p>{{ unsafeHtmlContent }}</p>
<p [innerHTML]="safeHtmlContent"></p>
```

#### Handling Null and Undefined

Use the Elvis operator (`?.`) to handle null and undefined values.

```html
<!-- app.component.html -->
<p>{{ user?.name }}</p>
```

## Event Binding in Angular

### Basics of Event Binding

#### What is Event Binding?

Event binding in Angular allows you to capture and handle user actions such as clicks, key presses, and mouse events. It establishes a communication channel between the template (view) and the component (logic) to respond to user interactions.

#### Syntax of Event Binding

Event binding is achieved by enclosing an event name in parentheses followed by the desired action or method call in quotes.

```html
<!-- Example of Click Event Binding -->
<button (click)="handleClick()">Click me</button>
```

### Responding to User Actions

#### Handling Click Events

Angular allows you to respond to user clicks with ease. In the component, define a method that should be executed on a click event.

```typescript
// app.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<button (click)="handleClick()">Click me</button>',
})
export class AppComponent {
  handleClick(): void {
    console.log('Button clicked!');
  }
}
```

#### Keyboard Events

Capture keyboard events such as key presses using event binding.

```html
<!-- Example of Key Press Event Binding -->
<input (keyup)="handleKeyPress($event)" />
```

```typescript
// app.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<input (keyup)="handleKeyPress($event)" />',
})
export class AppComponent {
  handleKeyPress(event: KeyboardEvent): void {
    console.log(`Key pressed: ${event.key}`);
  }
}
```

#### Mouse Events

Angular supports various mouse events, enabling developers to create interactive UIs.

```html
<!-- Example of Mouse Over Event Binding -->
<div (mouseover)="handleMouseOver()">Hover me</div>
```

```typescript
// app.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<div (mouseover)="handleMouseOver()">Hover me</div>',
})
export class AppComponent {
  handleMouseOver(): void {
    console.log('Mouse over the div!');
  }
}
```

### Passing Data with Events

#### Using Event Payloads

Event binding allows you to pass data from the template to the component when an event occurs.

```html
<!-- Example of Passing Data with Click Event -->
<button (click)="handleClick('Button clicked!')">Click me</button>
```

```typescript
// app.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<button (click)="handleClick(\'Button clicked!\')">Click me</button>',
})
export class AppComponent {
  handleClick(message: string): void {
    console.log(message);
  }
}
```

## Two-Way Binding with `ngModel`

Angular's `ngModel` directive is a powerful feature that facilitates two-way data binding, allowing for seamless synchronization between the component and the template.

### Basics of Two-Way Binding

#### What is Two-Way Binding?

Two-way binding in Angular allows for the automatic synchronization of data between the component and the template. It combines property binding and event binding into a single, expressive syntax.

#### Enabling Two-Way Binding with ngModel

`ngModel` is part of the `FormsModule` in Angular, and to use it, you must import `FormsModule` in your module.

```typescript
// app.module.ts
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [FormsModule],
  // other module configurations
})
export class AppModule {}
```

Now, you can use `ngModel` for two-way binding in your component.

```html
<!-- Example of Two-Way Binding with ngModel -->
<input [(ngModel)]="username" />
<p>Hello, {{ username }}!</p>
```

```typescript
// app.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<input [(ngModel)]="username" /><p>Hello, {{ username }}!</p>',
})
export class AppComponent {
  username: string = '';
}
```

### NgModel Properties and Features

#### Binding to Different Properties

`ngModel` can bind to different properties of an input element, such as `value`, `ngModelChange`, and custom properties.

```html
<!-- Example of Binding to Different Properties -->
<input [(ngModel)]="username" />
<p>{{ username }}</p>
```

#### Using ngModelChange Event

The `ngModelChange` event allows you to react to changes in the model data.

```html
<!-- Example of ngModelChange Event -->
<input [(ngModel)]="username" (ngModelChange)="onUsernameChange($event)" />
<p>{{ username }}</p>
```

```typescript
// app.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: '<input [(ngModel)]="username" (ngModelChange)="onUsernameChange($event)" /><p>{{ username }}</p>',
})
export class AppComponent {
  username: string = '';

  onUsernameChange(newValue: string): void {
    console.log(`Username changed to: ${newValue}`);
  }
}
```

#### NgModel Directive with Template Reference Variable

You can use template reference variables with `ngModel` to access the `ngModel` directive directly.

```html
<!-- Example of Using Template Reference Variable -->
<input #usernameInput="ngModel" [(ngModel)]="username" />
<p *ngIf="usernameInput.invalid">Username is required!</p>
```

### Handling Forms with ngModel

#### Form Validation

`ngModel` integrates seamlessly with Angular's form validation, allowing you to validate user input easily.

```html
<!-- Example of Form Validation with ngModel -->
<input [(ngModel)]="username" required minlength="3" />
<p *ngIf="usernameInput.invalid && (usernameInput.dirty || usernameInput.touched)">
  <span *ngIf="usernameInput.errors.required">Username is required!</span>
  <span *ngIf="usernameInput.errors.minlength">Username must be at least 3 characters long.</span>
</p>
```
