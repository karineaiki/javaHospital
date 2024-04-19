public interface Care {
    
    void careForPatient(Patient patient);

    default void recordPatientVisit(String notes){
        System.out.println(notes);
    };
}
