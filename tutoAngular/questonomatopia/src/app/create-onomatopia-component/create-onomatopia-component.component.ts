import { Component, EventEmitter, Output } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-create-onomatopia-component',
  templateUrl: './create-onomatopia-component.component.html',
  styleUrls: ['./create-onomatopia-component.component.css']
})
export class CreateOnomatopiaComponentComponent {

  @Output()
  createOnomatopia = new EventEmitter<any>();

  onomatopiaForm = new FormGroup({
    onomatopia: new FormControl('')
  })
  onReceiveNewOnomatopia(): void {
    this.createOnomatopia.emit(this.onomatopiaForm.value.onomatopia);
  }
}
