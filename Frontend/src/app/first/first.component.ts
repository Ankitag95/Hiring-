import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import{ProvidentService} from '../provident.service'
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
  private providentService: ProvidentService;
  private nomineeUrl: string;
  task={
    empname:'',
    dob:'',
    address:'',
    relation:'',
  };
containers=[];
  rout=false;
  x:number;
  id:number;
  public i:number;
  constructor( private http: HttpClient,private router) { 
    this.nomineeUrl = 'http://localhost:8080/todo/api';
  }

  ngOnInit() {
    this.id;


  }
  add(){
    this.x=this.containers.push(this.containers.length);
    console.log(this.x);
    
  };
  remove(){
    this.containers.pop();
  };
  onSubmit(){
    
    this.router.navigate(['/pf-form1']);
    this.rout=true;
    this.providentService.addEpsData(this.task).subscribe((res)=>{
      this.containers=res;
    });
    }    

}

