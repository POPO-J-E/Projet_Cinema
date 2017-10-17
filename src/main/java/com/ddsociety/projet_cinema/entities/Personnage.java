package com.ddsociety.projet_cinema.entities;

import javax.persistence.*;

/**
 * Created by kifkif on 12/10/2017.
 */
@Entity
public class Personnage {
    private Integer noPer;
    private String nomPers;

    private Acteur acteur;
    private Film film;

    @Id
    @Column(name = "no_per")
    public Integer getNoPer() {
        return noPer;
    }

    public void setNoPer(Integer noPer) {
        this.noPer = noPer;
    }

    @Basic
    @Column(name = "nom_pers")
    public String getNomPers() {
        return nomPers;
    }

    public void setNomPers(String nomPers) {
        this.nomPers = nomPers;
    }

    @ManyToOne
    @JoinColumn(name = "no_act")
    public Acteur getActeur() {
        return acteur;
    }

    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }


    @ManyToOne
    @JoinColumn(name = "no_film")
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personnage that = (Personnage) o;

        if (noPer != null ? !noPer.equals(that.noPer) : that.noPer != null) return false;
        if (nomPers != null ? !nomPers.equals(that.nomPers) : that.nomPers != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noPer != null ? noPer.hashCode() : 0;
        result = 31 * result + (nomPers != null ? nomPers.hashCode() : 0);
        return result;
    }
}
