<!-- omit in toc -->
# Guard Routes In An SPA - 06/11

In Angular, route guards are mechanisms that allow you to control the navigation to and from certain routes. They provide a way to protect routes based on specific conditions, such as user authentication, authorization, or data loading.

<!-- omit in toc -->
## Content

- [Understanding Route Guards](#understanding-route-guards)
- [1. CanActivate Protecting Routes based on Conditions](#1-canactivate-protecting-routes-based-on-conditions)
- [2. CanActivateChild Guarding Child Routes](#2-canactivatechild-guarding-child-routes)
- [3. CanDeactivate Confirming Route Deactivation](#3-candeactivate-confirming-route-deactivation)
- [4. CanLoad Preventing Feature Module Loading](#4-canload-preventing-feature-module-loading)

## Understanding Route Guards

Angular supports several types of route guards

1. CanActivate Determines if a route can be activated.
2. CanActivateChild Similar to CanActivate but for child routes.
3. CanDeactivate Determines if a route can be deactivated.
4. CanLoad Prevents the asynchronous loading of a feature module.

## 1. CanActivate Protecting Routes based on Conditions

The `CanActivate` guard is used to determine whether a route can be activated. It is often used for authentication and authorization checks.

```typescript
// can-activate.guard.ts
import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn 'root',
})
export class AuthGuard implements CanActivate {
  canActivate(
    next ActivatedRouteSnapshot,
    state RouterStateSnapshot
  ) Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    // Implement your authentication logic here
    const isAuthenticated = /* your authentication logic */;
    
    if (isAuthenticated) {
      return true;
    } else {
      // Redirect to the login page
      return '/login';
    }
  }
}
```

To use this guard, you add it to the route configuration

```typescript
// app-routing.module.ts
const routes Routes = [
  {
    path 'dashboard',
    component DashboardComponent,
    canActivate [AuthGuard],
  },
];
```

## 2. CanActivateChild Guarding Child Routes

The `CanActivateChild` guard is similar to `CanActivate`, but it specifically guards child routes. It is useful when you want to apply the same guard logic to all child routes of a particular parent route.

```typescript
// can-activate-child.guard.ts
import { Injectable } from '@angular/core';
import { CanActivateChild, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn 'root',
})
export class AuthChildGuard implements CanActivateChild {
  canActivateChild(
    next ActivatedRouteSnapshot,
    state RouterStateSnapshot
  ) Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    // Implement your authentication logic for child routes here
    const isAuthenticated = /* your authentication logic for child routes */;

    if (isAuthenticated) {
      return true;
    } else {
      // Redirect to the login page
      return '/login';
    }
  }
}
```

Apply the `CanActivateChild` guard in the route configuration

```typescript
// app-routing.module.ts
const routes Routes = [
  {
    path 'admin',
    canActivateChild [AuthChildGuard],
    children [
      { path 'dashboard', component AdminDashboardComponent },
      { path 'settings', component AdminSettingsComponent },
    ],
  },
];
```

## 3. CanDeactivate Confirming Route Deactivation

The `CanDeactivate` guard is used to confirm whether a route can be deactivated. It is commonly used for preventing users from accidentally navigating away from a page with unsaved changes.

```typescript
// can-deactivate.guard.ts
import { Injectable } from '@angular/core';
import { CanDeactivate } from '@angular/router';
import { Observable } from 'rxjs';

export interface CanComponentDeactivate {
  canDeactivate () => Observable<boolean> | Promise<boolean> | boolean;
}

@Injectable({
  providedIn 'root',
})
export class CanDeactivateGuard
  implements CanDeactivate<CanComponentDeactivate>
{
  canDeactivate(
    component CanComponentDeactivate
  ) Observable<boolean> | Promise<boolean> | boolean {
    return component.canDeactivate ? component.canDeactivate()  true;
  }
}
```

Ensure your component implements the `CanComponentDeactivate` interface

```typescript
// your-component.component.ts
export class YourComponent implements CanComponentDeactivate {
  // ...

  canDeactivate() Observable<boolean> | Promise<boolean> | boolean {
    // Implement your confirmation logic here
    const isConfirmed = /* your confirmation logic */;

    return isConfirmed;
  }
}
```

Add the `CanDeactivate` guard to the route configuration

```typescript
// app-routing.module.ts
const routes Routes = [
  {
    path 'edit',
    component EditComponent,
    canDeactivate [CanDeactivateGuard],
  },
];
```

## 4. CanLoad Preventing Feature Module Loading

The `CanLoad` guard prevents the asynchronous loading of feature modules. It is useful for scenarios where you want to conditionally load a module.

```typescript
// can-load.guard.ts
import { Injectable } from '@angular/core';
import { CanLoad, Route, UrlSegment } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn 'root',
})
export class FeatureLoadGuard implements CanLoad {
  canLoad(
    route Route,
    segments UrlSegment[]
  ) Observable<boolean> | Promise<boolean> | boolean {
    // Implement your module loading logic here
    const canLoad = /* your loading logic */;

    return canLoad;
  }
}
```

Apply the `CanLoad` guard in the route configuration

```typescript
// app-routing.module.ts
const routes Routes = [
  {
    path 'feature',
    loadChildren () =>
      import('./feature/feature.module').then((m) => m.FeatureModule),
    canLoad [FeatureLoadGuard],
  },
];
```
