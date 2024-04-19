import java.util.ArrayList;

public class Patient extends Person {
    private String patientId;
    private ArrayList<Illness> illnessList = new ArrayList<>();

    public Patient(String name, int age, String socialSecurityNumber, String PatientId, ArrayList<Illness> illnessList) {
        super(name, age, socialSecurityNumber);
        this.patientId = patientId;
        this.illnessList = illnessList;
    }

    public String getInfo() {
        String illnessInfo = "";
        for (Illness illness : illnessList) {
            illnessInfo += illness.getInfo();
        }
        return "Nom : "+ this.name + "\nAge : " + this.age + "\nNuméro de sécurité sociale : " + this.socialSecurityNumber + "\nInformations sur la maladie :\n " + illnessInfo;
    }
}

