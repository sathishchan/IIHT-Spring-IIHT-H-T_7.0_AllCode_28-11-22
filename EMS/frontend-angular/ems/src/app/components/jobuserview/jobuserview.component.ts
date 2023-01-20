import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Job from 'src/app/Entity/job';
import { UserService } from 'src/app/services/user.service';


@Component({
  selector: 'app-jobuserview',
  templateUrl: './jobuserview.component.html',
  styleUrls: ['./jobuserview.component.css']
})
export class JobuserviewComponent implements OnInit {

  
  job: Job = new Job();
  jobs : Job[] = [];
  Alljobs : Job[] = [];
  


  constructor(private userService:UserService,private router:Router) { }

  

  // GetAllJobs() {
  //   const promise = this.userService.getJobs();
  //   promise.subscribe((response) => {
  //     console.log(response);
  //     this.Alljobs = response as Job[]; 
  //     this.jobs=this.Alljobs.filter(obj=>obj.status == 'notstarted');
  //   })
  // }

  GetAllJobs() {
    const promise = this.userService.getJobs();
    promise.subscribe((response) => {
      console.log(response);
      this.jobs = response as Job[]; 
    })
  }

  AssignJob(jobdata: any){
    let userid=sessionStorage.getItem('id')
    let jobobj={};
    jobobj["id"]=jobdata.id
    jobobj["status"]="inprogress"
    jobobj["applicablerole"]=jobdata.applicablerole
    jobobj["jobname"]=jobdata.jobname
    const promise = this.userService.updateUserJobStatus(userid,jobobj);
    promise.subscribe((response) => {
      console.log(response);
      if(response["status"] == "Success"){
        alert("Job assigned successfully");
        this.GetAllJobs();

      }
      else{
        alert("unable to asssign")
      }

      // this.Alljobs = response as Job[]; 
      // this.jobs=this.Alljobs.filter(obj=>obj.status == 'notstarted');
    })
  }

CompletedJob(jobdata: any) {
  let userid=sessionStorage.getItem('id')
  let jobobj={};
  jobobj["id"]=jobdata.id
  jobobj["status"]="completed"
  jobobj["profitvalue"]=jobdata.profitvalue
  jobobj["applicablerole"]=jobdata.applicablerole
  const promise = this.userService.updateUserJobStatus(userid,jobobj);
  promise.subscribe((response) => {
    console.log(response);
    if(response["status"] == "Success") {
      alert("Job Completed Successfully");
      this.GetAllJobs();
    }
    else {
      alert("unable to complete");
    }
  })
}

AbortedJob(jobdata: any) {
  let userid=sessionStorage.getItem('id')
  let jobobj={};
  jobobj["id"]=jobdata.id
  jobobj["status"]="aborted"
  jobobj["applicablerole"]=jobdata.applicablerole
  const promise = this.userService.updateUserJobStatus(userid,jobobj);
  promise.subscribe((response) => {
    console.log(response);
    if(response["status"] == "Success") {
      alert("Job Aborted Successfully");
      this.GetAllJobs();
    }
    else {
      alert("unable to aborte");
    }
  })
}

  ngOnInit(): void {
    this.GetAllJobs();
  }

}
