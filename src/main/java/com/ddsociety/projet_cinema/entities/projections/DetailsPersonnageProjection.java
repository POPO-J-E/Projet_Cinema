package com.ddsociety.projet_cinema.entities.projections;

import com.ddsociety.projet_cinema.entities.Acteur;
import com.ddsociety.projet_cinema.entities.Personnage;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by kifkif on 19/10/2017.
 */
@Projection(name = "details" , types = Personnage.class)
public interface DetailsPersonnageProjection {
    Integer getNoPer();
    String getNomPers();
    Acteur getActeur();
}
