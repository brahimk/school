package com.brahimk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brahimk.dao.EleveRepository;
import com.brahimk.entites.eleve;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SchoolApplication implements CommandLineRunner{

	@Autowired
	private EleveRepository elevRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		elevRepo.save(new eleve("Kherchouch", "Brahim", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 1, 2, 12));

		elevRepo.save(new eleve("Kherchouch2", "Brahim2", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 1, 2, 12));
		elevRepo.save(new eleve("Kherchouch3", "Brahim3", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 1, 2, 12));
		elevRepo.save(new eleve("Kherchouch4", "Brahim4", dt.parse("20/01/1980"),
				"Paris", "non", "12", 21, 1, 2, 12));

		elevRepo.findAll().forEach(elev -> System.out.println(elev.getElv_name()
				+ " " + elev.getElv_prenom()));
	}
}
