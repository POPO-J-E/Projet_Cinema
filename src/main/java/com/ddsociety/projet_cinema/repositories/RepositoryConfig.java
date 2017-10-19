package com.ddsociety.projet_cinema.repositories;

/**
 * Created by kifkif on 12/10/2017.
 */
import com.ddsociety.projet_cinema.entities.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Acteur.class);
        config.exposeIdsFor(Categorie.class);
        config.exposeIdsFor(Film.class);
        config.exposeIdsFor(Personnage.class);
        config.exposeIdsFor(Realisateur.class);

        config.getCorsRegistry()
                .addMapping("/**") //
                .allowedOrigins("*") //
                .allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "POST", "DELETE", "PATCH") //
                .allowedHeaders("*");
    }
}