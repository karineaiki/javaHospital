public class Doctor extends MedicalStaff {
    private String specialty;
    public Doctor(String name, int age, String socialSecurityNumber, String employeeId, String specialty) {
        super(name, age, socialSecurityNumber, employeeId);
        this.specialty = specialty;
    }

    public void getRole() {
        System.out.println("Doctor");
    }

    @Override
    public void careForPatient(Patient patient) {
        System.out.println("Doctor : "+ this.name +" cares of : " + patient.name);
    }
}