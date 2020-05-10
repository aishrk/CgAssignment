import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComponentComponent } from './my-component/my-component.component';
import { UserComponent } from './user/user.component';
import { DetailsListComponent } from './details-list/details-list.component';
import { FormsModule } from '@angular/forms';
import { CommonEntitesService } from './common-entites.service';
import { HttpClientModule } from '@angular/common/http';
import { CreateComponent } from './create/create.component';

@NgModule({
  declarations: [
    AppComponent,
    MyComponentComponent,
    UserComponent,
    DetailsListComponent,
    CreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [CommonEntitesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
