import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Login from 'src/app/Entity/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-loginform',
  templateUrl: './loginform.component.html',
  styleUrls: ['./loginform.component.css']
})
export class LoginformComponent implements OnInit {

  onSubmit(data: any) {
    console.log(data);
}

  title:String = "please fill the form below"

 login :Login = new Login();  

  save() {
    //console.log("hello" +this.user.username + " " +this.user.password);
    const observables = this.userService.saveUser
    (this.login);
    observables.subscribe (
      (response:any) => {
        console.log(response);
        sessionStorage.setItem('role',response.role);
        sessionStorage.setItem('id',response.id);
        sessionStorage.setItem('name',response.username);

        alert("Successfully login");
        if(response.role == 'manager'){
          this.router.navigateByUrl('/reguser')

        }
        else{
          alert("role: "+response.role);
          this.router.navigateByUrl('/home')
        }
      }, function(error) {
        console.log(error);
        alert("Something went wrong, Please try again!")
      }
    )
  }

  public SignupRedirect(){
    this.router.navigateByUrl('/signupform')
  }
  
  constructor(private userService : UserService,private router:Router ) { }

  ngOnInit(): void {
  }

}
