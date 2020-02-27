import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { NomineeTable } from './nominee-table';

@Injectable({
  providedIn: 'root'
})
export class ProvidentService {
    private nomineeUrl: string;
   private usersUrl:string;
  
  constructor(private http: HttpClient)
  { 
    this.usersUrl="http://localhost:8080/todo/api/save_eps_data";
  }
  public NominationData(i:number,id:number) 
  {
        
  }
  /**
   * addEpsData
task :Observable<any>  */
  public addEpsData(task):Observable <any> {
    const url="${this.usersUrl}";
    return this.http.put(url,task);
    
  }
}
