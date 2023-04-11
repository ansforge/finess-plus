package fr.gouv.esante.finess;

import java.util.Objects;

public class Activite {

    private String code;
    private String libelle;

    public Activite(String code, String libelle){
        this.code = code;
        this.libelle = libelle;
    }
    
    public String getCode() {
        return this.code;
    }

    public String getLibelle() {
        return this.libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activite activite = (Activite) o;
        return code.equals(activite.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Activite{" +
                "code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
