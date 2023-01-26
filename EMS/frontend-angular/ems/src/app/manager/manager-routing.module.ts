import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpDetailsComponent } from './emp-details/emp-details.component';
import { JobDetailsComponent } from './job-details/job-details.component';
import { RegUsersComponent } from './reg-users/reg-users.component';
import { ViewjobComponent } from './viewjob/viewjob.component';

const routes: Routes = [
  {path:"jobdetails", component:JobDetailsComponent},
  {path:"empdetails", component:EmpDetailsComponent},
  {path:"reguser", component:RegUsersComponent},
  {path:"viewjobs", component:ViewjobComponent}];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ManagerRoutingModule { }
