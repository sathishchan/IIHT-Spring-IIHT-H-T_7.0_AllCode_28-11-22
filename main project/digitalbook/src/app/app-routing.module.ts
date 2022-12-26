import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllbooksComponent } from './Components/allbooks/allbooks.component';
import { CreatebooksComponent } from './Components/createbooks/createbooks.component';
import { HomeComponent } from './Components/home/home.component';
import { LoginformComponent } from './Components/loginform/loginform.component';
import { SearchbooksComponent } from './Components/searchbooks/searchbooks.component';
import { SignupformComponent } from './Components/signupform/signupform.component';

const routes: Routes = [  
  {path:'',pathMatch:'full' ,redirectTo:'loginform'},
  {path:"home", component:HomeComponent}, 
{path:"signupform", component:SignupformComponent},
{path:"loginform", component:LoginformComponent},
{path:"book", component:CreatebooksComponent},
{path:"viewbook", component:AllbooksComponent},
{path:"searchBook", component:SearchbooksComponent } ];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
