package com.ddsociety.projet_cinema.Entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by kifkif on 12/10/2017.
 */
@Entity
public class Film {
    private Integer noFilm;
    private String titre;
    private Integer duree;
    private Date dateSortie;
    private Integer budget;
    private Integer montantRecette;
    private Realisateur realisateurByNoRea;
    private Categorie categorieByCodeCat;

    @Id
    @Column(name = "NoFilm")
    public Integer getNoFilm() {
        return noFilm;
    }

    public void setNoFilm(Integer noFilm) {
        this.noFilm = noFilm;
    }

    @Basic
    @Column(name = "Titre")
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Basic
    @Column(name = "Duree")
    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    @Basic
    @Column(name = "DateSortie")
    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Basic
    @Column(name = "Budget")
    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @Basic
    @Column(name = "MontantRecette")
    public Integer getMontantRecette() {
        return montantRecette;
    }

    public void setMontantRecette(Integer montantRecette) {
        this.montantRecette = montantRecette;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        if (noFilm != null ? !noFilm.equals(film.noFilm) : film.noFilm != null) return false;
        if (titre != null ? !titre.equals(film.titre) : film.titre != null) return false;
        if (duree != null ? !duree.equals(film.duree) : film.duree != null) return false;
        if (dateSortie != null ? !dateSortie.equals(film.dateSortie) : film.dateSortie != null) return false;
        if (budget != null ? !budget.equals(film.budget) : film.budget != null) return false;
        if (montantRecette != null ? !montantRecette.equals(film.montantRecette) : film.montantRecette != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noFilm != null ? noFilm.hashCode() : 0;
        result = 31 * result + (titre != null ? titre.hashCode() : 0);
        result = 31 * result + (duree != null ? duree.hashCode() : 0);
        result = 31 * result + (dateSortie != null ? dateSortie.hashCode() : 0);
        result = 31 * result + (budget != null ? budget.hashCode() : 0);
        result = 31 * result + (montantRecette != null ? montantRecette.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "NoRea", referencedColumnName = "NoRea", nullable = false)
    public Realisateur getRealisateurByNoRea() {
        return realisateurByNoRea;
    }

    public void setRealisateurByNoRea(Realisateur realisateurByNoRea) {
        this.realisateurByNoRea = realisateurByNoRea;
    }

    @ManyToOne
    @JoinColumn(name = "CodeCat", referencedColumnName = "CodeCat", nullable = false)
    public Categorie getCategorieByCodeCat() {
        return categorieByCodeCat;
    }

    public void setCategorieByCodeCat(Categorie categorieByCodeCat) {
        this.categorieByCodeCat = categorieByCodeCat;
    }
}
