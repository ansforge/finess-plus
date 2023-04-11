package fr.gouv.esante.finess;
import java.util.List;

public class OrCriterium implements Criterium {

    private Criterium criterium;
    private Criterium otherCriterium;

    public OrCriterium(Criterium criterium, Criterium otherCriterium) {
        this.criterium = criterium;
        this.otherCriterium = otherCriterium;
    }

    @Override
    public List<EGE> meetCriteria(List<EGE> eges) {
        List<EGE> firstCriteriaEGEs = criterium.meetCriteria(eges);
        List<EGE> otherCriteriaEGEs = otherCriterium.meetCriteria(eges);

        for (EGE ege : otherCriteriaEGEs) {
            if (!firstCriteriaEGEs.contains(ege)) {
                firstCriteriaEGEs.add(ege);
            }
        }
        return firstCriteriaEGEs;
    }
}
