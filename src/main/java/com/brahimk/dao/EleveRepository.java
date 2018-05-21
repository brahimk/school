package com.brahimk.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.brahimk.entites.Eleve;

public interface EleveRepository extends JpaRepository<Eleve, Long>{

	/**
	 * On fait une recherche sur le nom, prenom ou le numéro de l'élève
	 * @param dataToSearch
	 * @param pageable
	 * @return page des élèves trouvés
	 */
	@Query("SELECT p FROM Eleve p WHERE (p.elvName like :dataToSearch) "
			+ " OR (p.elvPrenom like :dataToSearch) OR (p.elvNumero like :dataToSearch)")
    public Page<Eleve> SearchElevInfo(@Param("dataToSearch") String dataToSearch, Pageable p);
	
	
	/**
	 * On recherche lélève qui a le numéro "numEleve"
	 * @param dataToSearch
	 * @return l'élève
	 */
	@Query("SELECT p FROM Eleve p WHERE p.elvNumero = :numEleve")
    public Eleve findOneElevFromNum(@Param("numEleve") String numEleve);
	
	
	/* Gestion des élèves par famille */
	/**
	 * Recherche les élèves par famille
	 * @param famid
	 * @return liste des élèves
	 */
	public List<Eleve> findByfamId (int famid);
	
	/**
	 * Recherche les élèves par famille
	 * @param fam_id
	 * @param p
	 * @return page des élèves trouvés
	 */
	public Page<Eleve> findByfamId (int fam_id, Pageable p);
		
	/* Gestion des élèves par classe */
	/**
	 * Recherche les élèves par classe
	 * @param clsId
	 * @return liste des élèves trouvés pour la classe donnée
	 */
	public List<Eleve> findByclsId (int clsId);
	
	/**
	 * Recherche les élèves par classe
	 * @param clsId
	 * @param p
	 * @return page des élèves trouvés pour la classe donnée
	 */
	public Page<Eleve> findByclsId (int clsId, Pageable p);
	
	/* Gestion des élèves par creneau*/
	/**
	 * Recherche les élèves par creneau
	 * @param creneau
	 * @return liste des élèves trouvés pour le creneau donnée
	 */
	public List<Eleve> findBycreneau (String creneau);
	
	/**
	 * Recherche les élèves par creneau
	 * @param creneau
	 * @param p
	 * @return liste des élèves trouvés pour le creneau donnée
	 */
	public Page<Eleve> findBycreneau (String creneau, Pageable p);
	
}
