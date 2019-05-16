import { Injectable } from '@angular/core';
import {  Headers ,Http } from '@angular/http';
import { Candidate } from './candidate';
import { Technicalinterview } from './technicalinterview';
import { Hrinterview } from './hrinterview';
import { Finalstatus } from './finalstatus';

@Injectable()
export class AdminService {

private url=`http://localhost:8078/Talent_SWOT/admin/login`;
private  headers = new Headers({'Content-Type': 'application/json'});
  constructor(private _http: Http) { }
  private handleError(error: any):  Promise<any> {
   // console.error('error', error);
    return Promise.reject(error.message || error)
  }
  
  login(a_id: string, pass: string): Promise<boolean> {
    const lurl=`${this.url}/${a_id}/${pass}`;
  return this._http.get(lurl, JSON.stringify({ a_id: a_id,pass: pass}))
  .toPromise()
  .then(response => { 
    let admin=response.json() && response.json().admin;
    console.log(response.text());
    if(response.text() === 'true') {
      return false;
    }
    else {
      return true;
    }
    
  })
  .catch(this.handleError);

}

getCandidateById(c_id: string): Promise<Candidate>{
  console.log('servicevvvvv');
  return this._http.get(`http://localhost:8078/Talent_SWOT/admin/candidate/${c_id}`,JSON.stringify({c_id: c_id}))
  .toPromise()
  .then(res =>  res.json() as Candidate)
  .catch(this.handleError);
}


addCandidate(candidate: Candidate): Promise<Candidate> {
  return this._http.post(`http://localhost:8078/Talent_SWOT/admin/candidate/add`, 
  JSON.stringify(candidate),
  {headers : this.headers})
  .toPromise()
  .then(res => res.json() as Candidate)
  .catch(this.handleError);
}

scheduleTechnicalInterview(technicalInterview: Technicalinterview): Promise<Technicalinterview> {
  return this._http.post(`http://localhost:8078/Talent_SWOT/admin/technical/add`,
  JSON.stringify(technicalInterview),
  {headers : this.headers})
  .toPromise()
  .then(res => res.json() as Technicalinterview)
  .catch(this.handleError);
}

deleteCandidate(c_id: string): Promise<void> {
  const lurl=`http://localhost:8078/Talent_SWOT/admin/candidate/${c_id}`;
  return this._http
  .delete(lurl)
  .toPromise()
  .then(res => null)
  .catch(this.handleError);
}


 updateCandidate(candidate: Candidate): Promise<Candidate> {
   return this._http.put(`http://localhost:8078/Talent_SWOT/admin/candidate/edit`,
   JSON.stringify(candidate),
   {headers : this.headers})
   .toPromise()
   .then(res => res.json() as Candidate)
   .catch(this.handleError);

 }


 




getAllCandidate(): Promise<Candidate[]> {

  return this._http.get(`http://localhost:8078/Talent_SWOT/admin/candidate`)
  .toPromise()
  .then(res => res.json() as Candidate[])
  .catch(this.handleError);

}

scheduleHRInterview(hrinterview: Hrinterview): Promise<Hrinterview> {
  return this._http.post(`http://localhost:8078/Talent_SWOT/admin/hr/add`, JSON.stringify(hrinterview))
  .toPromise()
  .then(res => res.json() as Hrinterview)
  .catch(this.handleError);

}





getAllFinalStatus(): Promise<Finalstatus[]> {
  return this._http.get(`http://localhost:8078/Talent_SWOT/admin/final`)
  .toPromise()
  .then(res => res.json() as Finalstatus)
  .catch(this.handleError);

}


getFinalStatusBystatus(): Promise<Finalstatus[]> {

  return this._http.get(`http://localhost:8078/Talent_SWOT/admin/finalstatus/{Status}`)
  .toPromise()
  .then(res => res.json() as Finalstatus[])
  .catch(this.handleError);

}
}