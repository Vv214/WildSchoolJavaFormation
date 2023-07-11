import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  articles: Array<any>

  constructor() {
    this.articles = [
      {
        title: 'titre1',
        content: 'blabla',
        comments: [
          {
            author: 'Rocky',
            content: 'azertyuio'
          },
          {
            author: 'Rocky',
            content: 'azertyuio'
          },
          {
            author: 'Rocky',
            content: 'azertyuio'
          }
        ]
      },
      {
        title: 'titre2',
        content: 'blabla',
        comments: [
          {
            author: 'Rocky',
            content: 'azertyuio'
          },
          {
            author: 'Rocky',
            content: 'azertyuio'
          }
        ]
      },
      {
        title: 'titre3',
        content: 'blabla',
        comments: [
          {
            author: 'Rocky',
            content: 'azertyuio'
          },
          {
            author: 'Rocky',
            content: 'azertyuio'
          },
          {
            author: 'Rocky',
            content: 'azertyuio'
          }
        ]
      }
    ]
  }

  addArticle(values: any) {
    this.articles.push({
      title: values.title,
      content: values.content,
      comments: []
    })
  }

  addComment(values: any, index: number) {
    this.articles[index].comments.push({
      author: values.author,
      content: values.content
    })
  }
}
