
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { cart } from '../cart';



@Injectable({
    providedIn:'root'
})
export class cartservice{
   
    constructor(private httpClient: HttpClient) {}

  getCartsList(): Observable<cart[]> {
    return this.httpClient.get<cart[]>(
      'http://localhost:8095/v1/carts'
    );
  }
  addCart(Cart: cart): Observable<cart>{
    return this.httpClient.post<cart>(
        "http://localhost:8095/v1/cart",Cart
    ).pipe(catchError(this.handleError));
  }
  updateCart(election: cart): Observable<cart>{
    return this.httpClient.put<cart>(
        "http://localhost:8095/v1/cart",election
        ).pipe(catchError(this.handleError));
    }  

  handleError(error: HttpErrorResponse) {

    if (error.status === 0) {

     // A client-side or network error occurred. Handle it accordingly.

     console.error('An error occurred:', error.error);

   } else {

     // The backend returned an unsuccessful response code.

     // The response body may contain clues as to what went wrong.

     console.error(

       `Backend returned code ${error.status}, body was: `, error.error);

   }

   // Return an observable with a user-facing error message.

   return throwError(() => new Error('Something bad happened; please try again later.'));

 }
}