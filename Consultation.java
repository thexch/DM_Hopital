
public class Consultation{
    private String date;
    private Patient patient;
    private Medecin medecin;
    private String diagnostic;
    private String traitement;

    public Consultation(String date, Patient patient, Medecin medecin, String diagnostic, String traitement){
        this.date = date;
        this.patient = patient;
        this.medecin = medecin;
        this.diagnostic = diagnostic;
        this.traitement = traitement;
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
    public String getDiagnostic(){
        return diagnostic;
    }
    public String getTraitement(){
        return traitement;
    }

    public String toString() {
        return "Consultation{" +
                "date=" + date +
                ", medecin=" + medecin.getNom() +
                ", patient=" + patient.getNom() +
                ", diagnostic='" + diagnostic + '\'' +
                ", traitement='" + traitement + '\'' +
                '}';
    }
}