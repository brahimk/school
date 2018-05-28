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

  // private rootAPIUrl = serveurApi.url + serveurApi.context;
  private rootAPIUrl = 'http://localhost:8080/' + serveurApi.context;
  private familles = 'familles';
  private famille = 'famille';
  private eleves = 'eleves';

  public dataEleves ;
  public dataFamilles ;

  public creneaux = [ 'Mercredi matin', 'Mercredi après-midi',
                        'Samedi matin', 'Samedi après-midi',
                        'Dimanche matin', 'Dimanche après-midi'];

/*
   * Permet de récupérer tous les élèves disponibles
   */
  getListEleves(): any {
    const myUrl = this.rootAPIUrl + this.eleves;
     return this.httpClient.get(myUrl);
  }

  /*
   * Permet de récupérer toutes les familles disponibles
   */
  getListFamilles(): any {
    const myUrl = this.rootAPIUrl + this.familles;
     return this.httpClient.get(myUrl);
  }

  /*
   * Permet de sauvegarder toutes les familles
   */
  saveListFamilles(familles: Famille[]): any {
    const myUrl = this.rootAPIUrl + this.familles;
     return this.httpClient.post(myUrl, familles);
  }

  /*
   * Permet de sauvegarder toutes les familles
   */
  saveFamille(famille: Famille): any {
    const myUrl = this.rootAPIUrl + this.famille;
     return this.httpClient.post(myUrl, famille);
  }

}
