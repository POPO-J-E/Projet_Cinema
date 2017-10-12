package com.ddsociety.projet_cinema.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by kifkif on 12/10/2017.
 */
public class PersonnagePK implements Serializable {
    private Integer noFilm;
    private Integer noAct;

    @Column(name = "NoFilm")
    @Id
    public Integer getNoFilm() {
        return noFilm;
    }

    public void setNoFilm(Integer noFilm) {
        this.noFilm = noFilm;
    }

    @Column(name = "NoAct")
    @Id
    public Integer getNoAct() {
        return noAct;
    }

    public void setNoAct(Integer noAct) {
        this.noAct = noAct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonnagePK that = (PersonnagePK) o;

        if (noFilm != null ? !noFilm.equals(that.noFilm) : that.noFilm != null) return false;
        if (noAct != null ? !noAct.equals(that.noAct) : that.noAct != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noFilm != null ? noFilm.hashCode() : 0;
        result = 31 * result + (noAct != null ? noAct.hashCode() : 0);
        return result;
    }
}
