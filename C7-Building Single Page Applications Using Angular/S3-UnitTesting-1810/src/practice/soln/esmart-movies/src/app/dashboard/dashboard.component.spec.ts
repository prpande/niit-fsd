import { ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DashboardComponent } from './dashboard.component';
import { FormsModule } from '@angular/forms';

describe('DashboardComponent display movies', () => {
  let component: DashboardComponent;
  let fixture: ComponentFixture<DashboardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [FormsModule],
      declarations: [DashboardComponent]
    });
    fixture = TestBed.createComponent(DashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('Should render 6 movie card details', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelectorAll('.card')?.length).toBe(6);
  });

  it('should have a title "List of Movies"', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('h1')?.textContent).toContain('List of Movies');
  });

  it('Should contain a movie with name "jurassic world" and its rating', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('.title')?.textContent?.toLowerCase()).toContain('jurassic world');
    // Add code to verify the rating value
    let index = compiled.querySelector('.title')?.textContent?.toLowerCase().indexOf('jurassic world');
    expect(compiled.querySelectorAll('.rating')?.item(index as number).textContent).toBe('6.9');
  });
});

describe('DashboardComponent search movies', () => {
  let component: DashboardComponent;
  let fixture: ComponentFixture<DashboardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [FormsModule],
      declarations: [DashboardComponent]
    });
    fixture = TestBed.createComponent(DashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Should contain 2 buttons: search and reset button', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelectorAll('button[type=button]').length).toBe(2);
  });

  it('Should contain a Search button with "GO" as its caption', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.getElementsByTagName('button')[0].textContent).toEqual('Go');
  });

  it('Should contain a Cancel button with "Clear" as its caption', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.getElementsByTagName('button')[1].textContent).toEqual('Clear');
  });

  it('Should contain a search text box', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelectorAll('input[type=text]').length).toBe(1);
  });

  it('Should load the movie when searched by its full name', async () => {
    const compiled = fixture.nativeElement as HTMLElement;
    fixture.detectChanges();
    await fixture.whenStable().then(() => {
      let input = fixture.debugElement.query(By.css('input'));
      let el = input.nativeElement;
      el.value = "spiderman";
      el.dispatchEvent(new Event('input'));
      expect(component.searchText).toBe('spiderman');
      let button = fixture.debugElement.query(By.css('button'));
      button.triggerEventHandler('click', null);
      fixture.detectChanges();
      expect(compiled.querySelectorAll('.card')?.length).toBe(1);
      //write code to verify the title is spiderman and rating is 8.6
      console.log(compiled.querySelectorAll('.card')?.item(0).querySelector('.title')?.textContent?.toLowerCase());
      expect(compiled.querySelectorAll('.card')?.item(0).querySelector('.title')?.textContent?.toLowerCase()).toBe('spiderman');
      console.log(compiled.querySelectorAll('.card')?.item(0).querySelector('.rating')?.textContent)
      expect(compiled.querySelectorAll('.card')?.item(0).querySelector('.rating')?.textContent).toBe('8.3');
    })
  });

  it('Should load all the movies when no text is entered in the search box', async () => {
    const compiled = fixture.nativeElement as HTMLElement;
    fixture.detectChanges();
    await fixture.whenStable().then(() => {
      let button = fixture.debugElement.query(By.css('button'));
      button.triggerEventHandler('click', null);
      fixture.detectChanges();
      expect(compiled.querySelectorAll('.card')?.length).toBe(6);
    })
  });
});
