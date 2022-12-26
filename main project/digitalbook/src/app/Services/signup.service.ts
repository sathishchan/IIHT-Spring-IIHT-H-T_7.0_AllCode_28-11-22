import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const BASE_URL = 'http://localhost:2001';
const Book_BASE_URL = 'http://localhost:2002';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  //create user details
  saveSignup(signup: {
    firstname: String;
    lastname: String;
    username: String;
    password: String;
    email: String;
    role: String;
  }) {
    return this.http.post(BASE_URL + "/signup", signup);
  }

  //login
  saveLogin(login: {
    username: String;
    password: String;
  }) {
    return this.http.post(BASE_URL + "/signin", login);
  }

  //Createbook
  saveBook(book: {
    image: String;
    title: String;
    category: String;
    price: number;
    author: String;
    publisher: String;
    publishedDate: String;
    isActive: Boolean;
    content: String;
  }) {
    return this.http.post(Book_BASE_URL +"/createBook", book);
  }


  //viewbook
  viewBook() {
    return this.http.get(BASE_URL);
  }

  //searchbook
  searchBook(search: {
    title: String;
    author: String;
    publisher: String;
    category: String;
  }) {
      return this.http.post(Book_BASE_URL + "/search", search);
  }

  constructor(private http: HttpClient) { }
}
