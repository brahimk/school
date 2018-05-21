package com.brahimk.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Eleve implements Serializable{

	@Id @GeneratedValue
	private Long	elvId;
	
	private int		elvNumero;
	private String 	elvName;
	private String 	elvPrenom;
	
	@Temporal(TemporalType.DATE)
	private Date 	elvDtNaissance;
	private String	elvLieuNaissance;
	private String 	elvSortie;	
	private String 	elvNiveau;
	private int 	elvVide;
	private int 	famId;
	private int 	clsId;
	private int 	cotisation;
	private String	creneau;
	
	
	public Long getElvId() {
		return elvId;
	}
	public void setElvId(Long elvId) {
		this.elvId = elvId;
	}
	public String getElvName() {
		return elvName;
	}
	public void setElvName(String elvName) {
		this.elvName = elvName;
	}
	public String getElvPrenom() {
		return elvPrenom;
	}
	public void setElvPrenom(String elvPrenom) {
		this.elvPrenom = elvPrenom;
	}
	public Date getElvDtNaissance() {
		return elvDtNaissance;
	}
	public void setElvDtNaissance(Date elvDtNaissance) {
		this.elvDtNaissance = elvDtNaissance;
	}
	public String getElvLieuNaissance() {
		return elvLieuNaissance;
	}
	public void setElvLieuNaissance(String elvLieuNaissance) {
		this.elvLieuNaissance = elvLieuNaissance;
	}
	public String getElvSortie() {
		return elvSortie;
	}
	public void setElvSortie(String elvSortie) {
		this.elvSortie = elvSortie;
	}
	public String getElvNiveau() {
		return elvNiveau;
	}
	public void setElvNiveau(String elvNiveau) {
		this.elvNiveau = elvNiveau;
	}
	public int getElvVide() {
		return elvVide;
	}
	public void setElvVide(int elvVide) {
		this.elvVide = elvVide;
	}
	public int getFamId() {
		return famId;
	}
	public void setFamId(int famIid) {
		this.famId = famIid;
	}
	public int getClsId() {
		return clsId;
	}
	public void setClsId(int clsId) {
		this.clsId = clsId;
	}
	public int getCotisation() {
		return cotisation;
	}
	public void setCotisation(int cotisation) {
		this.cotisation = cotisation;
	}
		
	public int getElvNumero() {
		return elvNumero;
	}
	public void setElvNumero(int elvNumero) {
		this.elvNumero = elvNumero;
	}
		
	public String getCreneau() {
		return creneau;
	}
	public void setCreneau(String creneau) {
		this.creneau = creneau;
	}
	
	public Eleve(String elvName, String elvPrenom, int elvNumero, Date elvDtNaissance, String elvLieuNaissance, String elvSortie,
			String elvNiveau, int elvVide, int famIid, int clsId, int cotisation, String creneau) {
		super();
		this.elvName = elvName;
		this.elvPrenom = elvPrenom;
		this.elvNumero = elvNumero;
		this.elvDtNaissance = elvDtNaissance;
		this.elvLieuNaissance = elvLieuNaissance;
		this.elvSortie = elvSortie;
		this.elvNiveau = elvNiveau;
		this.elvVide = elvVide;
		this.famId = famIid;
		this.clsId = clsId;
		this.cotisation = cotisation;
		this.creneau = creneau;
	}
	
	public Eleve() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
