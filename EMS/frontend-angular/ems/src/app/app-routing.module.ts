import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginformComponent } from './components/loginform/loginform.component';
import { SignupformComponent } from './components/signupform/signupform.component';



const routes: Routes = [
  {path:"",redirectTo:"loginform",pathMatch:"full"},
  
{path:"loginform", component:LoginformComponent},
{path:"signupform", component:SignupformComponent},
{path:"manager", loadChildren:() => import('./manager/manager.module').then(m => m.ManagerModule)},
{path:"user", loadChildren:() => import('./user/user.module').then(u => u.UserModule)}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
