import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


const BASE_URL = 'http://localhost:5000';
//const BASE_URL = 'http://ec2-18-206-207-250.compute-1.amazonaws.com:5000';


@Injectable({
  providedIn: 'root'
})
export class UserService {


  getEmpById(userid:number) {
    return this.http.get(BASE_URL+'/getemployee/'+userid)
  }

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

  //create job details
  saveJob(job: {
    jobname: String;
    startingtime: Date;
    endtime: Date;
    profitvalue: Number;
    applicablerole : String;
    status : String;
  }) {
    return this.http.post(BASE_URL + "/createjobs", job);
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

  //viewjob
  getJobs() {
    return this.http.get(BASE_URL + "/availablejobs");
  }

  //deleteusers
  deleteUsers(signup: any) {
    return this.http.delete(BASE_URL + "/remove/" + signup.id);
  }

 
  //updateusers
  updateuser(id: any, userdata: any) {
    return this.http.put(BASE_URL + "/update/" + id, userdata);
  }

  //updatejobs
  updatejob(id: any, jobdata: any) {
    return this.http.put(BASE_URL + "/updatejob/" + id, jobdata);
  }

  updateUserJobStatus(userid: any, jobdata: any){
    return this.http.put(BASE_URL + "/updateJobAndSalary/user/" + userid, jobdata);

  }
  //getUserById(id: number) {
  //  return this.http.get(BASE_URL + "/" + id);
  //}

 

  //Employee details  
  //employeeDetails
  getEmpDetails() {
    return this.http.get(BASE_URL + "/getallemp");
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
