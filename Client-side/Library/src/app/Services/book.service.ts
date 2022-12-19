import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import Book from '../Entity/book';

const BASE_URL = 'http://localhost:5000/books'

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
  return this.http.post(BASE_URL, book);
}

getbooks() {
  return this.http.get(BASE_URL);
}

deletebooks(book: any) {
  return this.http.delete(BASE_URL + "/" + book.id);
}

  constructor(private http: HttpClient) { }
}
