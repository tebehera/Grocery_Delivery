import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { payment } from '../payment';

import { paymentservice } from '../service/paymentservice';
@Component({
  selector: 'app-add-payment',
  templateUrl: './add-payment.component.html',
  styleUrls: ['./add-payment.component.css']
})
export class AddPaymentComponent implements OnInit {

  addPayment1: payment = new payment();
  constructor(
    private paymentservice: paymentservice,
    private router: Router

  ) {}

  ngOnInit(): void {}

  savepayment() {
    this.paymentservice.addPayment(this.addPayment1).subscribe(
      (data) => {
        console.log(data);
        Swal.fire(
          "",
          'payment is created successfully',
            'success'    

        )

        this.router.navigate(['/paymentlist']);

    },



  );

}



goTopaymentList(): void {

  this.router.navigate(['/paymentlist']);

}



onSubmit() {

  console.log(this.addPayment1);


  this.savepayment();



}

}
