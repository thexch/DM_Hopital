public class Medecin extends Personnel {
    private String specialite;

    public Medecin(String nom, String prenom, int salaire, String specialite) {
        super(nom, prenom, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void soigner(Patient patient) {
        System.out.println("Le médecin Dr. " + getNom() + " soigne le patient " + patient.getNom() + " pour " + patient.getMaladie());
        patient.setMaladie("Guéri");
    }

    public void traiterUrgence(Patient patient) {
        System.out.println("Le médecin Dr. " + getNom() + " soigne en urgence le patient " + patient.getNom() + " pour " + patient.getMaladie());
        patient.setMaladie("Guéri");
    }

    public void travailler() {
        System.out.println("Le médecin " + getNom() + " spécialiste " + specialite + "consulte des patients.");
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", salaire=" + getSalaire() +
                ", specialite='" + specialite + '\'' +
                '}';
    }
}