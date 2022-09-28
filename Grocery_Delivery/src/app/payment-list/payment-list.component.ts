import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { payment } from '../payment';
import { paymentservice } from '../service/paymentservice';
@Component({
  selector: 'app-Payment-list',
  templateUrl: './Payment-list.component.html',
  styleUrls: ['./Payment-list.component.css']
})
export class PaymentListComponent implements OnInit {

  constructor(
    
    private paymentservice: paymentservice,
    private router: Router
// private readService:UploadFileService
  ) {}    

  Payment: payment[] = [];
  nameSearch: string = '';
  

  ngOnInit() : void {
    this.getPaymentsList();console.log("hi")
  }
 
 
  private getPaymentsList() {
    this.paymentservice.getPaymentsList().subscribe((data) => {
        this.Payment = data;
    });
      
  }
  update(){

    this.router.navigate(['']);

  }
  delete(){

    this.router.navigate(['']);

  }


}