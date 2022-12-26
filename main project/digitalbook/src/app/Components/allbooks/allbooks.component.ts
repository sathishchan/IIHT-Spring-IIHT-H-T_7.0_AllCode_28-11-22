import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Entity/book';
import { UserService } from 'src/app/Services/signup.service';

@Component({
  selector: 'app-allbooks',
  templateUrl: './allbooks.component.html',
  styleUrls: ['./allbooks.component.css']
})
export class AllbooksComponent implements OnInit {

  book : Book[] = [];

  constructor(private userService : UserService ) { }

  

  ngOnInit(): void {
    const promise = this.userService.viewBook();
    promise.subscribe((response) => {
      console.log(response);
      this.book = response as Book[];
    })

  }

}
