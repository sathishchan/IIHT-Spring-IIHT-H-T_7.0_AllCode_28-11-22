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

  

  GetAllJobs() {
    const promise = this.userService.getJobs();
    promise.subscribe((response) => {
      console.log(response);
      this.Alljobs = response as Job[]; 
      this.jobs=this.Alljobs.filter(obj=>obj.status == 'notstarted');
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
  ngOnInit(): void {
    this.GetAllJobs();
  }

}
