package fr.gouv.esante.finess;
import java.util.List;

public interface Criterium {
    public List<EGE> meetCriteria(List<EGE> eges);
}
