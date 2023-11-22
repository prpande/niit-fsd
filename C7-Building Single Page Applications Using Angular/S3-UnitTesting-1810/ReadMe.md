<!-- omit in toc -->
# Implement Unit Testing For Angular Components - 18/10

<!-- omit in toc -->
## Contents

- [Significance of Unit Testing](#significance-of-unit-testing)
  - [1. Identifying Bugs Early](#1-identifying-bugs-early)
  - [2. Ensuring Code Quality and Reliability](#2-ensuring-code-quality-and-reliability)
  - [3. Facilitating Code Refactoring](#3-facilitating-code-refactoring)
  - [4. Documentation and Code Understanding](#4-documentation-and-code-understanding)
  - [5. Supporting Collaboration](#5-supporting-collaboration)
  - [6. Enabling Continuous Integration and Deployment](#6-enabling-continuous-integration-and-deployment)
  - [7. Reducing Debugging Time](#7-reducing-debugging-time)
- [Navigating Angular CLI Configuration for Jasmine and Karma](#navigating-angular-cli-configuration-for-jasmine-and-karma)
  - [1. `karma.conf.js`](#1-karmaconfjs)
  - [2. `src/test.ts`](#2-srctestts)
  - [3. `tsconfig.spec.json`](#3-tsconfigspecjson)
  - [4. `src/polyfills.ts`](#4-srcpolyfillsts)
- [Testing Angular Components with Jasmine and Karma](#testing-angular-components-with-jasmine-and-karma)
  - [Setting Up the Project](#setting-up-the-project)
  - [Writing a Simple Component](#writing-a-simple-component)
  - [Writing Tests with Jasmine](#writing-tests-with-jasmine)
    - [Writing a Simple Test](#writing-a-simple-test)
    - [Testing Component Properties](#testing-component-properties)
    - [Testing DOM Interaction](#testing-dom-interaction)
    - [Running the Tests with Karma](#running-the-tests-with-karma)
- [Testing Angular Component Dependencies with Jasmine Spies](#testing-angular-component-dependencies-with-jasmine-spies)
  - [Writing a Component with Dependency](#writing-a-component-with-dependency)
    - [user.service.ts](#userservicets)
    - [user-profile.component.ts](#user-profilecomponentts)
  - [Writing Tests with Jasmine Spies](#writing-tests-with-jasmine-spies)
    - [user-profile.component.spec.ts](#user-profilecomponentspects)

## Significance of Unit Testing

Unit testing is a critical aspect of the software development process, providing numerous benefits that contribute to the overall success and sustainability of a project. In this article, we will explore the importance of unit testing and the positive impact it has on software quality, maintainability, and developer confidence.

### 1. Identifying Bugs Early

Unit testing allows developers to catch and address bugs at an early stage of development. By testing individual units of code (functions, methods, or classes) in isolation, issues can be detected and resolved before they propagate into more complex integration scenarios. Early bug identification reduces the cost and effort required to fix problems later in the development cycle.

### 2. Ensuring Code Quality and Reliability

Unit tests act as a safety net, ensuring that each unit of code performs its intended functionality correctly. This helps maintain a high level of code quality and reliability. Continuous integration (CI) systems often run unit tests automatically, preventing the integration of faulty code into the main codebase.

### 3. Facilitating Code Refactoring

Unit testing encourages developers to refactor code confidently. When a comprehensive suite of unit tests exists, developers can make changes to the codebase with the assurance that existing functionality will not be compromised. This promotes a culture of continuous improvement and code maintainability.

### 4. Documentation and Code Understanding

Unit tests serve as a form of documentation, providing insights into how individual units of code are intended to be used. For a developer unfamiliar with a particular piece of code, the associated unit tests can serve as executable documentation, aiding in understanding and usage.

### 5. Supporting Collaboration

In collaborative development environments, unit tests play a crucial role in supporting teamwork. As teams grow and different developers work on various parts of the codebase, unit tests act as a shared language. They provide a common understanding of the expected behavior of each unit and help prevent unintentional modifications that may affect other team members.

### 6. Enabling Continuous Integration and Deployment

Unit testing is a cornerstone of continuous integration (CI) and continuous deployment (CD) practices. Automated tests, including unit tests, can be seamlessly integrated into CI/CD pipelines to ensure that new code changes do not introduce regressions or defects. This automation accelerates the development cycle and increases the speed at which new features can be delivered to users.

### 7. Reducing Debugging Time

Unit tests can expedite the debugging process by pinpointing the source of errors. When a test fails, it provides valuable information about which specific unit of code is not behaving as expected. This targeted feedback speeds up the debugging process compared to searching for issues in a large and complex codebase.

## Navigating Angular CLI Configuration for Jasmine and Karma

Angular CLI generates several configuration files for various aspects of an Angular project. For testing, Jasmine is often used as the testing framework, and Karma serves as the test runner. Let's explore the relevant configuration files:

### 1. `karma.conf.js`

The `karma.conf.js` file is the configuration file for the Karma test runner. This file defines how Karma should run tests, which browsers to use, and other settings.

Example `karma.conf.js`:

```javascript
module.exports = function (config) {
  config.set({
    basePath: '',
    frameworks: ['jasmine', '@angular-devkit/build-angular'],
    plugins: [
      require('karma-jasmine'),
      require('karma-chrome-launcher'),
      require('karma-jasmine-html-reporter'),
      require('karma-coverage-istanbul-reporter'),
      require('@angular-devkit/build-angular/plugins/karma'),
    ],
    client: {
      clearContext: false, // leave Jasmine Spec Runner output visible in browser
    },
    coverageIstanbulReporter: {
      dir: require('path').join(__dirname, './coverage/my-app'),
      reports: ['html', 'lcovonly', 'text-summary'],
      fixWebpackSourcePaths: true,
    },
    reporters: ['progress', 'kjhtml'],
    port: 9876,
    colors: true,
    logLevel: config.LOG_INFO,
    autoWatch: true,
    browsers: ['Chrome'],
    singleRun: false,
    restartOnFileChange: true,
  });
};
```

### 2. `src/test.ts`

The `src/test.ts` file is the entry point for Karma. It includes the necessary configurations and setups for the testing environment.

Example `src/test.ts`:

```typescript
// This file is required by karma.conf.js and loads recursively all the .spec and framework files

import 'zone.js/testing';
import { getTestBed } from '@angular/core/testing';
import { BrowserDynamicTestingModule, platformBrowserDynamicTesting } from '@angular/platform-browser-dynamic/testing';

// First, initialize the Angular testing environment.
getTestBed().initTestEnvironment(
  BrowserDynamicTestingModule,
  platformBrowserDynamicTesting()
);

// Then we find all the tests.
const context = require.context('./', true, /\.spec\.ts$/);
// And load the modules.
context.keys().map(context);
```

### 3. `tsconfig.spec.json`

The `tsconfig.spec.json` file is a TypeScript configuration file specifically for running tests. It extends the main `tsconfig.json` file.

Example `tsconfig.spec.json`:

```json
{
  "extends": "./tsconfig.json",
  "compilerOptions": {
    "outDir": "./out-tsc/spec",
    "types": ["jasmine", "node"]
  },
  "files": ["src/test.ts", "src/polyfills.ts"],
  "include": ["src//*.spec.ts", "src//*.d.ts"]
}
```

### 4. `src/polyfills.ts`

The `polyfills.ts` file includes polyfills necessary for running tests in various environments.

Example `src/polyfills.ts`:

```typescript
import 'zone.js/dist/zone';
import 'zone.js/dist/zone-testing';
```

## Testing Angular Components with Jasmine and Karma

### Setting Up the Project

Before we start testing, make sure you have a basic Angular project created with Angular CLI. If not, you can create one with the following commands:

```bash
ng new my-angular-app
cd my-angular-app
```

### Writing a Simple Component

Let's create a simple component that we can use for testing.

```bash
ng generate component my-component
```

This will generate a new component named `MyComponent` with its associated files.

### Writing Tests with Jasmine

Jasmine is a popular testing framework for JavaScript and is the default choice for Angular applications.

#### Writing a Simple Test

Open the generated `my-component.component.spec.ts` file, which is the spec file for our component, and modify it to look like this:

```typescript
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { MyComponent } from './my-component.component';

describe('MyComponent', () => {
  let component: MyComponent;
  let fixture: ComponentFixture<MyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MyComponent],
    });

    fixture = TestBed.createComponent(MyComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });
});
```

This simple test checks if the component is created successfully.

#### Testing Component Properties

Let's modify our test to check if a property of the component is set correctly.

```typescript
// ... (existing imports)

describe('MyComponent', () => {
  let component: MyComponent;
  let fixture: ComponentFixture<MyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MyComponent],
    });

    fixture = TestBed.createComponent(MyComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should set the username property', () => {
    component.username = 'John';
    expect(component.username).toBe('John');
  });
});
```

#### Testing DOM Interaction

If your component interacts with the DOM, you can use Angular's testing utilities to simulate user actions.

```typescript
// ... (existing imports)

describe('MyComponent', () => {
  let component: MyComponent;
  let fixture: ComponentFixture<MyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MyComponent],
    });

    fixture = TestBed.createComponent(MyComponent);
    component = fixture.componentInstance;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should set the username property', () => {
    component.username = 'John';
    expect(component.username).toBe('John');
  });

  it('should update the DOM with the username', () => {
    component.username = 'Jane';
    fixture.detectChanges(); // trigger change detection

    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('p').textContent).toContain('Jane');
  });
});
```

#### Running the Tests with Karma

Now, run the tests using the following command:

```bash
ng test
```

This command launches the Karma test runner, which opens a new browser window displaying the test results. If everything is set up correctly, you should see that all tests pass.

## Testing Angular Component Dependencies with Jasmine Spies

In Angular testing, Jasmine spies are a powerful tool for mocking and spying on functions to verify their behavior. They are particularly useful when testing components that have dependencies, allowing you to isolate the component and focus on testing its interactions with the dependencies. In this guide, we'll explore how to use Jasmine spies to test dependencies of Angular components.

### Writing a Component with Dependency

Let's create a simple Angular component that has a dependency. For this example, we'll create a `UserService` with a method to fetch user data, and a `UserProfileComponent` that uses this service.

```bash
ng generate service user
ng generate component user-profile
```

#### user.service.ts

```typescript
// src/app/user.service.ts
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  getUserData(): string {
    return 'John Doe';
  }
}
```

#### user-profile.component.ts

```typescript
// src/app/user-profile/user-profile.component.ts
import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-profile',
  template: '<p>{{ username }}</p>',
})
export class UserProfileComponent implements OnInit {
  username: string = '';

  constructor(private userService: UserService) {}

  ngOnInit(): void {
    this.username = this.userService.getUserData();
  }
}
```

### Writing Tests with Jasmine Spies

Now, let's write tests for the `UserProfileComponent` while using Jasmine spies to mock the `UserService`.

#### user-profile.component.spec.ts

```typescript
// src/app/user-profile/user-profile.component.spec.ts
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { UserProfileComponent } from './user-profile.component';
import { UserService } from '../user.service';

describe('UserProfileComponent', () => {
  let component: UserProfileComponent;
  let fixture: ComponentFixture<UserProfileComponent>;
  let userServiceSpy: jasmine.SpyObj<UserService>;

  beforeEach(() => {
    // Create a spy object for the UserService
    const spy = jasmine.createSpyObj('UserService', ['getUserData']);

    TestBed.configureTestingModule({
      declarations: [UserProfileComponent],
      providers: [{ provide: UserService, useValue: spy }],
    });

    fixture = TestBed.createComponent(UserProfileComponent);
    component = fixture.componentInstance;
    userServiceSpy = TestBed.inject(UserService) as jasmine.SpyObj<UserService>;
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should get user data from the UserService', () => {
    // Set up the spy behavior
    userServiceSpy.getUserData.and.returnValue('Mocked User Data');

    // Call ngOnInit to trigger the service call
    component.ngOnInit();

    // Expectations
    expect(userServiceSpy.getUserData.calls.count()).toBe(1, 'getUserData called once');
    expect(component.username).toBe('Mocked User Data', 'username should be set');
  });
});
```

In this example:

- We create a spy object for the `UserService` using `jasmine.createSpyObj`.
- The spy object is provided in the `TestBed` configuration using `providers`.
- We set up the spy behavior using `userServiceSpy.getUserData.and.returnValue('Mocked User Data')`.
- In the test, we call the `ngOnInit` method to trigger the service call and check if the component interacts with the service correctly.
