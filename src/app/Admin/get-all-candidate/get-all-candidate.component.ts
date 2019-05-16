import { Component, OnInit } from '@angular/core';
import { Candidate } from '../../candidate';
import { AdminService } from '../../admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-all-candidate',
  templateUrl: './get-all-candidate.component.html',
  styleUrls: ['./get-all-candidate.component.css']
})
export class GetAllCandidateComponent implements OnInit {
  candidate: Candidate[];

  constructor(private _adminService: AdminService,private router: Router) { }

  ngOnInit() {
    this._adminService.getAllCandidate().then(candidate => this.candidate=candidate);
  }

  delete(c_id:string):void{
    this._adminService.deleteCandidate(c_id);
  }

}
