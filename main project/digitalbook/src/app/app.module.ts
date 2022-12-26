import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './Components/home/home.component';
import { LoginformComponent } from './Components/loginform/loginform.component';
import { SignupformComponent } from './Components/signupform/signupform.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { SearchbooksComponent } from './Components/searchbooks/searchbooks.component';
import { CreatebooksComponent } from './Components/createbooks/createbooks.component';
import { NavbarComponent } from './Components/navbar/navbar.component';
import { FooterComponent } from './Components/footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { AllbooksComponent } from './Components/allbooks/allbooks.component';
import { HeaderComponent } from './Components/header/header.component';
import { HeadComponent } from './Components/head/head.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginformComponent,
    SignupformComponent,
    SearchbooksComponent,
    CreatebooksComponent,
    NavbarComponent,
    FooterComponent,
    AllbooksComponent,
    HeaderComponent,
    HeadComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NoopAnimationsModule,
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
