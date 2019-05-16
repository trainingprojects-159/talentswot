import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';



import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AdminService } from './admin.service';
import { AddCandidateComponent } from './Admin/add-candidate/add-candidate.component';
import { DeleteCandidateComponent } from './Admin/delete-candidate/delete-candidate.component';
import { UpdateCandidateComponent } from './Admin/update-candidate/update-candidate.component';
import { GetCandidateByIdComponent } from './Admin/get-candidate-by-id/get-candidate-by-id.component';
import { GetAllCandidateComponent } from './Admin/get-all-candidate/get-all-candidate.component';
import { ScheduleTechnicalInterviewComponent } from './Admin/schedule-technical-interview/schedule-technical-interview.component';
import { ScheduleHrinterviewComponent } from './Admin/schedule-hrinterview/schedule-hrinterview.component';
import { GetFinalStatusByStatusComponent } from './Admin/get-final-status-by-status/get-final-status-by-status.component';
import { GetAllFinalStatusComponent } from './Admin/get-all-final-status/get-all-final-status.component';
import { HomeComponent } from './home/home.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { DeletecandidateComponent } from './deletecandidate/deletecandidate.component';



const appRouter: Routes =[
  {path: 'login', component: LoginComponent},
  {path: 'home', component: HomeComponent,
  children: [
  {path:'addcandidate', component:AddCandidateComponent}, 
  {path:'deletecandidate/:c_id', component:DeleteCandidateComponent},
  {path:'updatecandidate/:c_id', component:UpdateCandidateComponent},
  {path:'getcandidatebyid/:c_id', component:GetCandidateByIdComponent},
  {path:'getallcandidate', component:GetAllCandidateComponent},
  {path:'scheduletechnicalinterview', component:ScheduleTechnicalInterviewComponent},
  {path:'schedulehrinterview', component:ScheduleHrinterviewComponent},
  {path:'getallfinalstatus', component:GetAllFinalStatusComponent},
  {path:'getfinalstatusbystatus', component:GetFinalStatusByStatusComponent}
]},
{path: '', redirectTo: '/login' , pathMatch: 'full'},
{path: '**', component: PagenotfoundComponent}
];




  




@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AddCandidateComponent,
    DeleteCandidateComponent,
    UpdateCandidateComponent,
    GetCandidateByIdComponent,
    GetAllCandidateComponent,
    ScheduleTechnicalInterviewComponent,
    ScheduleHrinterviewComponent,
    GetFinalStatusByStatusComponent,
    GetAllFinalStatusComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    PagenotfoundComponent,
    DeletecandidateComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRouter)
  ],
  providers: [AdminService],
  bootstrap: [AppComponent]
})
export class AppModule { }
