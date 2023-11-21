import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LandingViewComponent } from '../app/landing-view/landing-view.component';

describe('LandingViewComponent', () => {
  let component: LandingViewComponent;
  let fixture: ComponentFixture<LandingViewComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LandingViewComponent]
    });
    fixture = TestBed.createComponent(LandingViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
