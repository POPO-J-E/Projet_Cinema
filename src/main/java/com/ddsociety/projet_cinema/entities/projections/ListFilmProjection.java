package com.ddsociety.projet_cinema.entities.projections;

import com.ddsociety.projet_cinema.entities.Film;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

/**
 * Created by kifkif on 19/10/2017.
 */
@Projection(name = "list" , types = Film.class)
public interface ListFilmProjection {
    Integer getNoFilm();
    Date getDateSortie();
    Integer getDuree();
    String getTitre();
}
