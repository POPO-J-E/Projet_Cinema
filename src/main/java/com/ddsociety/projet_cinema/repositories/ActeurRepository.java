package com.ddsociety.projet_cinema.repositories;

import com.ddsociety.projet_cinema.entities.Acteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
* Generated by Spring Data Generator on 12/10/2017
*/
@RepositoryRestResource
public interface ActeurRepository extends CrudRepository<Acteur, Integer> {

}
