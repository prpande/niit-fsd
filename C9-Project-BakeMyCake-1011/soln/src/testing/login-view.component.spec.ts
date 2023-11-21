import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginViewComponent } from '../app/login-view/login-view.component';

describe('LoginViewComponent', () => {
  let component: LoginViewComponent;
  let fixture: ComponentFixture<LoginViewComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LoginViewComponent]
    });
    fixture = TestBed.createComponent(LoginViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
