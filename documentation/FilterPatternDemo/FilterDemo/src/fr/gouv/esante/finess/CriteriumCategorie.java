package fr.gouv.esante.finess;

import java.util.ArrayList;
import java.util.List;

public class CriteriumCategorie implements Criterium {
    private Categorie categorie;

    public CriteriumCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public List<EGE> meetCriteria(List<EGE> eges) {
        List<EGE> egesFiltrados = new ArrayList<>();
        for (EGE ege : eges) {
            if (ege.getCategorie().equals(this.categorie)) {
                egesFiltrados.add(ege);
            }
        }
        return egesFiltrados;
    }
}