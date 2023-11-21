import { inject } from '@angular/core';
import { CanActivateFn } from '@angular/router';
import { AuthService } from '../services/auth.service';
import { RouterService } from '../services/router.service';

export const loginGuard: CanActivateFn = (route, state) => {
  const authService = inject(AuthService);
  const router = inject(RouterService);

  if(authService.isLoggedIn)
  {
    return true;
  }
  else{
    router.goLogin();
    return false;
  }
};
