import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

// import { HeaderComponent } from './header/header.component';
// import { FooterComponent } from './footer/footer.component';
//import { FirstComponent } from './first/first.component';
//import { PfForm1Component } from './pf-form1/pf-form1.component';
//import { PfForm2Component } from './pf-form2/pf-form2.component';
import { EpfFormComponent } from './epf-form/epf-form.component';
import { EpsNominationComponent } from './eps-nomination/eps-nomination.component';
import { RegisterComponent } from './register/register.component';
import { PageComponent } from './page/page.component'
import {InterviewerRegisterComponent } from './interviewer-register/interviewer-register.component'

const routes: Routes = [
  {path:"interviewer-register",component:InterviewerRegisterComponent},
  {path:"page",component:PageComponent},
  {path:'',redirectTo:'/page',pathMatch:'full'}
  //{path:'pf-form1',component:PfForm1Component},
  //{path:'pf-form2',component:PfForm2Component},
  //{path:'epf-form',component:EpfFormComponent},
  //{path:'eps-nomination',component:EpsNominationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
