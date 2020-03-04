import { Component, OnInit,ViewChild } from '@angular/core';
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";
import { HiringService } from '../hiring.service';
import { NgMultiSelectDropDownModule } from 'ng-multiselect-dropdown';
import { FormGroup, FormControl, Validator, Validators } from "@angular/forms";
import {CommonModule} from '@angular/common';

//import { LoginService } from "../login.service";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  submitted=false;
  public form:NgForm;
  public data = [];
  public settings = {};
  public selectedItems = [];
  public name = 'Cricketers';
  constructor(public _router:Router,private taskService: HiringService) { }
  
  user={
    fName:null ,
    lName: null,
    qlid: null,
    skills:null,
    skills2:null,
    skills3:null,
    skills4:null,
    skills5:null,
    number: null,
    email:null,
    password:null,
    cpassword:null,
  }
  taskList = [];

  ngOnInit() {

    this.data = [
      { item_id: 1, item_text: 'SQL' },
      { item_id: 2, item_text: 'Analytics' },
      { item_id: 3, item_text: 'Java' },
      { item_id: 4, item_text: 'Python' },
      { item_id: 5, item_text: 'Cloud' },
      { item_id: 6, item_text: 'Web Technology' },
      { item_id: 7, item_text: 'Cyber Security' }
    ];
    // setting and support i18n
    this.settings = {
      singleSelection: false,
      idField: 'item_id',
      textField: 'item_text',
      enableCheckAll: true,
      selectAllText: 'Select All',
      unSelectAllText: 'Deselect All',
      allowSearchFilter: true,
      limitSelection: -1,
      clearSearchFilter: true,
      maxHeight: 197,
      itemsShowLimit: 5,
      searchPlaceholderText: 'Tìm kiếm',
      noDataAvailablePlaceholderText: 'Không có dữ liệu',
      closeDropDownOnSelection: false,
      showSelectedItemsAtTop: false,
      defaultOpen: false
    };
    


  }

  public save() {
    console.log(this.form.value);
  }
  public onFilterChange(item: any) {
    console.log(item);
  }
  public onDropDownClose(item: any) {
    console.log(item);
  }

  public onItemSelect(item: any) {
    console.log(item);
  }
  public onDeSelect(item: any) {
    console.log(item);
  }

  public onSelectAll(items: any) {
    console.log(items);
  }
  public onDeSelectAll(items: any) {
    console.log(items);
  }
  get f() { return this.form.controls; }
  
  onSubmit() {
    
    
    this.taskService.interviewer_register(this.user).
      subscribe((res) => {
        if (res) {
          this.taskList = res;
          
        } else {
          console.log('fail');
        }
      });
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
