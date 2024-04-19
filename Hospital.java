import java.util.ArrayList;

class Hospital {
    public static void main(String[] args) {
        Medication veritas = new Medication("Veritas", "3 doses par jour en cas de crise");
        Medication antiInflammepaule = new Medication("Anti inflammépaule", "1 dose pendant les repas");
        Medication gaviscon = new Medication("Gaviscon", "A prendre quand l'antilammépaule brûle grave l'estomac");

                
        ArrayList<Illness> rogerIllness = new ArrayList<>();
        ArrayList<Illness> roger2Illness = new ArrayList<>();
        ArrayList<Medication> mythoMedication = new ArrayList<>();
        ArrayList<Medication> epauliteMedication = new ArrayList<>();
        Illness mythomane = new Illness("Mythomane", mythoMedication);
        Illness epaulite = new Illness("epaulite", epauliteMedication);
        mythomane.addMedication(veritas);
        epaulite.addMedication(antiInflammepaule);
        epaulite.addMedication(gaviscon);
        rogerIllness.add(mythomane);
        rogerIllness.add(epaulite);
        roger2Illness.add(epaulite);

        Patient roger = new Patient("Roger", 42, "265473292181", "42", rogerIllness);
        Patient roger2 = new Patient("Roger", 42, "4", "5", roger2Illness);
        Doctor roger3 = new Doctor("Roger", 42, "qmfldqefmqie", "1", "Manologue");

        System.out.println(roger.getInfo());
        System.out.println(roger2.getInfo());
        roger3.careForPatient(roger);
    }
}