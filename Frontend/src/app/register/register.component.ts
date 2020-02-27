import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";
//import { LoginService } from "../login.service";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  submitted=false;

  constructor(public _router:Router) { }
  
  user={
    fName:null ,
    lName: null,
    qlid: null,
    gender: null,
    email: null,
    password: null,
    cpassword: null,
    number: null
  }


  ngOnInit() {
  }

  //onSubmit(registerForm:NgForm){
    
    // if(registerForm.invalid) {
    //   return;
    // }    
    // this.user.fName=registerForm.value.firstname;
    // this.user.lName=registerForm.value.lastname;
    // this.user.dob=registerForm.value.qlid;
    // this.user.gender=registerForm.value.gender;
    // this.user.email=registerForm.value.email;
    // this.user.number=registerForm.value.phonenumber;
    // this.user.password=registerForm.value.password;
    // this.user.cpassword=registerForm.value.confirmpassword;

    // this.registerService.addUser(this.user).subscribe((res)=>{
    //   if(res){
    //     this.submitted=true;
    //     this._router.navigateByUrl("/");
    //   }else{
    //     console.log("Fail");
    //     alert("Unable to submit form!");
    //   }
    // });
  //}

}
