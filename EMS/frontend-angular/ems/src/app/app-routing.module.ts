import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpDetailsComponent } from './components/emp-details/emp-details.component';
import { HomeComponent } from './components/home/home.component';
import { JobDetailsComponent } from './components/job-details/job-details.component';
import { JobuserviewComponent } from './components/jobuserview/jobuserview.component';
import { LoginformComponent } from './components/loginform/loginform.component';
import { MyformComponent } from './components/myform/myform.component';
import { RegUsersComponent } from './components/reg-users/reg-users.component';
import { SignoutComponent } from './components/signout/signout.component';
import { SignupformComponent } from './components/signupform/signupform.component';
import { ViewjobComponent } from './components/viewjob/viewjob.component';


const routes: Routes = [
  {path:"",redirectTo:"loginform",pathMatch:"full"},
  {path:"home", component:HomeComponent}, 
{path:"loginform", component:LoginformComponent},
{path:"signupform", component:SignupformComponent},
{path:"reguser", component:RegUsersComponent},
{path:"empdetails", component:EmpDetailsComponent},
{path:"profile",component:MyformComponent},
{path:"jobdetails", component:JobDetailsComponent},
{path:"viewjobs", component:ViewjobComponent},
{path:"jobuserview", component:JobuserviewComponent },
{path:"signout", component:SignoutComponent } ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
