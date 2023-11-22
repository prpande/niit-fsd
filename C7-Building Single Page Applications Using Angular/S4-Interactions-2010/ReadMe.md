<!-- omit in toc -->
# Implement Interactions between Angular Components

<!-- omit in toc -->
## Content

- [Design Principles for Identifying Components in Single Page Applications (SPAs)](#design-principles-for-identifying-components-in-single-page-applications-spas)
  - [1. Single Responsibility Principle (SRP)](#1-single-responsibility-principle-srp)
  - [2. Separation of Concerns](#2-separation-of-concerns)
  - [3. Reusability and Composition](#3-reusability-and-composition)
  - [4. Smart and Dumb Components](#4-smart-and-dumb-components)
  - [5. Consistent Naming Conventions](#5-consistent-naming-conventions)
  - [6. Hierarchy and Container Components](#6-hierarchy-and-container-components)
- [Building a Component Hierarchy in Angular](#building-a-component-hierarchy-in-angular)
  - [The Importance of Component Hierarchy](#the-importance-of-component-hierarchy)
  - [Designing a Component Hierarchy](#designing-a-component-hierarchy)
  - [1. Identify Components with a Single Responsibility](#1-identify-components-with-a-single-responsibility)
    - [2. Smart and Dumb Components](#2-smart-and-dumb-components)
    - [3. Parent-Child Relationships](#3-parent-child-relationships)
    - [4. Container and Presentational Components](#4-container-and-presentational-components)
    - [5. Use ng-content for Content Projection](#5-use-ng-content-for-content-projection)
- [Sharing Data from Parent to Child Component using `@Input()`](#sharing-data-from-parent-to-child-component-using-input)
  - [Understanding `@Input()`](#understanding-input)
    - [Syntax](#syntax)
  - [Example Scenario](#example-scenario)
    - [Parent Component: ParentComponent](#parent-component-parentcomponent)
    - [Child Component: ChildComponent](#child-component-childcomponent)
  - [Implementing `@Input()` - Step by Step](#implementing-input---step-by-step)
  - [Advanced Usage of @Input()](#advanced-usage-of-input)
    - [1. Input Alias](#1-input-alias)
    - [2. Object Destructuring](#2-object-destructuring)
  - [Handling Changes with ngOnChanges](#handling-changes-with-ngonchanges)
- [Conclusion](#conclusion)
- [`@Output()` Decorator: Bridging Communication Between Child and Parent Components](#output-decorator-bridging-communication-between-child-and-parent-components)
  - [Understanding `@Output()` Decorator](#understanding-output-decorator)
    - [Basic Syntax](#basic-syntax)
  - [Basic Usage of `@Output()`](#basic-usage-of-output)
    - [ChildComponent Setup](#childcomponent-setup)
    - [ParentComponent Setup](#parentcomponent-setup)
  - [Advanced Techniques with `@Output()`](#advanced-techniques-with-output)
    - [Passing Complex Data](#passing-complex-data)
    - [Multiple @Output() Properties](#multiple-output-properties)

## Design Principles for Identifying Components in Single Page Applications (SPAs)

Single Page Applications (SPAs) have become a prevalent approach in modern web development, offering a seamless and interactive user experience. A key aspect of SPA architecture is the effective design and identification of components.

In SPAs, components are the building blocks that encapsulate functionality, structure, and style. Identifying components correctly is essential for creating a modular, maintainable, and extensible application. The following design principles serve as a foundation for effective component identification in SPAs.

### 1. Single Responsibility Principle (SRP)

The Single Responsibility Principle advocates that a component should have only one reason to change. In the context of SPAs, this principle suggests that each component should encapsulate a specific piece of functionality or user interface element. For example, a login form and a user profile component should be distinct, each responsible for its specific area of concern.

```typescript
// Example: User Profile Component
@Component({
  selector: 'app-user-profile',
  template: '<p>User Profile Information</p>',
})
export class UserProfileComponent {
  // ...
}
```

### 2. Separation of Concerns

Components should maintain a clear separation of concerns, ensuring that different aspects of the application, such as presentation, logic, and data management, are handled by distinct components. This separation enhances code readability, testability, and the ability to modify or replace one concern without affecting others.

```typescript
// Example: User List Component
@Component({
  selector: 'app-user-list',
  template: '<ul><li *ngFor="let user of users">{{ user.name }}</li></ul>',
})
export class UserListComponent {
  users: User[] = [];
  // ...
}
```

### 3. Reusability and Composition

Promoting component reusability is a fundamental principle. Components should be designed to be reused across different parts of the application. This is achieved through the composition of smaller, specialized components into larger ones. A well-designed component should be a building block that fits into various contexts.

```typescript
// Example: Card Component composed of smaller components
@Component({
  selector: 'app-card',
  template: '<div><app-card-header></app-card-header><app-card-body></app-card-body></div>',
})
export class CardComponent {
  // ...
}
```

### 4. Smart and Dumb Components

The concept of smart and dumb components divides responsibilities between components that manage state and those that present information. Smart components are responsible for handling data and logic, while dumb components focus solely on rendering the UI based on inputs. This separation simplifies testing and encourages a clear hierarchy in component interactions.

```typescript
// Example: Smart Component
@Component({
  selector: 'app-user-dashboard',
  template: '<app-user-list [users]="users"></app-user-list>',
})
export class UserDashboardComponent {
  users: User[] = [];
  // ...
}
```

### 5. Consistent Naming Conventions

Establishing consistent naming conventions for components enhances code readability and maintainability. Choose meaningful names that reflect the purpose and functionality of the component. This consistency simplifies navigation and understanding for developers working on the project.

```typescript
// Example: Consistent Naming Conventions
@Component({
  selector: 'app-product-list',
  template: '<ul><li *ngFor="let product of products">{{ product.name }}</li></ul>',
})
export class ProductListComponent {
  products: Product[] = [];
  // ...
}
```

### 6. Hierarchy and Container Components

Organizing components in a hierarchical structure contributes to a clear and understandable application architecture. Container components act as the orchestrators, managing state and logic, while child components handle specific UI elements or functionality. This hierarchy facilitates the flow of data and events within the application.

```typescript
// Example: Hierarchy with Container and Child Components
@Component({
  selector: 'app-shopping-cart',
  template: '<app-cart-summary [items]="cartItems"></app-cart-summary><app-cart-items [items]="cartItems"></app-cart-items>',
})
export class ShoppingCartComponent {
  cartItems: CartItem[] = [];
  // ...
}
```

## Building a Component Hierarchy in Angular

In Angular, organizing components in a hierarchical structure is a fundamental concept for building scalable and maintainable applications. A well-structured component hierarchy enhances code readability, reusability, and ease of maintenance.

### The Importance of Component Hierarchy

A component hierarchy defines the relationships and dependencies between different parts of your Angular application. It establishes a clear structure that reflects the logical organization of your user interface. Key benefits of a well-designed component hierarchy include:

- Modularity: Components can be developed and tested independently, promoting code reuse and maintainability.
  
- Readability: A hierarchical structure makes it easier for developers to understand the relationships between components and their responsibilities.

- Scalability: As your application grows, a thoughtful component hierarchy provides a foundation for adding new features without introducing unnecessary complexity.

### Designing a Component Hierarchy

### 1. Identify Components with a Single Responsibility

Each component should have a clear and single responsibility. This aligns with the Single Responsibility Principle and ensures that components are focused on specific tasks or features.

```typescript
// Example: UserListComponent
@Component({
  selector: 'app-user-list',
  template: '<ul><li *ngFor="let user of users">{{ user.name }}</li></ul>',
})
export class UserListComponent {
  users: User[] = [];
}
```

#### 2. Smart and Dumb Components

Distinguish between smart and dumb components. Smart components manage state and business logic, while dumb components are focused on presenting data. This separation enhances maintainability and testability.

```typescript
// Example: Smart Component
@Component({
  selector: 'app-user-dashboard',
  template: '<app-user-list [users]="users"></app-user-list>',
})
export class UserDashboardComponent {
  users: User[] = [];
}
```

#### 3. Parent-Child Relationships

Leverage parent-child relationships to create a hierarchical structure. Parent components can manage the state and pass data down to child components through input properties.

```typescript
// Example: Parent Component
@Component({
  selector: 'app-parent',
  template: '<app-child [message]="parentMessage"></app-child>',
})
export class ParentComponent {
  parentMessage = 'Message from Parent';
}
```

```typescript
// Example: Child Component
@Component({
  selector: 'app-child',
  template: '<p>{{ message }}</p>',
})
export class ChildComponent {
  @Input() message: string = '';
}
```

#### 4. Container and Presentational Components

Separate container components (smart components) from presentational components (dumb components). Container components manage the application's state and interact with services, while presentational components focus on rendering UI elements.

```typescript
// Example: Container Component
@Component({
  selector: 'app-container',
  template: '<app-presentation [data]="appData"></app-presentation>',
})
export class ContainerComponent {
  appData: any;

  // Fetch data from a service or API
  ngOnInit() {
    this.appData = this.dataService.getData();
  }
}
```

```typescript
// Example: Presentational Component
@Component({
  selector: 'app-presentation',
  template: '<p>{{ data }}</p>',
})
export class PresentationComponent {
  @Input() data: any;
}
```

#### 5. Use ng-content for Content Projection

`ng-content` allows the insertion of content into a component, enabling flexibility and reusability. This is particularly useful for creating generic components.

```typescript
// Example: Card Component
@Component({
  selector: 'app-card',
  template: '<div><ng-content></ng-content></div>',
})
export class CardComponent { }
```

## Sharing Data from Parent to Child Component using `@Input()`

In Angular, the `@Input()` decorator plays a crucial role in establishing a communication channel from a parent component to a child component. This allows the parent component to pass data to the child component, enabling dynamic content rendering and interaction.

### Understanding `@Input()`

The `@Input()` decorator is part of Angular's property binding mechanism, allowing values to be passed into a component. It is applied to a property within the child component, indicating that this property can receive input from its parent component.

#### Syntax

```typescript
@Input() propertyName: propertyType;
```

Here, `propertyName` is the name of the property in the child component, and `propertyType` is its data type.

### Example Scenario

Consider a scenario where a parent component (`ParentComponent`) wants to pass a user object to a child component (`ChildComponent`). The `ChildComponent` will then display the user's name.

#### Parent Component: ParentComponent

```typescript
import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  template: `
    <h2>Parent Component</h2>
    <app-child [user]="parentUser"></app-child>
  `,
})
export class ParentComponent {
  parentUser = { name: 'John Doe', age: 30 };
}
```

In this example, the `parentUser` property is of type `User` (an interface representing a user with properties like `name` and `age`).

#### Child Component: ChildComponent

```typescript
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child',
  template: '<p>{{ user.name }}</p>',
})
export class ChildComponent {
  @Input() user: User;
}
```

In the `ChildComponent`, the `@Input()` decorator is used to declare the `user` property. This property is then used in the template to display the user's name.

### Implementing `@Input()` - Step by Step

1. Parent Component Setup:

   In the parent component, define the property to be passed to the child component.

   ```typescript
   import { Component } from '@angular/core';

   @Component({
     selector: 'app-parent',
     template: `
       <h2>Parent Component</h2>
       <app-child [user]="parentUser"></app-child>
     `,
   })
   export class ParentComponent {
     parentUser = { name: 'John Doe', age: 30 };
   }
   ```

2. Child Component Setup:

   In the child component, use the `@Input()` decorator to declare the property that will receive the data.

   ```typescript
   import { Component, Input } from '@angular/core';

   @Component({
     selector: 'app-child',
     template: '<p>{{ user.name }}</p>',
   })
   export class ChildComponent {
     @Input() user: User;
   }
   ```

3. Parent Component Template:

   In the parent component's template, bind the property to the child component using property binding (`[user]="parentUser"`).

4. Child Component Template:

   In the child component's template, use the property as needed.

   ```html
   <!-- child.component.html -->
   <p>{{ user.name }}</p>
   ```

5. Result:

   When the application runs, the child component receives the `user` object from the parent, and the user's name is displayed.

### Advanced Usage of @Input()

#### 1. Input Alias

You can use an alias for the input property name using the `@Input(alias)` syntax.

```typescript
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child',
  template: '<p>{{ receivedMessage }}</p>',
})
export class ChildComponent {
  @Input('messageFromParent') receivedMessage: string;
}
```

Here, the `ChildComponent` still refers to the property as `receivedMessage`, but the parent can use `[messageFromParent]` for binding.

#### 2. Object Destructuring

If the input is an object, you can destructure it directly in the `@Input()` decorator.

```typescript
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child',
  template: '<p>{{ user.name }}</p>',
})
export class ChildComponent {
  @Input() user: { name: string, age: number };
}
```

This allows the parent to pass an object directly, like `[user]="{ name: 'John', age: 30 }"`.

### Handling Changes with ngOnChanges

To respond to changes in the input property, you can implement the `ngOnChanges` lifecycle hook in the child component.

```typescript
import { Component, Input, OnChanges, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-child',
  template: '<p>{{ receivedMessage }}</p>',
})
export class ChildComponent implements OnChanges {
  @Input() receivedMessage: string;

  ngOnChanges(changes: SimpleChanges): void {
    console.log('Input changed:', changes);
  }
}
```

## Conclusion

The `@Input()` decorator in Angular provides a straightforward and effective way to share data from a parent component to a child component. This mechanism enhances the modularity and reusability of Angular applications, allowing components to be versatile and adaptable to different scenarios. Incorporating `@Input()` is a fundamental aspect of Angular's component-based architecture, facilitating a clear and efficient flow of data within the application. Developers can use the various features and techniques discussed to handle data passing in diverse scenarios, making their Angular applications more dynamic and responsive.

## `@Output()` Decorator: Bridging Communication Between Child and Parent Components

In Angular, effective communication between components is crucial for building dynamic and interactive applications. The `@Output()` decorator is a powerful mechanism that facilitates communication from child components to their parent components.

### Understanding `@Output()` Decorator

The `@Output()` decorator in Angular is used to create custom events in a child component that can be emitted and captured by the parent component. It establishes a unidirectional data flow from child to parent, allowing child components to communicate changes, actions, or any relevant information to their parent components.

#### Basic Syntax

```typescript
@Output() eventName: EventEmitter<dataType> = new EventEmitter();
```

Here, `eventName` is the name of the custom event, and `dataType` is the type of data that the event will emit. The `EventEmitter` is a class provided by Angular to emit events.

### Basic Usage of `@Output()`

Let's start with a simple example where a child component emits an event, and the parent component listens to that event.

#### ChildComponent Setup

```typescript
import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  template: '<button (click)="emitData()">Click me</button>',
})
export class ChildComponent {
  @Output() dataEvent: EventEmitter<string> = new EventEmitter();

  emitData() {
    this.dataEvent.emit('Data from Child to Parent');
  }
}
```

In this example, the child component has an @Output() property named `dataEvent` of type `EventEmitter<string>`. The `emitData` method is triggered when a button is clicked, emitting a string data to the parent.

#### ParentComponent Setup

```typescript
import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  template: `
    <h2>Parent Component</h2>
    <app-child (dataEvent)="receiveData($event)"></app-child>
    <p>{{ receivedData }}</p>
  `,
})
export class ParentComponent {
  receivedData: string;

  receiveData(data: string) {
    this.receivedData = data;
  }
}
```

In the parent component, we listen to the `dataEvent` emitted by the child component using `(dataEvent)="receiveData($event)"`. The `receiveData` method then processes the received data.

### Advanced Techniques with `@Output()`

#### Passing Complex Data

You can emit and receive complex data objects through @Output().

ChildComponent

```typescript
import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  template: '<button (click)="emitObject()">Click me</button>',
})
export class ChildComponent {
  @Output() objectEvent: EventEmitter<any> = new EventEmitter();

  emitObject() {
    const dataObject = { message: 'Complex Data from Child' };
    this.objectEvent.emit(dataObject);
  }
}
```

ParentComponent

```typescript
import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  template: `
    <h2>Parent Component</h2>
    <app-child (objectEvent)="receiveObject($event)"></app-child>
    <p>{{ receivedObject?.message }}</p>
  `,
})
export class ParentComponent {
  receivedObject: any;

  receiveObject(data: any) {
    this.receivedObject = data;
  }
}
```

#### Multiple @Output() Properties

You can have multiple @Output() properties in a child component to emit different events.

ChildComponent

```typescript
import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  template: '<button (click)="emitEvents()">Click me</button>',
})
export class ChildComponent {
  @Output() event1: EventEmitter<string> = new EventEmitter();
  @Output() event2: EventEmitter<number> = new EventEmitter();

  emitEvents() {
    this.event1.emit('Event 1');
    this.event2.emit(42);
  }
}
```

ParentComponent

```typescript
import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  template: `
    <h2>Parent Component</h2>
    <app-child (event1)="handleEvent1($event)" (event2)="handleEvent2($event)"></app-child>
    <p>{{ receivedEvent1 }}</p>
    <p>{{ receivedEvent2 }}</p>
  `,
})
export class ParentComponent {
  receivedEvent1: string;
  receivedEvent2: number;

  handleEvent1(data: string) {
    this.receivedEvent1 = data;
  }

  handleEvent2(data: number) {
    this.receivedEvent2 = data;
  }
}
```
