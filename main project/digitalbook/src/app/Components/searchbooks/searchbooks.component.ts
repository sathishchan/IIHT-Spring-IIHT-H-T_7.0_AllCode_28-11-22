import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SearchBook } from 'src/app/Entity/book';
import { UserService } from 'src/app/Services/signup.service';

@Component({
  selector: 'app-searchbooks',
  templateUrl: './searchbooks.component.html',
  styleUrls: ['./searchbooks.component.css']
})
export class SearchbooksComponent implements OnInit {
  isViewBook:Boolean=false;
  books:any[]=[];
  onSubmit(data: any) {
    console.log(data);
}

searchBook: SearchBook = new SearchBook();

submit() {
  const observables = this.userService.searchBook
  (this.searchBook);
  observables.subscribe (
    (response:any) => {
      console.log(response);
      this.books=response;
      if(this.books != undefined && this.books.length > 0){
        this.isViewBook=true;
      }
      else{
        alert('No books in this filter criteria');
      }
      // alert("submitted Successfully");
      
    }, function(error) {
      console.log(error);
      alert("Something went wrong, Please try again!");
      
    })
  }

  constructor(private userService : UserService, private router:Router ) { }

  ngOnInit(): void {
    var role=sessionStorage.getItem('urole') 
    if(role != undefined && role =='author'){
      this.router.navigateByUrl('/author')
    }
  }
  
public toggleView(){
  this.isViewBook= this.isViewBook ? false:true;
}
}
