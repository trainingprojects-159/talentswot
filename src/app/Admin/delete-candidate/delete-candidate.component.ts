import { Component, OnInit, Input } from '@angular/core';
import { Admin } from '../../admin';
import { Router } from '@angular/router';
import { AdminService } from '../../admin.service';
import { Candidate } from '../../candidate';
@Component({
  selector: 'app-delete-candidate',
  templateUrl: './delete-candidate.component.html',
  styleUrls: ['./delete-candidate.component.css']
})
export class DeleteCandidateComponent implements OnInit {
  candidate: Candidate[];
 
  constructor(private _adminService: AdminService,private router: Router  ) { }


  ngOnInit() {
   
    this._adminService.getAllCandidate().then(candidate => this.candidate=candidate);
  }
  }
