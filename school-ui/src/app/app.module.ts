import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PagehomeComponent } from './component/pagehome/pagehome.component';
import { AffichageComponent } from './component/affichage/affichage.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';

import { SchoolService } from './service/school-service.service';

@NgModule({
  declarations: [
    AppComponent,
    PagehomeComponent,
    AffichageComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [HttpClient, SchoolService],
  bootstrap: [AppComponent]
})
export class AppModule { }
