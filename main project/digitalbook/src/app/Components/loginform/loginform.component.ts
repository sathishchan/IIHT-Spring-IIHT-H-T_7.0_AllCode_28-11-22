import { Component, OnInit } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import Login from 'src/app/Entity/login';
import { UserService } from 'src/app/Services/signup.service';

@Component({
  selector: 'app-loginform',
  templateUrl: './loginform.component.html',
  styleUrls: ['./loginform.component.css']
})
export class LoginformComponent implements OnInit {

  onSubmit(data: any) {
    console.log(data);
}

login: Login = new Login();


  constructor(private userService : UserService, private router : Router ) { }

  ngOnInit(): void {
  }

  submit() {
    const observables = this.userService.saveLogin
    (this.login);
    observables.subscribe (
      (response:any) => {
        sessionStorage.setItem('utoken',response.jwtToken);
        sessionStorage.setItem('uname',response.username);
        sessionStorage.setItem('urole',response.role);
        if(response.role == 'author'){
          this.router.navigateByUrl('/book');
        }
        else if(response.role == 'reader'){
          this.router.navigateByUrl('/searchBook');
        }
        
  
        console.log(response);
        
      }, function(error) {
        console.log(error);
        alert("Something went wrong, Please try again!")
        
      }
      )
    }

    public SignupRedirect(){
      this.router.navigateByUrl('/signupform')
    }
}
