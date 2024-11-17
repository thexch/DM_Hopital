public abstract class Personnel {
    private String nom;
    private String prenom;
    private int salaire;

    public Personnel(String nom, String prenom, int salaire){
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public int getSalaire(){
        return salaire;
    }

    public abstract void travailler();

    @Override
    public String toString() {
        return "Personnel{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}