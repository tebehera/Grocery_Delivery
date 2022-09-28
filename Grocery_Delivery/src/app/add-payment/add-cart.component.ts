import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { cart } from '../cart';
//import { payment } from '../payment';

import { cartservice } from '../service/cartservice';
@Component({
  selector: 'app-add-cart',
  templateUrl: './add-cart.component.html',
  styleUrls: ['./add-cart.component.css']
})
export class AddCartComponent implements OnInit {

  addCart1: cart = new cart();
  constructor(
    private cartservice: cartservice,
    private router: Router

  ) {}

  ngOnInit(): void {}

  savecart() {
    this.cartservice.addCart(this.addCart1).subscribe(
      (data) => {
        console.log(data);
        Swal.fire(
          "",
          'cart is created successfully',
            'success'    

        )

        this.router.navigate(['/cartlist']);

    },



  );

}



goTocartList(): void {

  this.router.navigate(['/cartlist']);

}



onSubmit() {

  console.log(this.addCart1);


  this.savecart();



}

}
