import { ComponentFixture, TestBed } from '@angular/core/testing';


import { AddPaymentComponent } from './add-payment.component';



describe('AddPaymenComponent', () => {

  let component: AddPaymentComponent;

  let fixture: ComponentFixture<AddPaymentComponent>;



  beforeEach(async () => {

    await TestBed.configureTestingModule({

      declarations: [ AddPaymentComponent ]

    })

    .compileComponents();

  });



  beforeEach(() => {

    fixture = TestBed.createComponent(AddPaymentComponent);

    component = fixture.componentInstance;

    fixture.detectChanges();

  });



  it('should create', () => {

    expect(component).toBeTruthy();

  });

});

