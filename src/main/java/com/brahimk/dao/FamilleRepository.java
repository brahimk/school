package com.brahimk.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.brahimk.entites.Famille;

public interface FamilleRepository extends JpaRepository<Famille, Long>{

	/**
	 * On fait une recherche sur le nom, le prenom, le numéro de téléphone ou l'email
	 * @param dataToSearch
	 * @param pageable
	 * @return page des familles trouvés
	 */
	@Query("SELECT p FROM Famille p WHERE (p.famName like :dataToSearch) "
			+ " OR (p.famPrenom like :dataToSearch)  OR (p.famTel1 like :dataToSearch)  OR (p.famTel2 like :dataToSearch) "
			+ " OR (p.famMail like :dataToSearch)")
    public Page<Famille> searchFamillesInfo(@Param("dataToSearch") String dataToSearch, Pageable p);
	
	
	/* Gestion des familles par ville */
	/**
	 * Recherche les familles par ville
	 * @param famVille
	 * @return liste des familles
	 */
	public List<Famille> findByfamVille (String famVille);
	
	/**
	 * On fait la somme des cotisation
	 * @param dataToSearch
	 * @param pageable
	 * @return page des familles trouvés
	 */
	@Query("SELECT sum(cotisation) FROM Famille p ")
    public Famille calculCotisation();
}
