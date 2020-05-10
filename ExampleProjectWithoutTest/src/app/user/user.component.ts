import { Component, OnInit } from '@angular/core';
import { User } from './user';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

users : any;


  constructor(private http : HttpClient) {
    
  }

  ngOnInit() {
    let resp=this.http.get("http://localhost:8000/common/getAll");
    resp.subscribe((data)=>this.users=data);
 
  }

}
