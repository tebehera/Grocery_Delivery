import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { cart } from '../cart';
import { cartservice } from '../service/cartservice';


@Component({
  selector: 'app-update-Cart',
  templateUrl: './update-Cart.component.html',
  styleUrls: ['./update-Cart.component.css']
})
export class UpdateCartComponent implements OnInit {

  updateCart1: cart = new cart();
  constructor(
  private cartservice: cartservice,
  private router: Router
 
  ) {}

  ngOnInit(): void {}

  updateCart() {
    this.cartservice.updateCart(this.updateCart1).subscribe(
      (data) => {
        console.log(data);
        Swal.fire(
          "",
          'Cart Updated successfully',
            'success'    

         )

        this.router.navigate(['/cartlist']);

    }

  );

}


goToCartList(): void {

  this.router.navigate(['/cartlist']);

}


onSubmit() {

  console.log(this.updateCart1);


  this.updateCart();

}

}
