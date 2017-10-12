package com.ddsociety.projet_cinema.Entity;

import javax.persistence.*;

/**
 * Created by kifkif on 12/10/2017.
 */
@Entity
@IdClass(PersonnagePK.class)
public class Personnage {
    private Integer noFilm;
    private Integer noAct;
    private String nomPers;
    private Acteur acteurByNoAct;

    @Id
    @Column(name = "NoFilm")
    public Integer getNoFilm() {
        return noFilm;
    }

    public void setNoFilm(Integer noFilm) {
        this.noFilm = noFilm;
    }

    @Id
    @Column(name = "NoAct")
    public Integer getNoAct() {
        return noAct;
    }

    public void setNoAct(Integer noAct) {
        this.noAct = noAct;
    }

    @Basic
    @Column(name = "NomPers")
    public String getNomPers() {
        return nomPers;
    }

    public void setNomPers(String nomPers) {
        this.nomPers = nomPers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personnage that = (Personnage) o;

        if (noFilm != null ? !noFilm.equals(that.noFilm) : that.noFilm != null) return false;
        if (noAct != null ? !noAct.equals(that.noAct) : that.noAct != null) return false;
        if (nomPers != null ? !nomPers.equals(that.nomPers) : that.nomPers != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noFilm != null ? noFilm.hashCode() : 0;
        result = 31 * result + (noAct != null ? noAct.hashCode() : 0);
        result = 31 * result + (nomPers != null ? nomPers.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "NoAct", referencedColumnName = "NoAct", nullable = false)
    public Acteur getActeurByNoAct() {
        return acteurByNoAct;
    }

    public void setActeurByNoAct(Acteur acteurByNoAct) {
        this.acteurByNoAct = acteurByNoAct;
    }
}
