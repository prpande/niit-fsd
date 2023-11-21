import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CakeRequestsViewComponent } from '../app/cake-requests-view/cake-requests-view.component';

describe('CakeRequestsViewComponent', () => {
  let component: CakeRequestsViewComponent;
  let fixture: ComponentFixture<CakeRequestsViewComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CakeRequestsViewComponent]
    });
    fixture = TestBed.createComponent(CakeRequestsViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
