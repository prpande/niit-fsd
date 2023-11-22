<!-- omit in toc -->
# Build Reusable Application Logic using Angular Services

<!-- omit in toc -->
## Content

- [Understanding the Need for Angular Services](#understanding-the-need-for-angular-services)
- [Angular Services](#angular-services)
  - [Nuances of Angular Services](#nuances-of-angular-services)
  - [Features and Properties of Angular Services](#features-and-properties-of-angular-services)
  - [Examples Illustrating Service Usage](#examples-illustrating-service-usage)
- [Observables in Angular](#observables-in-angular)
  - [Introduction to Observables](#introduction-to-observables)
  - [Key Concepts](#key-concepts)
    - [1. Subscription](#1-subscription)
    - [2. Operators](#2-operators)
    - [3. Subjects](#3-subjects)
    - [4. BehaviorSubject](#4-behaviorsubject)
    - [5. ReplaySubject](#5-replaysubject)
  - [Use Cases and Best Practices](#use-cases-and-best-practices)
    - [1. HTTP Requests using HttpClient Service](#1-http-requests-using-httpclient-service)
      - [**Making a GET Request**](#making-a-get-request)
      - [**Handling Responses and Errors**](#handling-responses-and-errors)
      - [**Sending Data with POST Requests**](#sending-data-with-post-requests)
      - [**Handling Observables in Components**](#handling-observables-in-components)
    - [2. Event Handling](#2-event-handling)
    - [3. Real-time Data Updates](#3-real-time-data-updates)
  - [**Error Handling and Cleanup**](#error-handling-and-cleanup)
- [Angular Component Lifecycle Methods](#angular-component-lifecycle-methods)
  - [The Angular Component Lifecycle Phases](#the-angular-component-lifecycle-phases)
  - [Practical Examples](#practical-examples)
    - [Example 1: Using Lifecycle Hooks for Initialization](#example-1-using-lifecycle-hooks-for-initialization)
    - [Example 2: Dynamic Content Initialization](#example-2-dynamic-content-initialization)
  - [Best Practices](#best-practices)

## Understanding the Need for Angular Services

1. Separation of Concerns (SoC):
   - Problem Statement: As applications grow in complexity, maintaining a clean and organized codebase becomes challenging.
   - Solution: Angular services provide a mechanism for separating concerns, ensuring that different aspects of an application, such as data management, business logic, and communication with external APIs, are encapsulated in modular services.

2. Reusability and Maintainability:
   - Problem Statement: Duplicating code across components leads to redundancy and maintenance headaches.
   - Solution: Angular services offer a reusable and maintainable solution by encapsulating shared functionality. These services can be injected into multiple components, promoting code reuse and reducing redundancy.

3. Centralized Data Management:
   - Problem Statement: Inconsistent data handling across components can result in synchronization issues.
   - Solution: Services act as a centralized repository for data, ensuring a single source of truth. Components can interact with the service to access or modify data, promoting consistency across the application.

## Angular Services

1. Angular CLI Service Generation:
   - The Angular CLI simplifies service creation with the `ng generate service` command, creating a service file with the necessary scaffolding.
   - Example: `ng generate service data`

2. Dependency Injection (DI):
   - Services in Angular are designed to be injected into components, directives, or other services.
   - Example: Injecting a service into a component constructor

   ```typescript
   import { Injectable } from '@angular/core';

   @Injectable({
     providedIn: 'root',
   })
   export class ExampleService {
     // Service logic
   }
   ```

### Nuances of Angular Services

1. Lifecycle Hooks:
   - Services have their own lifecycle hooks, such as `ngOnInit` and `ngOnDestroy`. Understanding these hooks is crucial for managing resources and ensuring proper initialization and cleanup.

2. Injectable Decorator:
   - The `@Injectable` decorator marks a class as injectable, allowing Angular to inject dependencies. It is essential for services to work with Angular's dependency injection system.

### Features and Properties of Angular Services

1. Singleton Instances:
   - Angular services are singleton instances by default, meaning there is only one instance of the service across the entire application. This promotes data consistency and ensures shared state.

2. Service Configuration:
   - Services can be configured to have a specific scope using the `providedIn` property. For example, setting it to `'root'` makes the service a singleton available throughout the application.

### Examples Illustrating Service Usage

1. HTTP Service for API Interaction:
   - Creating a service to handle HTTP requests, encapsulating API interaction logic.

2. Data Service for Cross-Component Communication:
   - Implementing a service to manage shared data, enabling communication between unrelated components.

## Observables in Angular

Observables are a fundamental concept in Angular, providing a powerful way to work with asynchronous data streams.

### Introduction to Observables

Observables represent a stream of values over time. They are an integral part of the RxJS library, which is extensively used in Angular for handling asynchronous operations. Observables can emit multiple values, including data, errors, and completion signals.

```typescript
// Creating a simple observable
import { Observable } from 'rxjs';

const myObservable = new Observable(observer => {
  observer.next('Hello');
  observer.next('World');
  observer.complete();
});
```

### Key Concepts

#### 1. Subscription

Observables are lazy. They don't start emitting values until someone subscribes to them. Subscriptions are a way to start the execution of an Observable.

```typescript
// Subscribing to the observable
const subscription = myObservable.subscribe(
  value => console.log(value),
  error => console.error(error),
  () => console.log('Observable completed')
);

// Unsubscribe to avoid memory leaks
subscription.unsubscribe();
```

#### 2. Operators

RxJS provides a plethora of operators to transform, filter, and combine Observables. These operators allow developers to manipulate the data emitted by Observables efficiently.

```typescript
import { map, filter } from 'rxjs/operators';

const modifiedObservable = myObservable.pipe(
  map(value => value.toUpperCase()),
  filter(value => value !== 'WORLD')
);

modifiedObservable.subscribe(value => console.log(value));
```

#### 3. Subjects

Subjects are a type of Observable and Observer combined. They allow values to be multicasted to many Observers. This makes them a powerful tool for event handling and cross-component communication.

```typescript
import { Subject } from 'rxjs';

const mySubject = new Subject<string>();

mySubject.subscribe(value => console.log('Observer 1:', value));
mySubject.subscribe(value => console.log('Observer 2:', value));

mySubject.next('Value 1');
mySubject.next('Value 2');
```

#### 4. BehaviorSubject

A BehaviorSubject is a type of Subject that requires an initial value. It always emits the current value to new subscribers and keeps the most recent value.

```typescript
import { BehaviorSubject } from 'rxjs';

const myBehaviorSubject = new BehaviorSubject<string>('Initial Value');

myBehaviorSubject.subscribe(value => console.log('Observer 1:', value));

myBehaviorSubject.next('New Value');
```

#### 5. ReplaySubject

A ReplaySubject records multiple values from the Observable execution and replays them to new subscribers.

```typescript
import { ReplaySubject } from 'rxjs';

const myReplaySubject = new ReplaySubject<string>(2); // Buffer size is 2

myReplaySubject.next('Value 1');
myReplaySubject.next('Value 2');

myReplaySubject.subscribe(value => console.log('Observer 1:', value)); // Outputs 'Value 1', 'Value 2'
```

### Use Cases and Best Practices

#### 1. HTTP Requests using HttpClient Service

Angular's `HttpClient` service simplifies making HTTP requests and returns Observables for handling responses. It provides methods like `get`, `post`, `put`, and `delete` to interact with a server.

##### **Making a GET Request**

The `get` method is used to retrieve data from a server. The returned result is an Observable of the response.

**Example:**

```typescript
import { HttpClient } from '@angular/common/http';

constructor(private http: HttpClient) {}

fetchData(): void {
  this.http.get('https://api.example.com/data')
    .subscribe(
      data => console.log(data),
      error => console.error(error)
    );
}
```

##### **Handling Responses and Errors**

The Observable returned by HTTP methods emits an object with properties like `data` for the response payload and `status` for the HTTP status code.

**Example:**

```typescript
this.http.get('https://api.example.com/data')
  .subscribe(
    response => console.log('Data:', response.data),
    error => console.error('Error:', error)
  );
```

##### **Sending Data with POST Requests**

To send data to the server, the `post` method is used. The data is sent in the request body, and the server's response is handled through the Observable.

**Example:**

```typescript
const postData = { username: 'john_doe', password: 'secret' };

this.http.post('https://api.example.com/login', postData)
  .subscribe(
    response => console.log('Login successful:', response),
    error => console.error('Login failed:', error)
  );
```

##### **Handling Observables in Components**

Observables are often used in Angular components to manage asynchronous data. The `async` pipe is a convenient way to subscribe to an Observable directly in the template.

**Example:**

```typescript
// Component code
data$: Observable<any>;

ngOnInit(): void {
  this.data$ = this.http.get('https://api.example.com/data');
}

// Template code
<div *ngIf="data$ | async as data">
  {{ data | json }}
</div>
```

#### 2. Event Handling

Observables are excellent for handling events in a reactive manner, providing a cleaner alternative to traditional callback patterns.

```typescript
import { fromEvent } from 'rxjs';

const button = document.getElementById('myButton');
const clickObservable = fromEvent(button, 'click');

clickObservable.subscribe(event => console.log('Button clicked:', event));
```

#### 3. Real-time Data Updates

Observables are ideal for handling real-time data updates, such as those from WebSocket connections.

```typescript
import { webSocket } from 'rxjs/webSocket';

const socket = webSocket('wss://example.com/socket');

socket.subscribe(
  data => console.log('Received:', data),
  error => console.error('Error:', error),
  () => console.log('WebSocket closed')
);
```

### **Error Handling and Cleanup**

Observables provide mechanisms for error handling and cleanup operations. The `catchError` operator can be used to handle errors, and the `unsubscribe` method is used to clean up subscriptions.

**Example:**

```typescript
this.http.get('https://api.example.com/data')
  .pipe(
    catchError(error => {
      console.error('Error:', error);
      // Perform error handling logic
      return throwError('An error occurred');
    })
  )
  .subscribe(
    data => console.log('Data:', data),
    error => console.error('Final error handling:', error)
  );
```

## Angular Component Lifecycle Methods

Angular components go through a series of lifecycle phases, from creation to destruction. Understanding these lifecycle methods is crucial for developing robust and efficient applications.

### The Angular Component Lifecycle Phases

Angular components undergo the following lifecycle phases:

1. **ngOnChanges:**
   - Invoked whenever Angular detects changes to input properties.
   - Use it to respond to changes in input values.

   ```typescript
   ngOnChanges(changes: SimpleChanges): void {
     // React to changes in input properties
     console.log('Input properties changed:', changes);
   }
   ```

2. **ngOnInit:**
   - Called once after the component is initialized.
   - Ideal for initializing data, making API calls, or any one-time setup.

   ```typescript
   ngOnInit(): void {
     // Initialize data or make API calls
     console.log('Component initialized');
   }
   ```

3. **ngDoCheck:**
   - Invoked during every change detection cycle.
   - Use it for custom change detection logic.

   ```typescript
   ngDoCheck(): void {
     // Custom change detection logic
     console.log('Change detection cycle triggered');
   }
   ```

4. **ngAfterContentInit:**
   - Called after content (ng-content) has been projected into the component.
   - Use it for initialization that relies on content initialization.

   ```typescript
   ngAfterContentInit(): void {
     // Perform actions after content initialization
     console.log('Content initialized');
   }
   ```

5. **ngAfterContentChecked:**
   - Invoked after every check of the projected content.
   - Useful for additional checks after content initialization.

   ```typescript
   ngAfterContentChecked(): void {
     // Additional checks after content initialization
     console.log('Content checked');
   }
   ```

6. **ngAfterViewInit:**
   - Called after the component's view (and child views) has been initialized.
   - Ideal for initializing view-related logic or integrating with third-party libraries.

   ```typescript
   ngAfterViewInit(): void {
     // Perform actions after view initialization
     console.log('View initialized');
   }
   ```

7. **ngAfterViewChecked:**
   - Invoked after every check of the component's view (and child views).
   - Useful for additional checks after view initialization.

   ```typescript
   ngAfterViewChecked(): void {
     // Additional checks after view initialization
     console.log('View checked');
   }
   ```

8. **ngOnDestroy:**
   - Called just before the component is destroyed.
   - Clean up resources, unsubscribe from observables, etc.

   ```typescript
   ngOnDestroy(): void {
     // Clean up resources before component destruction
     console.log('Component destroyed');
   }
   ```

### Practical Examples

#### Example 1: Using Lifecycle Hooks for Initialization

```typescript
@Component({
  selector: 'app-lifecycle-example',
  template: `<p>{{ message }}</p>`,
})
export class LifecycleExampleComponent implements OnInit, OnDestroy {
  message = '';

  ngOnInit(): void {
    this.message = 'Component initialized';
    console.log('Initialization complete');
  }

  ngOnDestroy(): void {
    console.log('Component destroyed');
  }
}
```

#### Example 2: Dynamic Content Initialization

```typescript
@Component({
  selector: 'app-content-example',
  template: `<ng-content></ng-content>`,
})
export class ContentExampleComponent implements AfterContentInit, OnDestroy {
  ngAfterContentInit(): void {
    console.log('Content initialized');
  }

  ngOnDestroy(): void {
    console.log('Component destroyed');
  }
}
```

### Best Practices

1. **Avoid Heavy Logic in ngOnInit:**
   - Perform heavy computations asynchronously to avoid blocking the main thread.

2. **Handle Unsubscriptions in ngOnDestroy:**
   - Unsubscribe from observables to prevent memory leaks.

3. **Use ngDoCheck Sparingly:**
   - Custom change detection can impact performance; use it judiciously.

4. **Leverage ngAfterViewInit for View-Related Logic:**
   - Initialize third-party libraries or perform view-related actions after the view is initialized.
