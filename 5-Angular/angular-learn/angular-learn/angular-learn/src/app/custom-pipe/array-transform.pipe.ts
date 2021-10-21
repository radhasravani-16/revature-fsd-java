import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name: 'arrayTransform'
})
export class ArrayTransformPipe implements PipeTransform {

    transform(array:string[], separator: string) : string {
        return array.join(' ' + separator + ' ');
    }

}