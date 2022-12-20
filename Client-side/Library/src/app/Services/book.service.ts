import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import Book from '../Entity/book';

const BASE_URL = 'http://localhost:1000'

@Injectable({
  providedIn: 'root'
})
export class BookService {
  saveBook(book: {
    bookname : String;
    bookgenre : String;
    bookauthor : String;
    bookprice : number;
    borrowedstatus : String;
}) {
  return this.http.post(BASE_URL + "/add/book" , book);
}

getbooks() {
  return this.http.get(BASE_URL + "/allbooks");
}

deletebooks(book: any) {
  return this.http.delete(BASE_URL + "/remove/" + book.id);
}

  constructor(private http: HttpClient) { }
}
