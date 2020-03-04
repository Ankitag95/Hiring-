import { Component, OnInit } from '@angular/core';
import { HiringService } from '../hiring.service';
import { User } from '../user';

@Component({
  selector: 'app-page',
  templateUrl: './page.component.html',
  styleUrls: ['./page.component.css']
})
export class PageComponent implements OnInit {
  
  userId=1;
  // user:any={};
  users:User[];

  
  dataarray3=[];
  

  constructor(private taskService:HiringService) {
    
   }

  ngOnInit() {
    // this.user.push(this.users);
    this.taskService.getdata().
      subscribe(res =>{this.users =res
      console.log(this.users)});
  }

  remform3(index : any){

   
    this.users.pop();
  }

}










  



