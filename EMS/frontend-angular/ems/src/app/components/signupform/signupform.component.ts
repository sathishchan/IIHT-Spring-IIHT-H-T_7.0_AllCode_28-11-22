import { Component, OnInit } from '@angular/core';
import Signup from 'src/app/Entity/signup';

import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-signupform',
  templateUrl: './signupform.component.html',
  styleUrls: ['./signupform.component.css']
})
export class SignupformComponent implements OnInit {

  onSubmit(data: any) {
    console.log(data);

  }

  signup : Signup = new Signup();

  submit() {
    const observables = this.userService.saveSignup
    (this.signup);
    observables.subscribe (
      (response:any) => {
        console.log(response);
        alert("submitted Successfully");
      }, function(error) {
        console.log(error);
        alert("Something went wrong, Please try again!")
      }
    )
  }

  constructor(private userService : UserService ) { }

  ngOnInit(): void {
  }

}
