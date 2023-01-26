import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserRoutingModule } from './user-routing.module';
import { FormsModule } from '@angular/forms';
import { MyformComponent } from './myform/myform.component';
import { JobuserviewComponent } from './jobuserview/jobuserview.component';



@NgModule({
  declarations: [
    MyformComponent,
    JobuserviewComponent
  ],
  imports: [
    CommonModule,
    UserRoutingModule,
    FormsModule
  ]
})
export class UserModule { }
