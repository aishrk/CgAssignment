import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CommonEntitesService {
  users : any;

  constructor(private http:HttpClient) { }


  
  public getDetails(){
    let resp=this.http.get("http://localhost:8000/common/getAll");
    resp.subscribe((data)=>this.users=data);
  }
  public doRegistration(user){
    return this.http.post("http://localhost:8000/common/addAllRecord",user,{responseType:'text' as 'json'});
  }

  

  public getUserByEmail(email){
    return this.http.get("http://localhost:9090//findUser/"+email);
  }

  public deleteUser(id){
    return this.http.delete("http://localhost:9090/cancel/"+id);
  }
}
