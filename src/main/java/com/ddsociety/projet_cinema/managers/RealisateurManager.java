package com.ddsociety.projet_cinema.managers;

import com.ddsociety.projet_cinema.repositories.RealisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 12/10/2017
*/
@Component
public class RealisateurManager {

	@Autowired
	public RealisateurManager(RealisateurRepository realisateurRepository) {
		this.realisateurRepository = realisateurRepository;
	}

	private RealisateurRepository realisateurRepository;

}
