import {Component, OnInit} from '@angular/core';
import {ArticleService} from "../Services/article.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  articles!: Array<any>
  articleService: ArticleService

  constructor(articleService : ArticleService) {
    this.articleService = articleService
  }

  ngOnInit() {
    this.articles = this.articleService.articles
  }
}
