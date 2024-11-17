public class Infirmier extends Personnel {
    private String unite;

    public Infirmier(String nom, String prenom, int salaire, String unite) {
        super(nom, prenom, salaire);
        this.unite = unite;
    }

    public String getUnite() {
        return unite;
    }

    public void travailler() {
        System.out.println("L'infirmier " + getNom() + " faisant partis de l'unité : " + unite + "s'occupe des soins.");
    }


    @Override
    public String toString() {
        return "Infirmier{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", salaire=" + getSalaire() +
                ", unite='" + unite + '\'' +
                '}';
    }
}