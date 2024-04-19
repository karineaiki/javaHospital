public class Medication {
    private String name;
    private String dosage;

    public Medication (String name, String dosage) {
        this.name = name;
        this.dosage = dosage;
    }

    public String getInfo() {
        return "Nom : " + name + "\n" + "Dosage : " + dosage;
    }
}
