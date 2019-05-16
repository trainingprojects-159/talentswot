import { Component, OnInit } from '@angular/core';
import { Admin } from '../../admin';
import { Router, ActivatedRoute } from '@angular/router';
import { AdminService } from '../../admin.service';
import { FormGroup } from '@angular/forms';
import { Candidate } from '../../candidate';

@Component({
  selector: 'app-update-candidate',
  templateUrl: './update-candidate.component.html',
  styleUrls: ['./update-candidate.component.css']
})
export class UpdateCandidateComponent implements OnInit {
  candidate: Candidate=new Candidate;
  createCandidateForm: FormGroup ;
  panelTitle: string;
  c_id : string;

  constructor(private router: Router,private _adminService: AdminService,private route: ActivatedRoute ) { }

  ngOnInit() {
    console.log("update Called");
    this.route.paramMap.subscribe(parameterMap =>{
      const c_id = parameterMap.get('c_id');
      if(c_id){
        console.log("id "|| c_id);
      this._adminService.getCandidateById(c_id).then(candidate => this.candidate=candidate); 
      console.log(this.candidate.designation);
      }else{
       console.log("invalid id");
      }
    });
    }

    updatecandidate(): void {
      this.candidate = {
      'c_id': this.candidate.c_id,
      'designation': this.candidate.designation,
      'experience': this.candidate.experience,
      'fname': this.candidate.fname,
      'lname': this.candidate.lname,
      'location': this.candidate.location,
      'nperiod': this.candidate.nperiod,
      };
      console.log("updated");
      this._adminService.updateCandidate(this.candidate);
      console.log(this.candidate);
      this.resetForm();
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
  
    

}
