import { Component, OnInit } from '@angular/core';
import { AdminService } from '../../admin.service';
import { Router } from '@angular/router';
import { Finalstatus } from '../../finalstatus';

@Component({
  selector: 'app-get-all-final-status',
  templateUrl: './get-all-final-status.component.html',
  styleUrls: ['./get-all-final-status.component.css']
})
export class GetAllFinalStatusComponent implements OnInit {
  finalstatus: Finalstatus[];

  constructor(private _adminService: AdminService,private router: Router) { }

  ngOnInit() {
   this._adminService.getAllFinalStatus().then(finalstatus => this.finalstatus=finalstatus);
  }
  
  }


