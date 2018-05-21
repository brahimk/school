package com.brahimk.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class eleve implements Serializable{

	@Id @GeneratedValue
	private Long	elv_id;
	private String 	elv_name;
	private String 	elv_prenom;
	
	@Temporal(TemporalType.DATE)
	private Date 	elv_dt_naissance;
	private String	elv_lieu_naissance;
	private String 	elv_sortie;	
	private String 	elv_niveau;
	private int 	elv_vide;
	private int 	fam_id;
	private int 	cls_id;
	private int 	cotisation;
	
	public Long getElv_id() {
		return elv_id;
	}
	public void setElv_id(Long elv_id) {
		this.elv_id = elv_id;
	}
	public String getElv_name() {
		return elv_name;
	}
	public void setElv_name(String elv_name) {
		this.elv_name = elv_name;
	}
	public String getElv_prenom() {
		return elv_prenom;
	}
	public void setElv_prenom(String elv_prenom) {
		this.elv_prenom = elv_prenom;
	}
	public Date getElv_dt_naissance() {
		return elv_dt_naissance;
	}
	public void setElv_dt_naissance(Date elv_dt_naissance) {
		this.elv_dt_naissance = elv_dt_naissance;
	}
	public String getElv_lieu_naissance() {
		return elv_lieu_naissance;
	}
	public void setElv_lieu_naissance(String elv_lieu_naissance) {
		this.elv_lieu_naissance = elv_lieu_naissance;
	}
	public String getElv_sortie() {
		return elv_sortie;
	}
	public void setElv_sortie(String elv_sortie) {
		this.elv_sortie = elv_sortie;
	}
	public String getElv_niveau() {
		return elv_niveau;
	}
	public void setElv_niveau(String elv_niveau) {
		this.elv_niveau = elv_niveau;
	}
	public long getElv_vide() {
		return elv_vide;
	}
	public void setElv_vide(int elv_vide) {
		this.elv_vide = elv_vide;
	}
	public long getFam_id() {
		return fam_id;
	}
	public void setFam_id(int fam_id) {
		this.fam_id = fam_id;
	}
	public long getCls_id() {
		return cls_id;
	}
	public void setCls_id(int cls_id) {
		this.cls_id = cls_id;
	}
	public long getCotisation() {
		return cotisation;
	}
	public void setCotisation(int cotisation) {
		this.cotisation = cotisation;
	}
	public eleve(String elv_name, String elv_prenom, Date elv_dt_naissance, String elv_lieu_naissance,
			String elv_sortie, String elv_niveau, int elv_vide, int fam_id, int cls_id, int cotisation) {
		super();
		this.elv_name = elv_name;
		this.elv_prenom = elv_prenom;
		this.elv_dt_naissance = elv_dt_naissance;
		this.elv_lieu_naissance = elv_lieu_naissance;
		this.elv_sortie = elv_sortie;
		this.elv_niveau = elv_niveau;
		this.elv_vide = elv_vide;
		this.fam_id = fam_id;
		this.cls_id = cls_id;
		this.cotisation = cotisation;
	}
	public eleve() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
