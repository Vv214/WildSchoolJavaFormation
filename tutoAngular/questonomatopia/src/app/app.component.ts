import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // onomatopias: Array<any>

  // constructor() {
  //   this.onomatopias = ['Wazaaaaa', 'TOttoooooooooooooooo', 'J ai faim'];
  // }

  // onReceiveNewOnomatopia(value: any): void {
  //   this.onomatopias.push(value);
  // }
  nombres: number[] = [];

  ngOnInit() {
    for (let i = 1; i <= 48; i++) {
      this.nombres.push(i);
    }
  }
}