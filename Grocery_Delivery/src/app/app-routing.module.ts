import { Component,NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { HomeComponent } from './home/home.component';

import { ContactComponent } from './contact/contact.component';
import { NavbarComponent } from './navbar/navbar.component';

import { AddCartComponent } from './add-payment/add-cart.component';
import { CartListComponent } from './payment-list/cart-list.component';



const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'about',component:AboutComponent},
  {path:'addcart',component:AddCartComponent},
  {path:'contact',component:ContactComponent},
  {path:'cartlist',component:CartListComponent},
 // {path:'update-payment',component:UpdatePaymentComponent},
  {path:'navbar',component:NavbarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
