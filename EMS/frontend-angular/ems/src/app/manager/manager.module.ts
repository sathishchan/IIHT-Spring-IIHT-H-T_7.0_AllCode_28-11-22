import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ManagerRoutingModule } from './manager-routing.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RegUsersComponent } from './reg-users/reg-users.component';
import { JobDetailsComponent } from './job-details/job-details.component';
import { ViewjobComponent } from './viewjob/viewjob.component';
import { EmpDetailsComponent } from './emp-details/emp-details.component';



@NgModule({
  declarations: [
    RegUsersComponent,
    JobDetailsComponent,
    ViewjobComponent,
    EmpDetailsComponent
  ],
  imports: [
    CommonModule,
    ManagerRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class ManagerModule { }
