import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './model/user';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {
  usersUrl : string = "https://reqres.in/api/users/1";
  addUrl : string = "https://reqres.in/api/users";

  constructor(private httpClient : HttpClient) { }

  getUser(): Observable<any> {
    let observable : Observable<any> = this.httpClient.get<any>(this.usersUrl);
    return observable;
    //return this.httpClient.get<any>(this.usersUrl);
  }

  addUser(user: string): Observable<any> {
    let header : HttpHeaders = new HttpHeaders();
    header.set('Content-Type', 'application/json');
    return this.httpClient.post<any>(this.addUrl, user, {headers: header});
  }

  getDepartments(): Observable<any> {
    return this.httpClient.get<any>("http://localhost:8080/departments");
  }
}
