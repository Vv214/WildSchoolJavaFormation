import { Component, EventEmitter, Output } from '@angular/core';
import {FormControl, FormGroup } from '@angular/forms';
import {ArticleService} from "../../Services/article.service";

@Component({
  selector: 'app-article-form',
  templateUrl: './article-form.component.html',
  styleUrls: ['./article-form.component.css']
})
export class ArticleFormComponent {
  articleForm = new FormGroup({
    title: new FormControl(''),
    content: new FormControl('')
  })

  articleService: ArticleService

  constructor(articleService: ArticleService) {
    this.articleService = articleService
  }

  // @Output()
  // articleEvent = new EventEmitter<any>()

  addArticle() {
    this.articleService.addArticle(this.articleForm.value)
    //this.articleEvent.emit(this.articleForm.value)
  }
}
