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
  ShowAssignedJob:boolean=false;
  Job: any;


  constructor(private userService:UserService,private router:Router) { }
  ngOnInit(): void {
    this.getAllJobs();
    this.getEmployeeById();
  }
  

  getAllJobs() {
    const promise = this.userService.getJobs();
    promise.subscribe((response) => {
      console.log(response);
      this.Alljobs = response as Job[]; 
      this.jobs=this.Alljobs.filter(obj=>obj.status == 'notstarted');
    })
  }

  getEmployeeById(){
    let userid=parseInt(sessionStorage.getItem('id'))
    const promise = this.userService.getEmpById(userid);
    promise.subscribe((response) => {
      // this.Employee=response["responseData"]["employee"];
      if(response["responseData"]["job"] != undefined ){
        this.Job=response["responseData"]["job"];
        console.log(this.Job)
      }
      if(response["responseData"]["job"] == undefined){
        this.Job=undefined
      }
      
      this.ShowAssignedJob=true;

      console.log(response);
    });
  }

  toggleScreen(){
    this.ShowAssignedJob=this.ShowAssignedJob ? false:true;
    this.ShowAssignedJob ? this.getEmployeeById() : this.getAllJobs();
  }
  // getAllJobs() {
  //   const promise = this.userService.getJobs();
  //   promise.subscribe((response) => {
  //     console.log(response);
  //     this.jobs = response as Job[]; 
  //   })
  // }

  assignJob(jobdata: any){
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
        this.getAllJobs();

      }
      else{
        alert("unable to asssign")
      }

      // this.Alljobs = response as Job[]; 
      // this.jobs=this.Alljobs.filter(obj=>obj.status == 'notstarted');
    })
  }

completedJob(jobdata: any) {
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
      this.getAllJobs();
      this.getEmployeeById();
    }
    else {
      alert("unable to complete");
    }
  })
}

abortedJob(jobdata: any) {
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
      this.getAllJobs();
      this.getEmployeeById();
    }
    else {
      alert("unable to aborte");
    }
  })
}

  

}
