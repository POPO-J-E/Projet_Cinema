package com.ddsociety.projet_cinema.repositories;

import com.ddsociety.projet_cinema.entities.Personnage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 12/10/2017
*/
@Repository
public interface PersonnageRepository extends JpaRepository<Personnage, Integer> {

}