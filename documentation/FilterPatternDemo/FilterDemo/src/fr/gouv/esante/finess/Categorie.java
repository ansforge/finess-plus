package fr.gouv.esante.finess;
import java.util.Objects;

public class Categorie {

    private String code;
    private String libelle;

    public Categorie(String code, String libelle){
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
        Categorie categorie = (Categorie) o;
        return code.equals(categorie.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
