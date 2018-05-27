import { Routes, RouterModule } from '@angular/router';
import { AddFamilleComponent } from './component/add-famille/add-famille.component';
import { FamilleComponent } from './component/famillecpt/famille.component';
import { EleveComponent } from './component/elevecpt/eleve.component';


export const ROUTES: Routes = [


	// Permet de rediriger l'accueil de l'application vers la page de login
	{
		path: '',
		pathMatch: 'full',
		redirectTo: 'familles'
	},

	// Eleves
	{
		path: 'eleves',
		component: EleveComponent
	},

	// Familles
	{
		path: 'familles',
		component: FamilleComponent
	},

	// Familles
	{
		path: 'addfamille',
		component: AddFamilleComponent
	}
];
