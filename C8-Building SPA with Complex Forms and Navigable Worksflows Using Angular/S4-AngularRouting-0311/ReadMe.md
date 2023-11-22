<!-- omit in toc -->
# Implement Navigation Using Angular Routing - 03/11

Routing in Angular is a fundamental aspect of building single-page applications (SPAs). It enables navigation between different views and components based on the application's URL.

<!-- omit in toc -->
## Content

- [Setting Up Angular Router](#setting-up-angular-router)
- [1. Basic Routing Configuration](#1-basic-routing-configuration)
- [2. Router Outlet](#2-router-outlet)
- [3. RouterLink](#3-routerlink)
- [4. RouterLinkActive](#4-routerlinkactive)
- [5. Navigating Programmatically](#5-navigating-programmatically)
- [6. Route Parameters](#6-route-parameters)
- [7. Child Routes](#7-child-routes)
- [8. Route Guards](#8-route-guards)
- [9. Lazy Loading Modules](#9-lazy-loading-modules)
- [10. Wildcard Route and Redirects](#10-wildcard-route-and-redirects)
- [Accessing Route Information using ActivatedRoute](#accessing-route-information-using-activatedroute)
  - [Understanding ActivatedRoute](#understanding-activatedroute)
  - [1. Accessing Route Parameters](#1-accessing-route-parameters)
  - [2. Accessing Query Parameters](#2-accessing-query-parameters)
  - [3. Accessing Fragment](#3-accessing-fragment)
  - [4. Accessing Route Data](#4-accessing-route-data)
  - [5. Accessing Parent and Child Routes](#5-accessing-parent-and-child-routes)
  - [6. Accessing Router Events](#6-accessing-router-events)

## Setting Up Angular Router

Before we delve into the details, ensure that you have the Angular Router module installed in your Angular application.

```bash
ng add @angular/router
```

This will set up the necessary dependencies and create a basic routing configuration.

## 1. Basic Routing Configuration

Angular Router is configured using the `RouterModule` and `Routes` in the application module.

```typescript
// app.module.ts
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'about', component: AboutComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
```

In this example, we've defined two routes: one for the home page (`''`) and one for the about page (`'about'`).

## 2. Router Outlet

The `<router-outlet>` directive is a placeholder where the routed components will be displayed.

```html
<!-- app.component.html -->
<div>
  <router-outlet></router-outlet>
</div>
```

## 3. RouterLink

Use the `routerLink` directive to create navigation links in your templates.

```html
<!-- Navigation Links -->
<a routerLink="/">Home</a>
<a routerLink="/about">About</a>
```

## 4. RouterLinkActive

The `routerLinkActive` directive adds a CSS class when the associated route is active.

```html
<!-- Highlighting Active Link -->
<a routerLink="/" routerLinkActive="active">Home</a>
<a routerLink="/about" routerLinkActive="active">About</a>
```

## 5. Navigating Programmatically

You can navigate programmatically using the `Router` service.

```typescript
// Programmatically Navigating
import { Router } from '@angular/router';

// ...

constructor(private router: Router) {}

navigateToAbout(): void {
  this.router.navigate(['/about']);
}
```

## 6. Route Parameters

Pass parameters in the route URL to make routes dynamic.

```typescript
// Dynamic Route with Parameter
const routes: Routes = [
  { path: 'user/:id', component: UserComponent },
];
```

Access the parameter in the component using `ActivatedRoute`.

```typescript
// Accessing Route Parameters
import { ActivatedRoute } from '@angular/router';

// ...

constructor(private route: ActivatedRoute) {
  this.route.params.subscribe(params => {
    console.log(params.id);
  });
}
```

## 7. Child Routes

Organize routes hierarchically using child routes.

```typescript
// Child Routes
const routes: Routes = [
  {
    path: 'dashboard',
    component: DashboardComponent,
    children: [
      { path: 'overview', component: OverviewComponent },
      { path: 'settings', component: SettingsComponent },
    ],
  },
];
```

## 8. Route Guards

Protect routes with guards to control access based on certain conditions.

```typescript
// Route Guard
import { CanActivate } from '@angular/router';

@Injectable({
  providedIn: 'root',
})
export class AuthGuard implements CanActivate {
  canActivate(): boolean {
    // Check authentication logic
    return true;
  }
}
```

Apply the guard to a route.

```typescript
// Applying Route Guard
const routes: Routes = [
  { path: 'admin', component: AdminComponent, canActivate: [AuthGuard] },
];
```

## 9. Lazy Loading Modules

Lazy load modules to improve application performance by loading modules on demand.

```typescript
// Lazy Loading Module
const routes: Routes = [
  { path: 'admin', loadChildren: () => import('./admin/admin.module').then(m => m.AdminModule) },
];
```

## 10. Wildcard Route and Redirects

Use a wildcard route to handle unknown routes, and set up redirects for route aliases.

```typescript
// Wildcard Route and Redirects
const routes: Routes = [
  { path: '404', component: NotFoundComponent },
  { path: '', redirectTo: '/404' },
];
```

## Accessing Route Information using ActivatedRoute

In Angular, the `ActivatedRoute` interface is a crucial tool for accessing information about the currently activated route. It provides a way to extract parameters, query parameters, route data, and other relevant details.

### Understanding ActivatedRoute

The `ActivatedRoute` service is part of the Angular Router module and provides information about the route associated with a component. It is typically injected into a component or service where route-related information is required.

```typescript
import { ActivatedRoute } from '@angular/router';
```

### 1. Accessing Route Parameters

Route parameters are placeholders in the route path, and you can extract their values using the `params` observable provided by `ActivatedRoute`.

```typescript
import { ActivatedRoute } from '@angular/router';

// ...

constructor(private route: ActivatedRoute) {
  this.route.params.subscribe(params => {
    const userId = params['id'];
    console.log('User ID:', userId);
  });
}
```

In this example, if the route is defined as `'user/:id'`, accessing `params['id']` will give you the value of the `id` parameter.

### 2. Accessing Query Parameters

Query parameters are used for optional parameters in the URL, and you can access them using the `queryParams` observable.

```typescript
import { ActivatedRoute } from '@angular/router';

// ...

constructor(private route: ActivatedRoute) {
  this.route.queryParams.subscribe(queryParams => {
    const sortBy = queryParams['sortBy'];
    console.log('Sort By:', sortBy);
  });
}
```

For a URL like `/products?sortBy=name`, accessing `queryParams['sortBy']` will give you the value `'name'`.

### 3. Accessing Fragment

The fragment is a portion of the URL after the `#` symbol. You can access it using the `fragment` observable.

```typescript
import { ActivatedRoute } from '@angular/router';

// ...

constructor(private route: ActivatedRoute) {
  this.route.fragment.subscribe(fragment => {
    console.log('Fragment:', fragment);
  });
}
```

For a URL like `/page#section3`, accessing `fragment` will give you the value `'section3'`.

### 4. Accessing Route Data

Route data is information associated with a route that is not part of the route parameters or query parameters. You can access it using the `data` observable.

```typescript
import { ActivatedRoute } from '@angular/router';

// ...

constructor(private route: ActivatedRoute) {
  this.route.data.subscribe(data => {
    const title = data['title'];
    console.log('Page Title:', title);
  });
}
```

Route data is often defined in the route configuration:

```typescript
const routes: Routes = [
  { path: 'dashboard', component: DashboardComponent, data: { title: 'Dashboard' } },
];
```

### 5. Accessing Parent and Child Routes

If your application has nested routes, you can access information about parent and child routes using `parent` and `children` properties.

```typescript
import { ActivatedRoute } from '@angular/router';

// ...

constructor(private route: ActivatedRoute) {
  const parentId = this.route.parent.snapshot.params['id'];
  console.log('Parent ID:', parentId);

  const childId = this.route.children[0].snapshot.params['id'];
  console.log('Child ID:', childId);
}
```

In this example, assuming a route structure like `'users/:id/profile/:childId'`, you can access both parent and child route parameters.

### 6. Accessing Router Events

The `ActivatedRoute` service also provides access to router events, allowing you to react to changes in the route.

```typescript
import { ActivatedRoute, NavigationEnd, Router } from '@angular/router';
import { filter } from 'rxjs/operators';

// ...

constructor(private route: ActivatedRoute, private router: Router) {
  this.router.events.pipe(
    filter(event => event instanceof NavigationEnd)
  ).subscribe(() => {
    console.log('Route changed:', this.route.snapshot.url);
  });
}
```

In this example, we're subscribing to the `NavigationEnd` event to log information about the current route when the navigation is complete.
