package fr.gouv.esante.finess;

import java.util.ArrayList;
import java.util.List;

public class CriteriumActivite implements Criterium {
    private Activite activite;

    public CriteriumActivite(Activite activite) {
        this.activite = activite;
    }

    @Override
    public List<EGE> meetCriteria(List<EGE> eges) {
        List<EGE> egesFiltrados = new ArrayList<>();
        for (EGE ege : eges) {
            if (ege.getActivitesAutorisees().equals(activite)) {
                egesFiltrados.add(ege);
            }
        }
        return egesFiltrados;
    }
}