import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { By } from '@angular/platform-browser';

import { FruitManagerComponent } from './fruit-manager.component';
import { FormsModule } from '@angular/forms';

describe('FruitManagerComponent', () => {
  let component: FruitManagerComponent;
  let fixture: ComponentFixture<FruitManagerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormsModule],
      declarations: [FruitManagerComponent]
    })
      .compileComponents();

    fixture = TestBed.createComponent(FruitManagerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });
  it('should render 10 fruit card details', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelectorAll('.card')?.length).toBe(10);
  });

  it('should contain a fruit with name "apple" and its price', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('h4')?.textContent).toContain('apple');
    expect(compiled.querySelector('span')?.textContent).toContain('$2 per pound');
  });

  it('should contain a search text box', () => {
     expect(fixture.debugElement.query(By.css('input'))).toBeTruthy;
  })
  it('should contain 2 buttons: search and reset button', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelectorAll('button[type=button]').length).toBe(2);
  })

  it('Should contain a Search button with "GO" as its caption', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.getElementsByTagName('button')[0].textContent).toEqual('Go');
  })

  it('Should contain a Cancel button with "Clear" as its caption', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.getElementsByTagName('button')[1].textContent).toEqual('Clear');
  })

  it('should load the fruit when searched by its name', waitForAsync(() => {
    const compiled = fixture.nativeElement as HTMLElement;
    fixture.detectChanges();
    fixture.whenStable().then(() => {
      let input = fixture.debugElement.query(By.css('input'));
      let el = input.nativeElement;
      el.value = "banana";
      el.dispatchEvent(new Event('input'));
      expect(component.searchText).toBe('banana');
      let button = fixture.debugElement.query(By.css('button'));
      button.triggerEventHandler('click', null);
      fixture.detectChanges();
      expect(compiled.querySelectorAll('.card')?.length).toBe(1);
      expect(compiled.querySelector('h4')?.textContent).toContain('banana');
      expect(compiled.querySelector('span')?.textContent).toContain('$0.8 per dozen');
    })
  }));

  it('should load all the matching fruits when searched', waitForAsync(() => {
    const compiled = fixture.nativeElement as HTMLElement;
    fixture.detectChanges();
    fixture.whenStable().then(() => {
      let input = fixture.debugElement.query(By.css('input'));
      let el = input.nativeElement;
      el.value = "a";
      el.dispatchEvent(new Event('input'));
      let button = fixture.debugElement.query(By.css('button'));
      button.triggerEventHandler('click', null);
      fixture.detectChanges();
      expect(compiled.querySelectorAll('.card')?.length).toBe(2);
    })
  }));
});

