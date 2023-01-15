import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbarmanager',
  templateUrl: './navbarmanager.component.html',
  styleUrls: ['./navbarmanager.component.css']
})
export class NavbarmanagerComponent implements OnInit {
LoggeduserRole:string;
  constructor() { }

  ngOnInit(): void {
    this.LoggeduserRole=sessionStorage.getItem('role')
  }

  logout(){
    this.LoggeduserRole=undefined;
    sessionStorage.clear()
  }

}
