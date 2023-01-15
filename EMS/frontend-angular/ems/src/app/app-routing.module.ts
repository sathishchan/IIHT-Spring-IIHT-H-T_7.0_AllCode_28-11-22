import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpDetailsComponent } from './components/emp-details/emp-details.component';
import { HomeComponent } from './components/home/home.component';
import { LoginformComponent } from './components/loginform/loginform.component';
import { RegUsersComponent } from './components/reg-users/reg-users.component';
import { SignupformComponent } from './components/signupform/signupform.component';


const routes: Routes = [{path:"home", component:HomeComponent}, 
{path:"loginform", component:LoginformComponent},
{path:"signupform", component:SignupformComponent},
{path:"reguser", component:RegUsersComponent},
{path:"emp", component:EmpDetailsComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
