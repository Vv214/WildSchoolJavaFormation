import { Component, Input } from '@angular/core';
import { ArticleService } from 'src/app/Services/article.service';

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
  @Input()
  index: number;

  articleService!: ArticleService;

  constructor(articleService: ArticleService) {
    this.author = 'Default author';
    this.content = 'Default content';
    this.index = 0;
    this.articleService = articleService;
  }

  deleteComment() {
    this.articleService.deleteComment(this.index);
  }

}
