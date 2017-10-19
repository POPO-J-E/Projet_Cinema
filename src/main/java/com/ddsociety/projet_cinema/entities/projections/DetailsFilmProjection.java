package com.ddsociety.projet_cinema.entities.projections;

import com.ddsociety.projet_cinema.entities.Categorie;
import com.ddsociety.projet_cinema.entities.Film;
import com.ddsociety.projet_cinema.entities.Personnage;
import com.ddsociety.projet_cinema.entities.Realisateur;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;
import java.util.List;

/**
 * Created by kifkif on 19/10/2017.
 */
@Projection(name = "details" , types = Film.class)
public interface DetailsFilmProjection {
    Integer getNoFilm();
    Date getDateSortie();
    Integer getDuree();
    String getTitre();

    Integer getBudget();
    Integer getMontantRecette();

    Categorie getCategorie();
    Realisateur getRealisateur();
    List<Personnage> getPersonnages();
}
