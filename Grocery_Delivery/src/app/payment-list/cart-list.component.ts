import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { cart } from '../cart';

import { cartservice } from '../service/cartservice';
@Component({
  selector: 'app-Cart-list',
  templateUrl: './Cart-list.component.html',
  styleUrls: ['./Cart-list.component.css']
})
export class CartListComponent implements OnInit {

  constructor(
    
    private cartservice: cartservice,
    private router: Router
// private readService:UploadFileService
  ) {}    

  Cart: cart[] = [];
  nameSearch: string = '';
  

  ngOnInit() : void {
    this.getCartsList();console.log("hi")
  }
 
 
  private getCartsList() {
    this.cartservice.getCartsList().subscribe((data) => {
        this.Cart = data;
    });
      
  }
  update(){

    this.router.navigate(['']);

  }
  delete(){

    this.router.navigate(['']);

  }


}