import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


const BASE_URL = 'http://localhost:1000';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  //create user details
  saveSignup(signup: {
    firstname: String;
    lastname: String;
    username: String;
    password: String;
    email: String;
    role: String;
  }) {
    return this.http.post(BASE_URL + "/signup", signup);
  }

  //login
  saveUser(login: {
    username: String;
    password: String;
  }) {
    return this.http.post(BASE_URL + "/signin", login);
  }

  //registeredusers
  getUsers() {
    return this.http.get(BASE_URL + "/allusers");
  }

  //deleteusers
  deleteUsers(signup: any) {
    return this.http.delete(BASE_URL + "/remove/" + signup.id);
  }

  

  //getUserById(id: number) {
  //  return this.http.get(BASE_URL + "/" + id);
  //}

 

  updateuser(id, userdata) {
    return this.http.put(BASE_URL + "/update/" + id, userdata);
  }


  constructor(private http: HttpClient) { }

  //user: Signup = new Signup();

  //setUser(user) {
    //this.user = user; 
    //console.log(this.user);
    
  //}

 // getUser(){
  //  return this.user;
 // }

}
