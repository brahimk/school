import { Deserializable } from './deserializable.model';

export class Eleve implements Deserializable {

	elvNumero: string;
	elvName: string;
	elvPrenom: string;
	elvDtNaissance: Date;
	elvLieuNaissance: string;
	elvSortie: string;
	elvNiveau: string;
	elvVide: number;
	clsId: number;
	cotisation: number;
	creneau: string;

	constructor() {
	}

	deserialize(input: any) {
		Object.assign(this, input);
		return this;
	}
}
