import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Signup from 'src/app/Entity/signup';
import { UserService } from 'src/app/services/user.service';
declare var $:any;
@Component({
  selector: 'app-reg-users',
  templateUrl: './reg-users.component.html',
  styleUrls: ['./reg-users.component.css']
})
export class RegUsersComponent implements OnInit {

 ShowEdit:boolean=false;
 users :Signup[] = [];
 user: Signup = new Signup();
 userId:number;
  constructor(private userService : UserService,private router:Router) { }


  deleteRow(signup: any, index: any) {
    const observables = this.userService.deleteUsers(signup);
    observables.subscribe((response:any) => {
      console.log(response);
      // this.users.splice(index, 1);
      this.GetAllUsers();
    })
  }

  editUser(userobj: any){
    this.ShowEdit=true;
    this.userId=userobj.id
    this.user=userobj
    
    // $("exampleModalCenter").modal
  }


  updateUser() {
    const observables = this.userService.updateuser(this.userId,this.user);
    observables.subscribe((response:any) => {
      console.log(response);
      // this.users.splice(index, 1);
      this.popClose();
      // this.Resetvalues();
      this.GetAllUsers();
    })
  }

  popClose(){
    this.ShowEdit=false;
    this.Resetvalues();
  }
  Resetvalues(){
    this.userId=undefined;
    this.user=undefined;

  }
  GetAllUsers(){
    const promise = this.userService.getUsers();
    promise.subscribe((response) => {
      console.log(response);
      this.users =response as Signup[];
   })
  }
  

  ngOnInit(): void {
   
this.GetAllUsers();
}

}
