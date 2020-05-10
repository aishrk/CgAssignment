import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { UserComponent } from './user/user.component';
import { CreateComponent } from './create/create.component';
import { DetailsListComponent } from './details-list/details-list.component';
import { MyComponentComponent } from './my-component/my-component.component';

const routes: Routes = [
  {path:"getDetails", component :UserComponent},
  {path:"create", component :CreateComponent},
  {path:"search",component:MyComponentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
