import { Component, OnInit } from '@angular/core';
import Job from 'src/app/Entity/job';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-job-details',
  templateUrl: './job-details.component.html',
  styleUrls: ['./job-details.component.css']
})
export class JobDetailsComponent implements OnInit {

  onSubmit(data: any) {
    console.log(data);

  }

  // signup : Signup = new Signup();

  // submit() {
  //   const observables = this.userService.saveSignup
  //   (this.signup);
  //   observables.subscribe (
  //     (response:any) => {
  //       console.log(response);
  //       alert("submitted Successfully");
  //     }, function(error) {
  //       console.log(error);
  //       alert("Something went wrong, Please try again!")
  //     }
  //   )
  // }

  job: Job = new Job();

  submit() {
 
    const observables = this.userService.saveJob
    (this.job);
    observables.subscribe (
      (response:any) => {
        console.log(response);
        alert("Submitted Successfully");
      }, function(error) {
        console.log(error);
        alert("Something went wrong, Please try again!")
      }
    )
  }

  constructor(private userService : UserService) { }

  ngOnInit(): void {
  }

}
