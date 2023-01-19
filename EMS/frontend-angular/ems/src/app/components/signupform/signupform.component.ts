import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
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
        alert("Registered Successfully, Please login with Username and Password.");
        this.router.navigateByUrl('/loginform')
      }, function(error) {
        console.log(error);
        alert("Something went wrong, Please try again!")
      }
    )
  }

  redirectToSignin() {
    this.router.navigateByUrl('/loginform')
  }

  constructor(private userService : UserService,private router: Router ) { }

  ngOnInit(): void {
  }

}
