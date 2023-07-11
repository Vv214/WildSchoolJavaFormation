import { Component, EventEmitter, Output } from '@angular/core';
import {FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-comment-form',
  templateUrl: './comment-form.component.html',
  styleUrls: ['./comment-form.component.css']
})
export class CommentFormComponent {
  commentForm = new FormGroup({
    author: new FormControl(''),
    content: new FormControl('')
  })

  @Output()
  commentEvent = new EventEmitter<any>()

  addComment() {
    this.commentEvent.emit(this.commentForm.value)
  }

}
