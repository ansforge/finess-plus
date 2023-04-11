package fr.gouv.esante.finess;
import java.util.List;

public class AndCriterium implements Criterium {

    private Criterium criterium;
    private Criterium otherCriterium;

    public AndCriterium(Criterium criterium, Criterium otherCriterium) {
        this.criterium = criterium;
        this.otherCriterium = otherCriterium;
    }

    @Override
    public List<EGE> meetCriteria(List<EGE> eges) {
        List<EGE> firstCriteriaEGEs = criterium.meetCriteria(eges);
        return otherCriterium.meetCriteria(firstCriteriaEGEs);
    }
}
