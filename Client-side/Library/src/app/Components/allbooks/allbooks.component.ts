import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Entity/book';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-allbooks',
  templateUrl: './allbooks.component.html',
  styleUrls: ['./allbooks.component.css']
})
export class AllbooksComponent implements OnInit {

  book: Book[] = [];

  constructor(private bookSerive: BookService) { }

  sort() {
    this.book.sort((book1, book2) => {
      return book1.bookprice - book2.bookprice;
    })
  }

  deletebooks(book: any, index: any) {
    const observables = this.bookSerive.deletebooks(book);
    observables.subscribe((response: any) => {
      console.log(response);
      this.book.splice(index, 1);
    })
  }

  ngOnInit(): void {
    const promise = this.bookSerive.getbooks();
    promise.subscribe((response) => {
      console.log(response);
      this.book = response as Book[];
    })
  }

}
