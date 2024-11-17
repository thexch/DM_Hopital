import java.util.ArrayList;
import java.util.List;

public class Hopital {
    private String nom;
    private List<Patient> patients;
    private List<Medecin> medecins;
    private List<Consultation> consultations;
    private List<RendezVous> rendezVous;

    public Hopital(String nom) {
        this.nom = nom;
        this.patients = new ArrayList<>();
        this.medecins = new ArrayList<>();
        this.consultations = new ArrayList<>();
        this.rendezVous = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterPatient(Patient patient) {
        patients.add(patient);
    }

    public void ajouterMedecin(Medecin medecin) {
        medecins.add(medecin);
    }

    public void ajouterConsultation(String date, Patient patient, Medecin medecin, String diagnostic, String traitement) {
        Consultation consultation = new Consultation(date, patient, medecin, diagnostic, traitement);
        consultations.add(consultation);
    }

    public void ajouterRendezVous(String date, Patient patient, Medecin medecin) {
        RendezVous rendezVous = new RendezVous(date, patient, medecin);
        this.rendezVous.add(rendezVous);
    }

    public void afficherPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void afficherMedecins() {
        for (Medecin medecin : medecins) {
            System.out.println(medecin);
        }
    }

    public void afficherConsultations() {
        for (Consultation consultation : consultations) {
            System.out.println(consultation);
        }
    }

    public void afficherRendezVous() {
        for (RendezVous rendezVous : rendezVous) {
            System.out.println(rendezVous);
        }
    }
    
    public void statsPatients() {
        int gueris = 0;
        int malades = 0;

        for (Patient patient : patients) {
            if ("Guéri".equals(patient.getMaladie())) {
                gueris++;
            } else {
                malades++;
            }
        }
        System.out.println("Nombre total de patients : " + patients.size());
        System.out.println("Nombre de patients guéris : " + gueris + " (soit " + (gueris * 100 / patients.size()) + "%)");
        System.out.println("Nombre de patients encore malades : " + malades + " (soit " + (malades * 100 / patients.size()) + "%)");
    }
}