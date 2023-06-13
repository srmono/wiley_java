import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'myuppercase'
})

export class MyuppercasePipe implements PipeTransform {

  transform(value: string): string {
    //traformation logic.....
    if(!value) return value;

    // if(typeof value !== 'string'){
    //   throw Error("invalid argument");
    // }
    return value.toUpperCase();
  }

}
