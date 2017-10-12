package com.ddsociety.projet_cinema.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by kifkif on 12/10/2017.
 */
@Entity
public class Realisateur {
    private Integer noRea;
    private String nomRea;
    private String prenRea;

    @Id
    @Column(name = "NoRea")
    public Integer getNoRea() {
        return noRea;
    }

    public void setNoRea(Integer noRea) {
        this.noRea = noRea;
    }

    @Basic
    @Column(name = "NomRea")
    public String getNomRea() {
        return nomRea;
    }

    public void setNomRea(String nomRea) {
        this.nomRea = nomRea;
    }

    @Basic
    @Column(name = "PrenRea")
    public String getPrenRea() {
        return prenRea;
    }

    public void setPrenRea(String prenRea) {
        this.prenRea = prenRea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Realisateur that = (Realisateur) o;

        if (noRea != null ? !noRea.equals(that.noRea) : that.noRea != null) return false;
        if (nomRea != null ? !nomRea.equals(that.nomRea) : that.nomRea != null) return false;
        if (prenRea != null ? !prenRea.equals(that.prenRea) : that.prenRea != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noRea != null ? noRea.hashCode() : 0;
        result = 31 * result + (nomRea != null ? nomRea.hashCode() : 0);
        result = 31 * result + (prenRea != null ? prenRea.hashCode() : 0);
        return result;
    }
}
