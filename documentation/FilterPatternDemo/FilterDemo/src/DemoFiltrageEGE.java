
import java.util.ArrayList;
import java.util.List;

import fr.gouv.esante.finess.Activite;
import fr.gouv.esante.finess.AndCriterium;
import fr.gouv.esante.finess.Categorie;
import fr.gouv.esante.finess.Criterium;
import fr.gouv.esante.finess.CriteriumActivite;
import fr.gouv.esante.finess.CriteriumCategorie;
import fr.gouv.esante.finess.CriteriumCodePostal;
import fr.gouv.esante.finess.EGE;
import fr.gouv.esante.finess.OrCriterium;

public class DemoFiltrageEGE {
    public static void main(String[] args) throws Exception {
        List<EGE> eges = new ArrayList<>();

        eges.add(new EGE("123", "EGE 1", new Categorie("A", "Catégorie A"), new Activite("1", "Activité 1"), "75001"));
        eges.add(new EGE("456", "EGE 2", new Categorie("B", "Catégorie B"), new Activite("2", "Activité 2"), "75002"));
        eges.add(new EGE("789", "EGE 3", new Categorie("A", "Catégorie A"), new Activite("1", "Activité 1"), "75003"));
        eges.add(new EGE("321", "EGE 4", new Categorie("C", "Catégorie C"), new Activite("3", "Activité 3"), "75004"));

        eges.add(new EGE("123", "EGE A", new Categorie("C1", "Categorie 1"), new Activite("A1", "Activite 1"), "75001"));
        eges.add(new EGE("124", "EGE B", new Categorie("C1", "Categorie 1"), new Activite("A2", "Activite 2"), "75002"));
        eges.add(new EGE("125", "EGE C", new Categorie("C2", "Categorie 2"), new Activite("A1", "Activite 1"), "75003"));
        eges.add(new EGE("126", "EGE D", new Categorie("C2", "Categorie 2"), new Activite("A2", "Activite 2"), "75001"));

         Criterium critereCodePostal = new CriteriumCodePostal("75001");
         Criterium critereCategorie = new CriteriumCategorie(new Categorie("A", "Catégorie A"));
         Criterium critereActivite = new CriteriumActivite(new Activite("1", "Activité 1"));

        Criterium critereCodePostalEtCategorie = new AndCriterium(critereCodePostal, critereCategorie);
        Criterium critereCodePostalOuCategorie = new OrCriterium(critereCodePostal, critereCategorie);

        System.out.println("Filtrer par code postal:");
        afficherEGEs(critereCodePostal.meetCriteria(eges));

        System.out.println("\nFiltrer par catégorie:");
        afficherEGEs(critereCategorie.meetCriteria(eges));

        System.out.println("\nFiltrer par activité:");
        afficherEGEs(critereActivite.meetCriteria(eges));

        System.out.println("\nFiltrer par code postal et catégorie:");
        afficherEGEs(critereCodePostalEtCategorie.meetCriteria(eges));

        System.out.println("\nFiltrer par code postal ou catégorie:");
        afficherEGEs(critereCodePostalOuCategorie.meetCriteria(eges));
    }

    public static void afficherEGEs(List<EGE> eges) {
        for (EGE ege : eges) {
            System.out.println("EGE : [ Numéro FINESS EGE : " + ege.getNumeroFinessEGE() + ", Nom EGE : " + ege.getNomEGE() + ", Catégorie : " + ege.getCategorie().getLibelle() + ", Activité : " + ege.getActivitesAutorisees().getLibelle() + ", Code Postal : " + ege.getCodePostal() + " ]");
        }
    }

}
