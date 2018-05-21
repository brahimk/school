import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders, HttpHandler } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Famille } from '../model/famille.model';

export const baseUrl = '/schoolmanagement';

// Configure les urls à appeler pour accéder aux services REST de l'application School
// En dev url="https://localhost:8080" et context=""
// En Intégration url="" et context="/schoolmanagement"
export const serveurApi = {
    url: '',
    context: 'schoolmanagement/'
};

@Injectable({
  providedIn: 'root'
})
export class SchoolService {

  constructor(public httpClient: HttpClient) { }

  //private rootAPIUrl = serveurApi.url + serveurApi.context;
  private rootAPIUrl = 'http://localhost:8080/' + serveurApi.context;
  private familles = 'familles';
  private eleves = 'eleves';


/*
   * Permet de récupérer tous les élèves disponibles
   */
  getListEleves():Observable<any[]> {
    const myUrl = this.rootAPIUrl + this.eleves;
    return this.httpClient.get(myUrl);
  }

  /*
   * Permet de récupérer toutes les familles disponibles
   */
  getListFamilles() {
    const myUrl = this.rootAPIUrl + this.familles;
    return this.httpClient.get(myUrl).subscribe(
      (data: Famille[]) => { ({ ...data })}, // success path
      error => console.log (error) // error path
    );
  }

}