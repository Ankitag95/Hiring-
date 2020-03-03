import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class HiringService {
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };
  private tasksUrl = "http://localhost:8080/hiring";
  constructor(private http: HttpClient) { }
  
  public interviewer_register (user): Observable<any> {
    const url = `${this.tasksUrl}/api/insert/createuser`;
    console.log(user);
    return this.http.post(url, user);
  }
}
