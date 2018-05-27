package com.brahimk.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


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
	private String famTelUrgence;	
	private int cotisation;
	
	@JsonIgnore
	@OneToMany (mappedBy="famille", fetch=FetchType.LAZY)
	private Collection<Eleve> eleves;
	
	
	public Long getFamId() {
		return famId;
	}
	public void setFamId(Long famId) {
		this.famId = famId;
	}
	public String getFamName() {
		return famName;
	}
	public void setFamName(String famName) {
		this.famName = famName;
	}
	public String getFamPrenom() {
		return famPrenom;
	}
	public void setFamPrenom(String famPrenom) {
		this.famPrenom = famPrenom;
	}
	public String getFamCivilite() {
		return famCivilite;
	}
	public void setFamCivilite(String famCivilite) {
		this.famCivilite = famCivilite;
	}
	public String getFamTel1() {
		return famTel1;
	}
	public void setFamTel1(String famTel1) {
		this.famTel1 = famTel1;
	}
	public String getFamTel2() {
		return famTel2;
	}
	public void setFamTel2(String famTel2) {
		this.famTel2 = famTel2;
	}
	public String getFamMail() {
		return famMail;
	}
	public void setFamMail(String famMail) {
		this.famMail = famMail;
	}
	public String getFamTypeInscript() {
		return famTypeInscript;
	}
	public void setFamTypeInscript(String famTypeInscript) {
		this.famTypeInscript = famTypeInscript;
	}
	public String getFamAdresse() {
		return famAdresse;
	}
	public void setFamAdresse(String famAdresse) {
		this.famAdresse = famAdresse;
	}
	public String getFamVille() {
		return famVille;
	}
	public void setFamVille(String famVille) {
		this.famVille = famVille;
	}
	public String getFamCodePostal() {
		return famCodePostal;
	}
	public void setFamCodePostal(String famCodePostal) {
		this.famCodePostal = famCodePostal;
	}
	public String getFamTelUrgence() {
		return famTelUrgence;
	}
	public void setFamTelUrgence(String famTelUrgence) {
		this.famTelUrgence = famTelUrgence;
	}
	public int getCotisation() {
		return cotisation;
	}
	public void setCotisation(int cotisation) {
		this.cotisation = cotisation;
	}
	public Famille(String famName, String famPrenom, String famCivilite, String famTel1, String famTel2, String famMail,
			String famTypeInscript, String famAdresse, String famVille, String famCodePostal, String famTelUrgence,
			int cotisation) {
		super();
		this.famName = famName;
		this.famPrenom = famPrenom;
		this.famCivilite = famCivilite;
		this.famTel1 = famTel1;
		this.famTel2 = famTel2;
		this.famMail = famMail;
		this.famTypeInscript = famTypeInscript;
		this.famAdresse = famAdresse;
		this.famVille = famVille;
		this.famCodePostal = famCodePostal;
		this.famTelUrgence = famTelUrgence;
		this.cotisation = cotisation;
	}
	public Famille() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Collection<Eleve> getEleves() {
		return eleves;
	}
	public void setEleves(Collection<Eleve> eleves) {
		this.eleves = eleves;
	}
	
	
	
	
}
