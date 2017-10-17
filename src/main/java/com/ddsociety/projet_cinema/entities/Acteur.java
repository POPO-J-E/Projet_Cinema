package com.ddsociety.projet_cinema.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by kifkif on 12/10/2017.
 */
@Entity
public class Acteur {
    private Integer noAct;
    private Date dateDeces;
    private Date dateNaiss;
    private String nomAct;
    private String prenAct;

    @Id
    @Column(name = "no_act")
    public Integer getNoAct() {
        return noAct;
    }

    public void setNoAct(Integer noAct) {
        this.noAct = noAct;
    }

    @Basic
    @Column(name = "date_deces")
    public Date getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(Date dateDeces) {
        this.dateDeces = dateDeces;
    }

    @Basic
    @Column(name = "date_naiss")
    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    @Basic
    @Column(name = "nom_act")
    public String getNomAct() {
        return nomAct;
    }

    public void setNomAct(String nomAct) {
        this.nomAct = nomAct;
    }

    @Basic
    @Column(name = "pren_act")
    public String getPrenAct() {
        return prenAct;
    }

    public void setPrenAct(String prenAct) {
        this.prenAct = prenAct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Acteur acteur = (Acteur) o;

        if (noAct != null ? !noAct.equals(acteur.noAct) : acteur.noAct != null) return false;
        if (dateDeces != null ? !dateDeces.equals(acteur.dateDeces) : acteur.dateDeces != null) return false;
        if (dateNaiss != null ? !dateNaiss.equals(acteur.dateNaiss) : acteur.dateNaiss != null) return false;
        if (nomAct != null ? !nomAct.equals(acteur.nomAct) : acteur.nomAct != null) return false;
        if (prenAct != null ? !prenAct.equals(acteur.prenAct) : acteur.prenAct != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noAct != null ? noAct.hashCode() : 0;
        result = 31 * result + (dateDeces != null ? dateDeces.hashCode() : 0);
        result = 31 * result + (dateNaiss != null ? dateNaiss.hashCode() : 0);
        result = 31 * result + (nomAct != null ? nomAct.hashCode() : 0);
        result = 31 * result + (prenAct != null ? prenAct.hashCode() : 0);
        return result;
    }
}
