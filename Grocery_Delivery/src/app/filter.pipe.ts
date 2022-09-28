import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(value: any, searchTerm: any): any {
    return value.filter(function (search: { paymentName: string | any[] }) {
      return search.paymentName.indexOf(searchTerm) > -1;
    });
  }
}