import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {
  constructor(private http:HttpClient) {
    
  }
  ans:any = undefined
  async compute(evt:any){
    let res = await this.http.post(`http://localhost:8080/${evt.choice}`,{"a":evt.a,"b":evt.b}).toPromise();
    this.ans = res
    console.log(res)
  }



}
