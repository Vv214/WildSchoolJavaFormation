import {Component, EventEmitter, Input, Output} from '@angular/core';
import {FormControl, FormGroup } from '@angular/forms';
import {ArticleService} from "../../Services/article.service";

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

  @Input()
  articleIndex: number

  articleService: ArticleService

  constructor(articleService: ArticleService) {
    this.articleService = articleService
    this.articleIndex = 0
  }

  addComment() {
    this.articleService.addComment(
      this.commentForm.value,
      this.articleIndex
    )
  }

}
