import { Component, EventEmitter, OnDestroy, OnInit, Output } from '@angular/core';
import { Observable, Subject, Subscription, debounceTime, distinctUntilChanged } from 'rxjs';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit, OnDestroy {
  initialValue: string = "";
  debounceTime: number = 300;

  @Output()
  textChangeEvent: EventEmitter<string>;

  inputTracker: Subject<string>;

  filteredEventTrigger: Observable<string>;

  subscriptions: Subscription[];

  constructor() {
    this.textChangeEvent = new EventEmitter<string>();
    this.inputTracker = new Subject<string>();
    this.filteredEventTrigger = this.inputTracker.pipe(
                                debounceTime(this.debounceTime),
                                distinctUntilChanged());
    this.subscriptions = [];
  }

  ngOnInit(): void {
    this.subscriptions.push(
      this.filteredEventTrigger.subscribe(searchText => {
        this.textChangeEvent.emit(searchText);
      })
    );
  }
  
  ngOnDestroy(): void {
    this.subscriptions.forEach(sub => sub.unsubscribe());
  }

  onInput(event: any){
    this.inputTracker.next(event.target.value);
  }
}
