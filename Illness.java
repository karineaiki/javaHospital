import java.util.ArrayList;

public class Illness {
    private String name;
    private ArrayList<Medication> medicationList = new ArrayList<>();

    public Illness (String name, ArrayList<Medication> medicationList) {
        this.name = name;
        this.medicationList = medicationList;
    }

    public void addMedication(Medication medication) {
        medicationList.add(medication);
    }

    public String getInfo() {
        String medicationNames = "";
        for (Medication medication : medicationList) {
            medicationNames += medication.getInfo() + "\n";
        }
        return "Patient : " + name + "\n Médicaments : " + medicationNames;
    }
}
