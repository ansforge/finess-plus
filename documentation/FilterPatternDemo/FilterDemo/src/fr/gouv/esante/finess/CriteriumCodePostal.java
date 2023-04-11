package fr.gouv.esante.finess;

import java.util.ArrayList;
import java.util.List;

public class CriteriumCodePostal implements Criterium {
    private String codePostal;

    public CriteriumCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public List<EGE> meetCriteria(List<EGE> eges) {
        List<EGE> egesFiltrados = new ArrayList<>();
        for (EGE ege : eges) {
            if (ege.getCodePostal().equalsIgnoreCase(codePostal)) {
                egesFiltrados.add(ege);
            }
        }
        return egesFiltrados;
    }
}
