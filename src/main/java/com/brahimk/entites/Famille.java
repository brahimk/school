package com.brahimk.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Famille implements Serializable{

	
	private static final long serialVersionUID = -173712558912200668L;
	
	@Id @GeneratedValue
	private Long famId;
	
	private String famName;
	private String famPrenom;
	private String famCivilite;
	private String famTel1;
	private String famTel2;
	private String famMail;
	private String famTypeInscript;
	private String famAdresse;
	private String famVille;
	private String famCodePostal;
	
	private int cotisation;
	
	
	
}
