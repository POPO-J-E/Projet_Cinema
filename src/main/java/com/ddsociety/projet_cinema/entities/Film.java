package com.ddsociety.projet_cinema.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by kifkif on 12/10/2017.
 */
@Entity
public class Film {
    private Integer noFilm;
    private Integer budget;
    private Date dateSortie;
    private Integer duree;
    private Integer montantRecette;
    private String titre;

    private String synopsis;
    private String img;

    private Categorie categorie;
    private Realisateur realisateur;
    private List<Personnage> personnages;

    private @JsonIgnore @LastModifiedDate Date updTs;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "no_film")
    public Integer getNoFilm() {
        return noFilm;
    }

    public void setNoFilm(Integer noFilm) {
        this.noFilm = noFilm;
    }

    @Basic
    @Column(name = "budget")
    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @Basic
    @Column(name = "date_sortie")
    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Basic
    @Column(name = "duree")
    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    @Basic
    @Column(name = "montant_recette")
    public Integer getMontantRecette() {
        return montantRecette;
    }

    public void setMontantRecette(Integer montantRecette) {
        this.montantRecette = montantRecette;
    }

    @Basic
    @Column(name = "titre")
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


    @Basic
    @Column(name = "synopsis")
    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }


    @Basic
    @Column(name = "img")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @ManyToOne
    @JoinColumn(name="code_cat")
    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @ManyToOne
    @JoinColumn(name="no_rea")
    public Realisateur getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }

    @OneToMany(mappedBy = "film")
    public List<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(List<Personnage> personnages) {
        this.personnages = personnages;
    }

    public Date getUpdTs() {
        return updTs;
    }

    public void setUpdTs(Date updTs) {
        this.updTs = updTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        if (noFilm != null ? !noFilm.equals(film.noFilm) : film.noFilm != null) return false;
        if (budget != null ? !budget.equals(film.budget) : film.budget != null) return false;
        if (dateSortie != null ? !dateSortie.equals(film.dateSortie) : film.dateSortie != null) return false;
        if (duree != null ? !duree.equals(film.duree) : film.duree != null) return false;
        if (montantRecette != null ? !montantRecette.equals(film.montantRecette) : film.montantRecette != null)
            return false;
        if (titre != null ? !titre.equals(film.titre) : film.titre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noFilm != null ? noFilm.hashCode() : 0;
        result = 31 * result + (budget != null ? budget.hashCode() : 0);
        result = 31 * result + (dateSortie != null ? dateSortie.hashCode() : 0);
        result = 31 * result + (duree != null ? duree.hashCode() : 0);
        result = 31 * result + (montantRecette != null ? montantRecette.hashCode() : 0);
        result = 31 * result + (titre != null ? titre.hashCode() : 0);
        return result;
    }
}
