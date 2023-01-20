import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signout',
  templateUrl: './signout.component.html',
  styleUrls: ['./signout.component.css']
})
export class SignoutComponent implements OnInit {
  username:string;
  userrole:string;
  constructor(private router:Router) { }

  ngOnInit(): void {
    this.username=sessionStorage.getItem('uname');
    this.userrole=sessionStorage.getItem('urole');
  }

  public logout(){
    var res=confirm('Are you sure wants to logout');
    if(res){
      sessionStorage.clear();
      this.router.navigateByUrl('/loginform');
    }
  }

}
