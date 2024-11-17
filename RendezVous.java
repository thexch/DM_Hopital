public class RendezVous {
    private String date;
    private Patient patient;
    private Medecin medecin;  

    public RendezVous(String date, Patient patient, Medecin medecin){
        this.date = date;
        this.patient = patient;
        this.medecin = medecin;
    }

    public String getDate(){
        return date;
    }
    public Patient getPatient(){
        return patient;
    }
    public Medecin getMedecin(){
        return medecin;
    }

    public String toString() {
        return "RendezVous{" +
                "date=" + date +
                ", medecin=" + medecin.getNom() +
                ", patient=" + patient.getNom() +
                '}';
    }
}
