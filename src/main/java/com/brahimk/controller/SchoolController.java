package com.brahimk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brahimk.dao.EleveRepository;
import com.brahimk.dao.FamilleRepository;
import com.brahimk.entites.Eleve;
import com.brahimk.entites.Famille;

@RestController
@RequestMapping("/schoolmanagement")
@CrossOrigin
public class SchoolController {

	@Autowired
	private EleveRepository eleveRepo;
	
	@Autowired
	private FamilleRepository familleRepo;
	
	/**
	 * Methode de récupération des élèves par pagination
	 * @param page
	 * @param size
	 * @return Page des élèves
	 */
	@RequestMapping(value = "/eleves", method = RequestMethod.GET)
	Page<Eleve> getAllEleves( @RequestParam(name="page", defaultValue="0") int page,
							  @RequestParam(name="size", defaultValue="100") int size) {
		return eleveRepo.findAll( PageRequest.of(page, size));
	}

	/**
	 * Methode de récupération des informations sur une élève
	 * @param numElev
	 * @return Eleve
	 */
	@RequestMapping(value = "/eleves/{numElev}", method = RequestMethod.GET)
	Eleve getOneEleve(@PathVariable String numElev) {
		return eleveRepo.findOneElevFromNum(numElev);
	}

	/**
	 * Méthode de récupération des élèves en fonction d'un mot clé
	 * Recherche sur le nom, prénom ou le numéro 
	 * @param dataToSearch
	 * @param page
	 * @param size
	 * @return Page des élèves
	 */
	@RequestMapping(value = "/eleves/{dataToSearch}", method = RequestMethod.GET)
	Page<Eleve> getInfoEleves(@PathVariable String dataToSearch,
							@RequestParam(name="page", defaultValue="0") int page,
							@RequestParam(name="size", defaultValue="100") int size) {
		return eleveRepo.SearchElevInfo("%" + dataToSearch +"%", PageRequest.of(page, size));
	}
	
	/**
	 * Méthode de création des élèves
	 * @param lstEleves
	 * @return Liste des élèves insérés
	 */
	@RequestMapping(value = "/eleves", method = RequestMethod.POST)
	List<Eleve> saveAllEleves( @RequestBody List<Eleve> lstEleves) {
		return eleveRepo.saveAll(lstEleves);
	}
	
	/**
	 * Méthode d'update de la fiche d'un élève
	 * @param l'élève
	 * @return l'élève mis à jour
	 */
	@RequestMapping(value = "/eleves", method = RequestMethod.PUT)
	Eleve updateEleve( @RequestBody Eleve eleve) {
		return eleveRepo.saveAndFlush(eleve);
	}
	
	/**
	 * Suppression d'un élève
	 * @param numElev
	 * @return Eleve supprimé
	 */
	@RequestMapping(value = "/eleves", method = RequestMethod.DELETE)
	void deleteOneEleve(@RequestBody Eleve eleve) {
		eleveRepo.delete(eleve);
	}
		
	/**
	 * Methode de récupération des familles par pagination
	 * @param page
	 * @param size
	 * @return Page des familles
	 */
	@RequestMapping(value = "/familles", method = RequestMethod.GET)
	Page<Famille> getAllFamilles( @RequestParam(name="page", defaultValue="0") int page,
							  	  @RequestParam(name="size", defaultValue="100") int size) {
		return familleRepo.findAll( PageRequest.of(page, size));
	}

	/**
	 * Methode de récupération des informations sur une Famille
	 * @param numFamId
	 * @return Famille
	 */
	@RequestMapping(value = "/familles/{numFamId}", method = RequestMethod.GET)
	Famille getOneFamille(@PathVariable Long numFamId) {
		return familleRepo.getOne(numFamId);
	}

	/**
	 * Méthode de récupération des familles en fonction d'un mot clé
	 * Recherche sur le nom, prénom ou le numéro de téléphone ou mail
	 * @param dataToSearch
	 * @param page
	 * @param size
	 * @return Page des familles
	 */
	@RequestMapping(value = "/familles/{dataToSearch}", method = RequestMethod.GET)
	Page<Famille> getInfoFamilles(@PathVariable String dataToSearch,
							@RequestParam(name="page", defaultValue="0") int page,
							@RequestParam(name="size", defaultValue="100") int size) {
		return familleRepo.searchFamillesInfo("%" + dataToSearch +"%", PageRequest.of(page, size));
	}
	
	/**
	 * Méthode de création des familles
	 * @param lstFamilles
	 * @return Liste des familles insérées
	 */
	@RequestMapping(value = "/familles", method = RequestMethod.POST)
	List<Famille> saveAllFamilles( @RequestBody List<Famille> lstFamilles) {
		return familleRepo.saveAll(lstFamilles);
	}
	
	/**
	 * Méthode d'update de la fiche d'un famille
	 * @param famille
	 * @return famille mise à jour
	 */
	@RequestMapping(value = "/familles", method = RequestMethod.PUT)
	Famille updateFamille( @RequestBody Famille famille) {
		return familleRepo.saveAndFlush(famille);
	}
	
	/**
	 * Suppression d'une famille
	 * @param numFamille
	 * @return famille supprimée
	 */
	@RequestMapping(value = "/familles/{numFamille}", method = RequestMethod.DELETE)
	void deleteOneEleve(@RequestBody Famille famille) {
		familleRepo.delete(famille);
	}
	
}
