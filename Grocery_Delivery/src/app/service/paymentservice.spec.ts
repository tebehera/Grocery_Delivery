import { TestBed } from "@angular/core/testing"
import { paymentservice } from "./paymentservice";



describe('paymentservice',()=>{
    let service: paymentservice;

    beforeEach(() => {
      TestBed.configureTestingModule({});
      service = TestBed.inject(paymentservice);
    });
  
    it('should be created', () => {
      expect(service).toBeTruthy();
    });
});