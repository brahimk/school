import { Component, OnInit, Input } from '@angular/core';
import { SchoolService } from '../../service/school-service.service';
import { Eleve } from '../../model/eleve.model';

@Component({
  selector: 'app-add-eleve',
  templateUrl: './add-eleve.component.html',
  styleUrls: ['./add-eleve.component.css']
})
export class AddEleveComponent implements OnInit {

  private lstElevesACreer: Eleve[] = [];
  @Input() famId: String;
  creneau: any;
  myCreneau: any;

  constructor(public schoolService: SchoolService) { }

  ngOnInit() {
    console.log('FamId'  + this.famId);
  }

  EditEleve(eleveACreer) {
    if ( eleveACreer ) {
      eleveACreer.editable = ! eleveACreer.editable;
    }
  }

  SaveEleve(eleveACreer, Numero, Prenom, Nom, DateNaissance, Niveau, creneau) {
    if ( eleveACreer ) {
      eleveACreer.editable = ! eleveACreer.editable;
      const index = this.lstElevesACreer.indexOf(eleveACreer);
      if ( index >= 0 ) {
        this.lstElevesACreer[index].elvNumero = Numero;
        this.lstElevesACreer[index].elvName = Nom;
        this.lstElevesACreer[index].elvPrenom = Prenom;
        this.lstElevesACreer[index].elvDtNaissance = DateNaissance;
        this.lstElevesACreer[index].elvNiveau = Niveau;
        if ( typeof(creneau) !== 'undefined' && creneau !== null && creneau.length > 0) {
          this.lstElevesACreer[index].creneau = creneau;
        }
      }
    }
  }

  AjouterEleve(Numero, Prenom, Nom, DateNaissance, Niveau, creneau) {

    if (typeof (Numero) === 'undefined' || null === Numero || Numero.value.length <= 0 ||
      typeof (Prenom) === 'undefined' || null === Prenom || Prenom.value.length <= 0 ||
      typeof (Nom) === 'undefined' || null === Nom || Nom.value.length <= 0 ||
      typeof (DateNaissance) === 'undefined' || null === DateNaissance || DateNaissance.value.length <= 0 ||
      typeof (Niveau) === 'undefined' || null === Niveau || Niveau.value.length <= 0 ||
      typeof (creneau) === 'undefined' || null === creneau || creneau.value.length <= 0) {
      alert('Veuillez entre des valeurs dans chaque champs obligatoirement !! ');
      return;
    }
    this.lstElevesACreer.push(new Eleve().deserialize({
      elvNumero: Numero.value,
      elvName: Nom.value,
      elvPrenom: Prenom.value,
      elvDtNaissance: DateNaissance.value,
      elvLieuNaissance: '',
      elvSortie: '',
      elvNiveau: Niveau.value,
      elvVide: '',
      clsId: '',
      cotisation: '',
      creneau: creneau.value
    }));

    Numero.value = '';
    Prenom.value = '';
    // Nom.value = '';
    DateNaissance.value = '';
    Niveau.value = '';
    // creneau.value = '';
  }
}
