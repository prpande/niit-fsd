<!-- omit in toc -->
# Style a Single Page Application Using Angular Material - 27/10

- For > Angular 13, to enable intellisense: Add this in tsconfig.json under compilerOptions.

    ```json
    "typeRoots": ["node_modules/@angular/material"]
    ```

<!-- omit in toc -->
## Content

- [Angular Material Design: Design Principles and Implementation](#angular-material-design-design-principles-and-implementation)
  - [Understanding Material Design Principles](#understanding-material-design-principles)
- [Integrating Angular Material in an Angular Application](#integrating-angular-material-in-an-angular-application)
  - [Install Angular Material and Angular CDK](#install-angular-material-and-angular-cdk)
  - [Import Material Modules](#import-material-modules)
  - [Use Material Components](#use-material-components)
- [Angular Material Components Examples](#angular-material-components-examples)
  - [1. MatButton](#1-matbutton)
  - [2. MatCard](#2-matcard)
  - [3. MatInputModule](#3-matinputmodule)
  - [4. MatTable](#4-mattable)
  - [5. MatDialog](#5-matdialog)
  - [6. MatSnackBar](#6-matsnackbar)
- [Best Practices for Designing with Angular Material](#best-practices-for-designing-with-angular-material)

## Angular Material Design: Design Principles and Implementation

Angular Material Design is a comprehensive set of UI components and directives developed by the Angular team in collaboration with Google. It follows the principles of Material Design, a design language created by Google, and aims to provide developers with a consistent and visually appealing set of components for building modern web applications.

### Understanding Material Design Principles

1. Material is the Metaphor
Material Design draws inspiration from real-world materials, utilizing tactile surfaces, realistic lighting, and bold colors. The metaphor of "material" is central to the design language.

2. Bold, Graphic, Intentional
Angular Material components feature bold designs, clear typography, and intentional use of space. The goal is to create visually striking and easily scannable user interfaces.

3. Motion Provides Meaning
Motion is used purposefully to guide users through their interactions. Transitions and animations are employed to provide context and enhance the user experience.

4. Focus on User Actions
User actions are in the spotlight, with components responding to clicks, taps, and other interactions in a way that feels natural and intuitive.

5. Responsive and Adaptable
Angular Material components are designed to be responsive and adaptable to various screen sizes and orientations, ensuring a seamless experience across devices.

6. Consistency Across Platforms
Material Design principles promote a consistent user experience across different platforms, whether users are interacting with the application on a desktop, tablet, or mobile device.

## Integrating Angular Material in an Angular Application

To use Angular Material in an Angular application, follow these steps:

### Install Angular Material and Angular CDK

```bash
ng add @angular/material
```

### Import Material Modules

In your `app.module.ts` file, import the necessary Material modules:

```typescript
import { MatToolbarModule, MatButtonModule, MatCardModule } from '@angular/material';

@NgModule({
  declarations: [
    // ...
  ],
  imports: [
    MatToolbarModule,
    MatButtonModule,
    MatCardModule,
    // Add other modules as needed
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
```

### Use Material Components

Now, you can use Angular Material components in your application templates:

```html
<mat-toolbar color="primary">My Angular Material App</mat-toolbar>

<button mat-button color="accent">Click me</button>

<mat-card>
  <mat-card-header>
    <mat-card-title>Card Title</mat-card-title>
  </mat-card-header>
  <mat-card-content>
    Content goes here.
  </mat-card-content>
</mat-card>
```

## Angular Material Components Examples

Angular Material includes a rich set of components that adhere to Material Design principles. Let's explore some of the key components:

### 1. MatButton

The `MatButton` component represents a Material Design button with customizable styles and animations.

   ```html
   <button mat-button color="primary">Primary Button</button>
   ```

### 2. MatCard

- `MatCard` is a container component for grouping related content, providing a visually appealing card layout.

   ```html
   <mat-card>
     <mat-card-header>
       <mat-card-title>Card Title</mat-card-title>
     </mat-card-header>
     <mat-card-content>
       Content goes here.
     </mat-card-content>
   </mat-card>
   ```

### 3. MatInputModule

`MatInputModule` provides Material-styled input fields with features like floating labels and error messages.

   ```html
   <mat-form-field>
     <input matInput placeholder="Username">
   </mat-form-field>
   ```

### 4. MatTable

`MatTable` is a versatile component for displaying tabular data with features like sorting, pagination, and row selection.

   ```html
   <mat-table [dataSource]="dataSource">
     <!-- Table columns and rows go here -->
   </mat-table>
   ```

### 5. MatDialog

`MatDialog` is used for creating modal dialogs, adhering to Material Design principles for user interactions.

   ```typescript
   const dialogRef = this.dialog.open(MyDialogComponent);
   ```

### 6. MatSnackBar

`MatSnackBar` provides a simple way to display snack bars for notifications and messages.

   ```typescript
   this.snackBar.open('Message sent', 'Dismiss', { duration: 2000 });
   ```

## Best Practices for Designing with Angular Material

1. Follow Material Design Guidelines
Adhere to Material Design principles and guidelines to ensure a consistent and user-friendly interface.

2. Customization and Theming
Customize the appearance of components using theming to match the application's branding.

3. Accessibility Considerations
Ensure that Angular Material components are accessible by following accessibility best practices.

4. Responsive Design
Design with responsiveness in mind to provide a seamless experience across devices.

5. Performance Optimization
Optimize performance by lazy-loading modules and components as needed, especially in large applications.

6. Regularly Update Dependencies
Keep Angular and Angular Material dependencies up to date to benefit from the latest features and security fixes.
