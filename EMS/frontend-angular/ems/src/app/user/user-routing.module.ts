import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { JobuserviewComponent } from './jobuserview/jobuserview.component';
import { MyformComponent } from './myform/myform.component';

const routes: Routes = [{path:"jobuserview", component:JobuserviewComponent},
{path:"profile",component:MyformComponent}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UserRoutingModule { }
