import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Book from 'src/app/Entity/book';
import { UserService } from 'src/app/Services/signup.service';

@Component({
  selector: 'app-createbooks',
  templateUrl: './createbooks.component.html',
  styleUrls: ['./createbooks.component.css']
})
export class CreatebooksComponent implements OnInit {

  onSubmit(data: any) {
    console.log(data);
}

book: Book = new Book();

submit() {
  const observables = this.userService.saveBook
  (this.book);
  observables.subscribe (
    (response:any) => {
      console.log(response);
      alert("Book created Successfully");
      
    }, function(error) {
      console.log(error);
      alert("Something went wrong, Please try again!")
      
    })
  }

  constructor(private userService : UserService,private router:Router ) { }

  ngOnInit(): void {
    var role=sessionStorage.getItem('urole') 
    if(role != undefined && role =='reader'){
      this.router.navigateByUrl('/searchBook')
    }
  }

}
