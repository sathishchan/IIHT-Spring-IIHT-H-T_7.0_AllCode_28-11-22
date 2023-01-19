import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Job from 'src/app/Entity/job';
import { UserService } from 'src/app/services/user.service';
declare var $:any;

@Component({
  selector: 'app-viewjob',
  templateUrl: './viewjob.component.html',
  styleUrls: ['./viewjob.component.css']
})
export class ViewjobComponent implements OnInit {

  ShowEdit:boolean=false;
  jobs : Job[] = [];
  job: Job = new Job();
  jobId:number;

  constructor(private userService : UserService, private router : Router) { }

  GetAllJobs() {
    const promise = this.userService.getJobs();
    promise.subscribe((response) => {
      console.log(response);
      this.jobs = response as Job[]; 
    })
  }

  //EditJob
  editJob(jobobj: any) {
    this.ShowEdit=true;
    this.jobId=jobobj.id
    this.job=jobobj
  }

  
  //updateJob
  updateJob() {
    const observables = this.userService.updatejob(this.jobId,this.job);
    observables.subscribe((response:any) => {
      console.log(response);
      this.popClose();
      this.GetAllJobs();
      })
  }

  popClose(){
    this.ShowEdit=false;
    this.Resetvalues();
  }

  Resetvalues(){
    this.jobId =undefined;
    this.job=undefined;

  }

  ngOnInit(): void {
    this.GetAllJobs();
  }

}
