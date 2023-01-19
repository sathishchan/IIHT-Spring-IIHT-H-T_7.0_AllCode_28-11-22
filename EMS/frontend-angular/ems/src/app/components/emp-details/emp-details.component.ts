import { Component, OnInit } from '@angular/core';
import Emp from 'src/app/Entity/emp';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  ShowEdit:boolean=false;
  employees :Emp[] = [];
  emp: Emp = new Emp();
  empId:number;

  constructor(private userService : UserService) { }

  GetAllEmployees() {
    const promise = this.userService.getEmpDetails();
    promise.subscribe((response) => {
      console.log(response);
      this.employees = response as Emp[];
    })
  }

  
  editEmp(empobj: any) {
    this.ShowEdit=true;
    this.empId=empobj.id
    this.emp=empobj
  }

  popClose(){
    this.ShowEdit=false;
    this.Resetvalues();
  }
  Resetvalues(){
    this.empId =undefined;
    this.emp=undefined;

  }

  ngOnInit(): void {
    this.GetAllEmployees();
  }

}
