import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ItemCardComponent } from '../app/item-card/item-card.component';

describe('ItemCardComponent', () => {
  let component: ItemCardComponent;
  let fixture: ComponentFixture<ItemCardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ItemCardComponent]
    });
    fixture = TestBed.createComponent(ItemCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
