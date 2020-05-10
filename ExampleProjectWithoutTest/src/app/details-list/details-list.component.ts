import { Component, OnInit } from '@angular/core';
import { CommonEntitesService } from '../common-entites.service';

@Component({
  selector: 'app-details-list',
  templateUrl: './details-list.component.html',
  styleUrls: ['./details-list.component.css']
})
export class DetailsListComponent implements OnInit {

  users : any 

  constructor(service : CommonEntitesService) {
    this.users=service.getDetails();
    
   }

  ngOnInit() {
  }

}
