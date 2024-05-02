import { Component,Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-fields',
  templateUrl: './fields.component.html',
  styleUrls: ['./fields.component.css']
})
export class FieldsComponent {
  a = 0
  b = 0
  choice = "add"

  setChoice(evt:Event){
    this.choice = (<HTMLInputElement>evt.target).value;
  }


  @Output() evt = new EventEmitter();

  fire(){
    this.evt.emit({"a":this.a,"b":this.b,"choice":this.choice})
  }
}
