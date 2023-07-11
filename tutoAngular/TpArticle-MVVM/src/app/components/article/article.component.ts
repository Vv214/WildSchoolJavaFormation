import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ArticleService } from '../../Services/article.service';

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
  @Input()
  index: number

  articleService: ArticleService;

  constructor(articleService: ArticleService) {
    this.title = 'Default title';
    this.content = 'Default content';
    this.comments = []
    this.index = 0
    this.articleService = articleService;
  }

  removeArticle() {
    this.articleService.deleteArticle(this.index);
  }
}
