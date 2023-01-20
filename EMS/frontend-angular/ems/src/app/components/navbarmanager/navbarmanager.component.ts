import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbarmanager',
  templateUrl: './navbarmanager.component.html',
  styleUrls: ['./navbarmanager.component.css']
})
export class NavbarmanagerComponent implements OnInit {
LoggeduserRole:string;
Loggedusername:string;
  constructor(private router:Router) { }

  ngOnInit(): void {
    this.LoggeduserRole=sessionStorage.getItem('role')
    this.Loggedusername=sessionStorage.getItem('name')
  }

  logout(){
    this.LoggeduserRole=undefined;
    this.Loggedusername=undefined;
    sessionStorage.clear()
    this.router.navigateByUrl('/loginform')
    
  }

}
