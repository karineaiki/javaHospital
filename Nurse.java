public class Nurse extends MedicalStaff {

    public Nurse(String name, int age, String socialSecurityNumber, String employeeId) {
        super(name, age, socialSecurityNumber, employeeId);
    }

    public void getRole() {
        System.out.println("Nurse");
    }

    @Override
    public void careForPatient(Patient patient) {
        System.out.println("Nurse " + this.name + " cares for " + patient.name);
    }
    
}
