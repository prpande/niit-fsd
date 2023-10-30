import { ComponentFixture, TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  let app: AppComponent;
  let fixture: ComponentFixture<AppComponent>;
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [
        AppComponent
      ]
    }).compileComponents();
    fixture = TestBed.createComponent(AppComponent);
    app = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the app', () => {
    expect(app).toBeTruthy();
  });

  it(`should have as title 'simple-web-app'`, () => {
    expect(app.title).toEqual('simple-web-app');
  });

  it('should render title', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('.content span')?.textContent).toContain('simple-web-app app is running!');
  });

  it('spyOn utility function calc to track it and all its arguments', () => {
    let calc = app.calc;
    let addSpy = spyOn(calc, 'add').and.returnValue(40);
    expect(app.add(1, 2)).toEqual(40);
    expect(addSpy).toHaveBeenCalled();
  })
});
