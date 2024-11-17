public class Main {
    public static void main(String[] args) {
        // Création de l'hôpital
        Hopital hopital = new Hopital("Hôpital Central");

        // Création de patients 
        Patient patient1 = new Patient("Enzo MALOU", 30, "Grippe");
        Patient patient2 = new Patient("Valentin PERROT", 45, "Fracture");
        Patient patient3 = new Patient("CHECLER Théo", 21, "Trop fort");
        Patient patient4 = new Patient("MAUBLANC Théry", 57, "Nul au foot");
        
        // Création de médecins 
        Medecin medecin1 = new Medecin("WIBAUT", "Sofiane", 2500, "Généraliste");
        Medecin medecin2 = new Medecin("DUSSAUGE", "Flavie", 3000, "Orthopédiste");
    
        // Ajout de patients et de médecins à l'hôpital
        hopital.ajouterPatient(patient1);
        hopital.ajouterPatient(patient2);
        hopital.ajouterPatient(patient3);
        hopital.ajouterPatient(patient4);
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);

        // Affichage des patients et des médecins
        System.out.println("Liste des patients de l'hôpital :");
        hopital.afficherPatients();

        System.out.println("\nListe des médecins de l'hôpital :");
        hopital.afficherMedecins();

        // Simulation d'un soin
        System.out.println("\nSoin du patient Enzo MALOU par le Dr. WIBAUT :");
        medecin1.soigner(patient1);

        //simulation d'une urgence
        System.out.println("\nSoin en urgence du patient Valentin PERROT par le Dr. DUSSAUGE :");
        medecin2.traiterUrgence(patient2);

        // Affichage de l'état des patients après le soin
        System.out.println("\nListe des patients après le soin :");
        hopital.afficherPatients();

        // Ajout d'une consultation
        hopital.ajouterConsultation("20/05/2024", patient1, medecin1, "Grippe", "Doliprane");
        
        //Afficahge des consultations
        System.out.println("\nListe des consultations :");
        hopital.afficherConsultations();

        // Ajout d'un rendez-vous
        hopital.ajouterRendezVous("24/12/2024", patient2, medecin2);

        // Affichage des rendez-vous
        System.out.println("\nListe des rendez-vous :");
        hopital.afficherRendezVous();
        
        // Affichage des statistiques
        System.out.println("\nStatistiques de l'hôpital " + hopital.getNom() + " :");
        hopital.statsPatients();
    }
}