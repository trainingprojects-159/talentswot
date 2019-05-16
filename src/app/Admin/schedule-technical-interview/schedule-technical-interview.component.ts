import { Component, OnInit } from '@angular/core';
import { Technicalinterview } from '../../technicalinterview';
import { Router } from '@angular/router';
import { AdminService } from '../../admin.service';

@Component({
  selector: 'app-schedule-technical-interview',
  templateUrl: './schedule-technical-interview.component.html',
  styleUrls: ['./schedule-technical-interview.component.css']
})
export class ScheduleTechnicalInterviewComponent implements OnInit {

  technicalInterview: Technicalinterview = new Technicalinterview;
  error = 'invalid';
  constructor(private router: Router,private _adminService: AdminService ) { }
  

  ngOnInit() {
  }

  resetForm():void{
    this.technicalInterview = {
    
      "tinterviewdate": null,
      "comments": null,
      "tech_status":null,
      "ratings": null,
      "tech_id": null
    };
  }

  scheduleTechnicalInterview():void{
    this.technicalInterview = {
      
      "tinterviewdate": this.technicalInterview.tinterviewdate,
      "comments": this.technicalInterview.comments,
      "tech_status":this.technicalInterview.tech_status,
      "ratings": this.technicalInterview.ratings,
      "tech_id": this.technicalInterview.tech_id
      };

      this._adminService.scheduleTechnicalInterview(this.technicalInterview);
      console.log(this.technicalInterview);
     this.resetForm();

  }


}
