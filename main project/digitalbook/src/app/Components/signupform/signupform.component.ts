import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-signupform',
  templateUrl: './signupform.component.html',
  styleUrls: ['./signupform.component.css']
})
export class SignupformComponent implements OnInit {

  onSubmit(data: any) {
    console.log(data);

  }


  firstname: String="";
  lastname: String="";

  submit() {
    console.log("Hello" + this.firstname + " " + this.lastname);
    
 }

 
  constructor() { }

  ngOnInit(): void {
  }

}
