import { Component, OnInit } from '@angular/core';
import { Candidate } from '../../candidate';
import { AdminService } from '../../admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-candidate',
  templateUrl: './add-candidate.component.html',
  styleUrls: ['./add-candidate.component.css']
})
export class AddCandidateComponent implements OnInit {
  candidate: Candidate=new Candidate;

  error = 'invalid';
  constructor(private router: Router,private _adminService: AdminService ) { }

  ngOnInit() {
  }

  resetForm():void{
    this.candidate = {
    "c_id": null,
    "designation": null,
    "experience": null,
    "fname": null,
    "lname":null,
    "location": null,
      "nperiod": null
    };
  }

  savecandidate(): void {
    this.candidate = {
    'c_id': this.candidate.c_id,
    'designation': this.candidate.designation,
    'experience': this.candidate.experience,
    'fname': this.candidate.fname,
    'lname': this.candidate.lname,
    'location': this.candidate.location,
    'nperiod': this.candidate.nperiod,
    };
    this._adminService.addCandidate(this.candidate);
    console.log(this.candidate);
    this.resetForm();

  }

}