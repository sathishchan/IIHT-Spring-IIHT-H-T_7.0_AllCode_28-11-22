import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Components/home/home.component';
import { UserformComponent } from './Components/userform/userform.component';

const routes: Routes = [{path:"",
component:HomeComponent}, {path:"register" ,
component:UserformComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
