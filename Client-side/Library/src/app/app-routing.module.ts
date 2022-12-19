import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllbooksComponent } from './Components/allbooks/allbooks.component';
import { HomeComponent } from './Components/home/home.component';
import { UserformComponent } from './Components/userform/userform.component';

const routes: Routes = [{ path:"home", component: HomeComponent }, 
{path: "addbook", component: UserformComponent },
{path: "allbooks", component: AllbooksComponent} ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
