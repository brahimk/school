package com.brahimk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brahimk.dao.EleveRepository;
import com.brahimk.entites.Eleve;


@SpringBootApplication
public class SchoolApplication implements CommandLineRunner{

	@Autowired
	private EleveRepository eleveRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		eleveRepo.save(new Eleve("Kherchouch", "Brahim", "1", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 1, 2, 12, "Samedi Matin"));

		eleveRepo.save(new Eleve("Kherchouch2", "Brahim2", "2", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 1, 2, 12, "Samedi Matin"));
		eleveRepo.save(new Eleve("Kherchouch3", "Brahim3", "3", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 1, 2, 12, "Samedi Matin"));
		eleveRepo.save(new Eleve("Kherchouch4", "Brahim4", "4", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 1, 2, 12, "Samedi Matin"));

		eleveRepo.findAll().forEach(elev -> System.out.println(elev.getElvName()
				+ " " + elev.getElvPrenom()));
	}
}
