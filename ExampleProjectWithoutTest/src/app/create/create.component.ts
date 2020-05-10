import { Component, OnInit } from '@angular/core';
import { Entitys } from '../entitys';
import { CommonEntitesService } from '../common-entites.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  constructor(private service:CommonEntitesService) { }
  
  entity: Entitys=new Entitys();
  message:any;
  
  ngOnInit() {
  }
  public registerNow(){
    let resp=this.service.doRegistration(this.entity);
    resp.subscribe((data)=>this.message=data);
    console.log(this.message);
      }

}
