import { Component, EventEmitter, Output } from '@angular/core';
import {FormControl, FormGroup } from '@angular/forms';

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

  @Output()
  articleEvent = new EventEmitter<any>()

  addArticle() {
    this.articleEvent.emit(this.articleForm.value)
  }
}
