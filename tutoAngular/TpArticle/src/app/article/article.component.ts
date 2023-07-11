import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent {
  @Input()
  title: string;
  @Input()
  content: string;
  @Input()
  comments: Array<any>;

  @Output()
  commentEvent = new EventEmitter<any>()

  constructor() {
    this.title = 'Default title';
    this.content = 'Default content';
    this.comments = []
  }

  addComment(values: any) {
    this.commentEvent.emit(values)
  }
}
