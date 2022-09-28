import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { payment } from '../payment';
import { paymentservice } from '../service/paymentservice';


@Component({
  selector: 'app-update-Payment',
  templateUrl: './update-Payment.component.html',
  styleUrls: ['./update-Payment.component.css']
})
export class UpdatePaymentComponent implements OnInit {

  updatePayment1: payment = new payment();
  constructor(
  private paymentservice: paymentservice,
  private router: Router
 
  ) {}

  ngOnInit(): void {}

  updatePayment() {
    this.paymentservice.updatePayment(this.updatePayment1).subscribe(
      (data) => {
        console.log(data);
        Swal.fire(
          "",
          'Payment Updated successfully',
            'success'    

         )

        this.router.navigate(['/paymentlist']);

    }

  );

}


goToPaymentList(): void {

  this.router.navigate(['/paymentlist']);

}


onSubmit() {

  console.log(this.updatePayment1);


  this.updatePayment();

}

}
