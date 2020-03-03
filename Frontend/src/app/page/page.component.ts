import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-page',
  templateUrl: './page.component.html',
  styleUrls: ['./page.component.css']
})
export class PageComponent implements OnInit {
  user={
    fName:null ,
    lName: null,
    qlid: null,
    skills:null,
    skills2:null,
    skills3:null,
    skills4:null,
    skills5:null,
    month:null,
    number: null,
    email:null,
    password:null,
    cpassword:null,
  }
  
  dataarray3=[];
  

  constructor() {
    
   }

  ngOnInit() {
    this.dataarray3.push(this.user);
  }

}
