import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Entity/book';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {

  onSubmit(data: any) {
    console.log(data);

  }

  title: String = "Add Books Details";

  book: Book = new Book();

  submit() {
    const observables = this.bookService.saveBook
      (this.book);
    observables.subscribe(
      (response: any) => {
        console.log(response);
        alert("Submitted Successfully");
      }, function (error) {
        console.log(error);
        alert("Something went wrong, Please try again!")
      }
    )
  }

  constructor(private bookService: BookService) { }

  ngOnInit(): void {
  }

}
