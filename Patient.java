public class Patient {
    private String nom;
    private int age;
    private String maladie;

    public Patient(String nom, int age, String maladie) {
        this.nom = nom;
        this.age = age;
        this.maladie = maladie;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getMaladie() {
        return maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", maladie='" + maladie + '\'' +
                '}';
    }
}