import { Component } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {

  model = new User('', '', '', '');

  constructor() { }

  onSubmit() {
    console.log(this.model);
  }

}
export class User {

  constructor(

    public email: string,
    public firstName: string,
    public lastName: string,
    public password: string
  ) { }
}
