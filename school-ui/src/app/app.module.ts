import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { PagehomeComponent } from './component/pagehome/pagehome.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';

import { SchoolService } from './service/school-service.service';

import { ROUTES } from './app.routes';
import { RouterModule, PreloadAllModules } from '@angular/router';
import { AddFamilleComponent } from './component/add-famille/add-famille.component';
import { AddEleveComponent } from './component/add-eleve/add-eleve.component';
import { FamilleComponent } from './component/famillecpt/famille.component';
import { EleveComponent } from './component/elevecpt/eleve.component';

@NgModule({
  declarations: [
    AppComponent,
    PagehomeComponent,
    EleveComponent,
    FamilleComponent,
    AddFamilleComponent,
    AddEleveComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
		RouterModule.forRoot(ROUTES, { useHash: true, preloadingStrategy: PreloadAllModules }),
  ],
  providers: [HttpClient, SchoolService],
  bootstrap: [AppComponent]
})
export class AppModule { }
