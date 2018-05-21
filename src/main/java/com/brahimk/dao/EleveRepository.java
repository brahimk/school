package com.brahimk.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.brahimk.entites.Eleve;

public interface EleveRepository extends JpaRepository<Eleve, Long>{

	@Query("Select Sum(cotisation) from eleve")
	public int getSommeCotisation ();
	
	@Query("Select * fom eleve where (p.elvName like :x ) OR (p.elvPrenom like :x ) OR (p.elvNumero like :x ) ")
	public Eleve getElevInfo ( @Param("x") String elevId);
	
	/* Gestion des élèves par famille */	
	public List<Eleve> findByfamId (int famid);
	public Page<Eleve> findByfamId (int fam_id, Pageable p);
	
	
}
