import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DashboardComponent } from './dashboard.component';
import { FormsModule } from '@angular/forms';
import { By } from '@angular/platform-browser';

describe('DashboardComponent', () => {
  let component: DashboardComponent;
  let fixture: ComponentFixture<DashboardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports:[FormsModule],
      declarations: [DashboardComponent]
    });
    fixture = TestBed.createComponent(DashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should render 5 note card details displayed', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelectorAll('.note-card')?.length).toBe(5);
  });

  it('should contain a search button with "Search" as its caption', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.getElementsByTagName('button')[0].textContent).toEqual('Search');
  });

  it('should contain a search text box', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelectorAll('input[type=text]').length).toBe(1);
  });

  it('should contain a note with title as "sample-note"', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('.note-title')?.textContent?.toLowerCase()).toContain('sample-note');
  });

  it('should load all the notes when no text is entered in the search box', async () => {
    const compiled = fixture.nativeElement as HTMLElement;
    fixture.detectChanges();
    await fixture.whenStable().then(() => {
      let button = fixture.debugElement.query(By.css('button'));
      button.triggerEventHandler('click', null);
      fixture.detectChanges();
      expect(compiled.querySelectorAll('.note-card')?.length).toBe(5);
    })
  });

  it('should load the correct note when searched by its full title', async () => {
    const compiled = fixture.nativeElement as HTMLElement;
    fixture.detectChanges();
    await fixture.whenStable().then(() => {
      let input = fixture.debugElement.query(By.css('input'));
      let el = input.nativeElement;
      el.value = "sample-note";
      el.dispatchEvent(new Event('input'));
      expect(component.searchText).toContain("sample-note");
      let button = fixture.debugElement.query(By.css('button'));
      button.triggerEventHandler('click', null);
      fixture.detectChanges();
      expect(compiled.querySelectorAll('.note-card')?.length).toBe(1);
      expect(compiled.querySelectorAll('.note-card')?.item(0).querySelector('.note-title')?.textContent?.toLowerCase()).toContain("sample-note");
    })
  });

  it('should load all the matching notes when searched by partial text', async () => {
    const compiled = fixture.nativeElement as HTMLElement;
    fixture.detectChanges();
    await fixture.whenStable().then(() => {
      let input = fixture.debugElement.query(By.css('input'));
      let el = input.nativeElement;
      el.value = "ref";
      el.dispatchEvent(new Event('input'));
      expect(component.searchText).toBe("ref");
      let button = fixture.debugElement.query(By.css('button'));
      button.triggerEventHandler('click', null);
      fixture.detectChanges();
      expect(compiled.querySelectorAll('.note-card')?.length).toBe(2);
      expect(compiled.querySelectorAll('.note-title')[0].textContent?.toLowerCase()).toContain("refactor practice exercise");
      expect(compiled.querySelectorAll('.note-title')[1].textContent?.toLowerCase()).toContain("refactor challenge");
    })
  });

  it('should display no note when partial text entered has no matching notes', async () => {
    const compiled = fixture.nativeElement as HTMLElement;
    fixture.detectChanges();
    await fixture.whenStable().then(() => {
      let input = fixture.debugElement.query(By.css('input'));
      let el = input.nativeElement;
      el.value = "zxc";
      el.dispatchEvent(new Event('input'));
      expect(component.searchText).toBe("zxc");
      let button = fixture.debugElement.query(By.css('button'));
      button.triggerEventHandler('click', null);
      fixture.detectChanges();
      expect(compiled.querySelectorAll('.note-card')?.length).toBe(0);
    })
  });
});
