import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-myform',
  templateUrl: './myform.component.html',
  styleUrls: ['./myform.component.css']
})
export class MyformComponent implements OnInit {
Employee:any;
Job:any;
  constructor(private userService:UserService) { }

  ngOnInit(): void {
    this.GetEmployeeById()
  }

  GetEmployeeById(){
    let userid=parseInt(sessionStorage.getItem('id'))
    const promise = this.userService.getEmpById(userid);
    promise.subscribe((response) => {
      this.Employee=response["responseData"]["employee"];
      if(response["responseData"]["job"] != undefined ){
        this.Job=response["responseData"]["job"];
        console.log(this.Job)
      }

      console.log(response);
    });
  }

}
