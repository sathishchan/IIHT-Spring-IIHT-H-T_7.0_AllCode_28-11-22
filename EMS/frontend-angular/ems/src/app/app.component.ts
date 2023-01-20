import { Component } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ems';
  ShowNav:boolean=false;
  constructor(private router:Router){
    this.router.events.subscribe((e) => {
      if (e instanceof NavigationEnd) {
        if(e.url.indexOf('/loginform') == -1 && e.url.indexOf('/signupform') == -1){
          if(sessionStorage.getItem('name') == undefined){
            if(e.url.indexOf('/loginform') != -1 ){
              this.router.navigateByUrl('loginform')

            }
            else if(e.url.indexOf('/singupform') != -1){
              this.router.navigateByUrl('signupform')

            }
            else{
              this.router.navigateByUrl('loginform')
            }
          }
          else{
            this.ShowNav=true;
            console.log(e.url.indexOf('/loginform'))
          }         
        }
        else{
          this.ShowNav=false;
        }
        console.log(e.url);
        
      }
    });
  }
  ngOnInit() {
    console.log('app component')
    console.log(sessionStorage.getItem('name'));
  }

  
}






