public class Patient{
    private boolean active = true;
    String patientName;
    int degreeOfSeverity;
    int age;
    int riskLevel;
    public Patient(String patientName, int degreeOfSeverity, int age){
        this.patientName = patientName;
        this.degreeOfSeverity = degreeOfSeverity;
        this.age = age;
        riskLevel = this.age + this.degreeOfSeverity;
    }
    public void leaveHospital() {
        active = false;
    }
}
