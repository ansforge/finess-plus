package fr.gouv.esante.finess;

public class EGE {
    
    private String numeroFinessEGE;
    private String nomEGE;
    private Categorie categorie;
    private Activite activitesAutorisees;
    private String codePostal;
    public EGE(String numeroFinessEGE, String nomEGE, Categorie categorie, Activite activitesAutorisees,
            String codePostal) {
        this.numeroFinessEGE = numeroFinessEGE;
        this.nomEGE = nomEGE;
        this.categorie = categorie;
        this.activitesAutorisees = activitesAutorisees;
        this.codePostal = codePostal;
    }
    public String getNumeroFinessEGE() {
        return numeroFinessEGE;
    }

    public String getNomEGE() {
        return nomEGE;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Activite getActivitesAutorisees() {
        return activitesAutorisees;
    }

    public String getCodePostal() {
        return codePostal;
    }

}