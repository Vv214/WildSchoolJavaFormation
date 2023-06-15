import { Component } from '@angular/core';

@Component({
  selector: 'app-my-form',
  templateUrl: './my-form.component.html',
  styleUrls: ['./my-form.component.css']
})
export class MyFormComponent {

  model: Order = new Order("", 0, new Date(), "");

  constructor() { }
  onSubmit(): void {
    console.log(this.model);
  };

}
export class Order {


  constructor(
    public title: string,
    public quantity: number,
    public date: Date,
    public email: string
  ) { }

}