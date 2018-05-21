package com.brahimk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brahimk.dao.EleveRepository;
import com.brahimk.dao.FamilleRepository;
import com.brahimk.entites.Eleve;
import com.brahimk.entites.Famille;


@SpringBootApplication
public class SchoolApplication implements CommandLineRunner{

	@Autowired
	private EleveRepository eleveRepo;

	@Autowired
	private FamilleRepository familleRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Famille f1 = familleRepo.save(new Famille("famName", "famPrenom", "famCivilite", "famTel1", "famTel2", "famMail", 
				"famTypeInscript", "famAdresse", "famVille", "famCodePostal", "famTelUrgence", 212));
		

		Famille f2 = familleRepo.save(new Famille("famName2", "famPrenom2", "famCivilite2", "famTel12", "famTel22", "famMail2", 
				"famTypeInscript2", "famAdresse2", "famVille2", "famCodePostal2", "famTelUrgence2", 999));
		
		
		Eleve elev1 = eleveRepo.save(new Eleve("Kherchouch", "Brahim", "1", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 2, 12, "Samedi Matin"));
		elev1.setFamille(f1);

		Eleve elev2 = eleveRepo.save(new Eleve("Kherchouch2", "Brahim2", "2", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 2, 12, "Samedi Matin"));
		elev2.setFamille(f2);
		eleveRepo.saveAndFlush(elev2);
		
		eleveRepo.save(new Eleve("Kherchouch3", "Brahim3", "3", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 2, 12, "Samedi Matin"));
		eleveRepo.save(new Eleve("Kherchouch4", "Brahim4", "4", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 2, 12, "Samedi Matin"));

		eleveRepo.findAll().forEach(elev -> System.out.println(elev.getElvName()
				+ " " + elev.getElvPrenom()));
		
		
	}
}
