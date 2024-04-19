public abstract class MedicalStaff extends Person implements Care{

    protected String employeeId;

    public MedicalStaff(String name, int age, String socialSecurityNumber, String employeeId) {
        super(name, age, socialSecurityNumber);
        this.employeeId = employeeId;
    }

    public void getRole() {
    }

}
