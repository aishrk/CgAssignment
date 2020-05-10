import { Component, OnInit } from '@angular/core';
import { CommonEntitesService } from '../common-entites.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})
export class MyComponentComponent implements OnInit {

  users:any;
  email:string;
  http: any;
  
  constructor(private service:CommonEntitesService,http:HttpClient) { }


public delteUser(id:number){
 let resp= this.service.deleteUser(id);
 resp.subscribe((data)=>this.users=data);
}

public findUserByEmailId(){
  let resp= this.service.getUserByEmail(this.email);
  resp.subscribe((data)=>this.users=data);
 }

  ngOnInit() {
    let resp=this.http.get("http://localhost:8000/common/getAll");
    resp.subscribe((data)=>this.users=data);
 
  }

}
