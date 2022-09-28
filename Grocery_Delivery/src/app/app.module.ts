import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { NavbarComponent } from './navbar/navbar.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';


import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FilterPipe } from './filter.pipe';
import { AddCartComponent } from './add-payment/add-cart.component';
import { UpdateCartComponent } from './update-payment/update-cart.component';
import { CartListComponent } from './payment-list/cart-list.component';


@NgModule({
  declarations: [
    HomeComponent,
    AppComponent,
    AddCartComponent,
    CartListComponent,
    UpdateCartComponent,
    NavbarComponent,
    FilterPipe


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
