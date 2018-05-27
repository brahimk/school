import { Component, OnInit } from '@angular/core';
import { Famille } from '../../model/famille.model';

@Component({
  selector: 'app-add-famille',
  templateUrl: './add-famille.component.html',
  styleUrls: ['./add-famille.component.css']
})
export class AddFamilleComponent implements OnInit {

  constructor() { }

  private lstFamillesACreer: Famille[] = [];

  private typeInscription: string;
  private famSaved: boolean;
  public famId = '';

  ngOnInit() {
  }

  private EnregistrerFamille(formFamille) {
    debugger;
    if ( typeof(formFamille) === 'undefined' || null === formFamille) {
      alert ('Merci de remplir correctement le formulaire de la famille !! ');
    }

    const frmTypeInscription    = formFamille.target.form[0];
    const frmTypeReinscription  = formFamille.target.form[1];
    const frmPrenom             = formFamille.target.form[2];
    const frmNom                = formFamille.target.form[3];
    const frmAdresse            = formFamille.target.form[4];
    const frmVille              = formFamille.target.form[5];
    const frmCodePostal         = formFamille.target.form[6];
    const frmTelephone1         = formFamille.target.form[7];
    const frmTelephone2         = formFamille.target.form[8];
    const frmMail              = formFamille.target.form[9];
    const frmCotisation         = formFamille.target.form[10];

    if ( !frmTypeInscription.validity.valid || !frmTypeReinscription.validity.valid ||
      !frmPrenom.validity.valid || !frmNom.validity.valid ||
      !frmAdresse.validity.valid || !frmVille.validity.valid ||
      !frmCodePostal.validity.valid || !frmTelephone1.validity.valid ||
      !frmTelephone2.validity.valid || !frmMail.validity.valid ||
      !frmCotisation.validity.valid) {
        alert ('Merci de remplir correctement le formulaire de la famille !! ');
      }

    this.lstFamillesACreer.push(new Famille().deserialize({
      famName: frmNom.value,
      famPrenom: frmPrenom.value,
      famCivilite: '',
      famTel1: frmTelephone1.value,
      famTel2: frmTelephone2.value,
      famMail: frmMail.value,
      famTypeInscript: this.typeInscription,
      famAdresse: frmAdresse.value,
      famVille: frmVille.value,
      famCodePostal: frmCodePostal.value,
      famTelUrgence: frmTelephone1.value,
      cotisation: frmCotisation.value
    }));

    this.famSaved = true;
  }

}
