import { Deserializable } from './deserializable.model';

export class Famille implements Deserializable {

    famId: number;
    famName: string;
	famPrenom: string;
	famCivilite: string;
	famTel1: string;
	famTel2: string;
	famMail: string;
	famTypeInscript: string;
	famAdresse: string;
	famVille: string;
	famCodePostal: string;
    famTelUrgence: string;
    cotisation: number;
    eleves: any [];

	constructor() {
	}

	deserialize(input: any) {
		Object.assign(this, input);
		return this;
	}
}
