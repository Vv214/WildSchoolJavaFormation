import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ArticleService {

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

  addArticle(article: any) {
    this.articles.push({
      title: article.title,
      content: article.content,
      comments: []
    })
  }

  addComment(comment: any, index: number) {
    this.articles[index].comments.push(comment)
  }

  // updateArticle(index: number) {
  //    this.articles[index].splice(index, 1);

  // }

  deleteArticle(index: number) {
    delete this.articles[index];
  }

  updateComment(indexArticle: number, indexCom: number) {

  }

  deleteComment(indexArticle: number, indexCom: number) {
    delete this.articles[indexArticle].comments[indexCom];
  }
}
