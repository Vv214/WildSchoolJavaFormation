import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-comment',
  templateUrl: './comment.component.html',
  styleUrls: ['./comment.component.css']
})
export class CommentComponent {
  @Input()
  author: string;
  @Input()
  content: string;

  constructor() {
    this.author = 'Default author';
    this.content = 'Defualt content'
  }

}
