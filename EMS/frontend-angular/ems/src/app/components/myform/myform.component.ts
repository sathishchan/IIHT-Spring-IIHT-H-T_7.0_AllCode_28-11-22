import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-myform',
  templateUrl: './myform.component.html',
  styleUrls: ['./myform.component.css']
})
export class MyformComponent implements OnInit {
Employee:any;
  constructor(private userService:UserService) { }

  ngOnInit(): void {
    this.GetEmployeeById()
  }

  GetEmployeeById(){
    let userid=parseInt(sessionStorage.getItem('id'))
    const promise = this.userService.GetEmpById(userid);
    promise.subscribe((response) => {
      this.Employee=response[0];
      console.log(response);
    });
  }

}
