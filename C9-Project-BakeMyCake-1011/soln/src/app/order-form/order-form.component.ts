import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Item } from 'src/models/item';
import { OrderService } from '../services/order.service';
import { Order } from 'src/models/order';
import { RestErrorHandlerService } from '../services/rest-error-handler.service';
import { RouterService } from '../services/router.service';
import { IndiaStatesService } from '../services/india-states.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-order-form',
  templateUrl: './order-form.component.html',
  styleUrls: ['./order-form.component.css']
})
export class OrderFormComponent implements OnInit {

  @Input()
  item?: Item;
  @Output()
  orderPlacedEvent: EventEmitter<boolean>;

  minDate: Date;
  orderForm: FormGroup;
  states: string[];

  constructor(private fb: FormBuilder, private orderService: OrderService, private restErrorSvc: RestErrorHandlerService, private routerSvc: RouterService, private statesService: IndiaStatesService, private snackBar: MatSnackBar) {
    this.minDate = new Date();
    this.orderForm = this.fb.group({
      customerInfo: this.fb.group({
        name: ['', [Validators.required, Validators.minLength(2)]],
        email: ['', [Validators.required, Validators.pattern(/^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i)]],
        phone: ['', [Validators.required, Validators.pattern(/^[789]\d{9,9}$/)]],
        address: this.fb.group({
          line1: ['', [Validators.required]],
          line2: [''],
          landmark: [''],
          city: ['', [Validators.required]],
          state: ['', [Validators.required]],
          pincode: ['', [Validators.required, Validators.pattern(/^[1-9]{1}[0-9]{5}$/)]],
        })
      }),
      item: this.fb.group({
        id: [''],
        name: [''],
        quantity: ['1', [Validators.required, Validators.min(1)]],
        category: [''],
      }),
      totalAmount: [''],
      instructions: [''],
      orderDate: [''],
      deliveryDate: ['', [Validators.required]]
    });
    this.orderPlacedEvent = new EventEmitter<boolean>();
    this.states = statesService.States;
  }

  get cxName() { return this.orderForm.get('customerInfo.name'); }
  get cxEmail() { return this.orderForm.get('customerInfo.email'); }
  get cxPhone() { return this.orderForm.get('customerInfo.phone'); }

  get cxAddressLine1() { return this.orderForm.get('customerInfo.address.line1'); }
  get cxAddressLine2() { return this.orderForm.get('customerInfo.address.line2'); }
  get cxAddressLandmark() { return this.orderForm.get('customerInfo.address.landmark'); }
  get cxAddressCity() { return this.orderForm.get('customerInfo.address.city'); }
  get cxAddressState() { return this.orderForm.get('customerInfo.address.state'); }
  get cxAddressPincode() { return this.orderForm.get('customerInfo.address.pincode'); }

  get itemQuantity() { return this.orderForm.get("item.quantity"); }
  get deliveryDate() { return this.orderForm.get("deliveryDate"); }

  get totalAmount() { return this.orderForm.get("totalAmount"); }
  get instructions() { return this.orderForm.get("instructions"); }

  ngOnInit(): void {
  }

  computeTotalAmount() {
    if (this.item?.price && this.itemQuantity?.value) {
      return +this.itemQuantity?.value * +this.item?.price;
    }

    return 0;
  }

  onSubmit() {

    let order = this.orderForm.value as Order;
    order.item!.id = this.item?.id;
    order.item!.name = this.item?.name;
    order.item!.category = this.item?.category;
    order.orderDate = (new Date()).toISOString();
    order.totalAmount = this.computeTotalAmount();

    this.orderService.saveOrder(order).subscribe({
      next: data => {
        this.snackBar.open(`Order placed successfully!\nTotal Amount: \u20B9 ${order.totalAmount}.`,
          'Ok',
          { duration: 10000, panelClass: ['mat-toolbar','mat-primary']})
        this.orderPlacedEvent.emit(true);
        this.routerSvc.goHome();
      },
      error: err => {
        this.restErrorSvc.processPostError(err);
      }
    })
  }
}
