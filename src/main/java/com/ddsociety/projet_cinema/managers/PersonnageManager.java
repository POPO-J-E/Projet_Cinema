package com.ddsociety.projet_cinema.managers;

import com.ddsociety.projet_cinema.repositories.PersonnageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 12/10/2017
*/
@Component
public class PersonnageManager {

	@Autowired
	public PersonnageManager(PersonnageRepository personnageRepository) {
		this.personnageRepository = personnageRepository;
	}

	private PersonnageRepository personnageRepository;

}
