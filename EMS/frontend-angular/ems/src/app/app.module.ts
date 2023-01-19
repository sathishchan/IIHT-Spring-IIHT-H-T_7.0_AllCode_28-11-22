import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { FooterComponent } from './components/footer/footer.component';
import { LoginformComponent } from './components/loginform/loginform.component';
import { FormsModule } from '@angular/forms';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarmanagerComponent } from './components/navbarmanager/navbarmanager.component';
import {MatListModule} from '@angular/material/list';
import {MatMenuModule} from '@angular/material/menu';
import { SignupformComponent } from './components/signupform/signupform.component';
import {HttpClientModule} from '@angular/common/http';
import { RegUsersComponent } from './components/reg-users/reg-users.component';
import { EmpDetailsComponent } from './components/emp-details/emp-details.component';
import { JobDetailsComponent } from './components/job-details/job-details.component';
import { ViewjobComponent } from './components/viewjob/viewjob.component';
import { JobuserviewComponent } from './components/jobuserview/jobuserview.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FooterComponent,
    LoginformComponent,
    NavbarmanagerComponent,
    SignupformComponent,
    RegUsersComponent,
    EmpDetailsComponent,
    JobDetailsComponent,
    ViewjobComponent,
    JobuserviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NoopAnimationsModule,
    MatListModule,
    MatMenuModule,
    HttpClientModule,
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
