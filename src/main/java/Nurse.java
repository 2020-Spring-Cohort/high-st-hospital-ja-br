public class Nurse extends Employee implements HealthCareStaff {


    private int numberOfPatients = 0;

    public Nurse(String name){
        this.setName(name);
        this.setSalary(50000);
        this.setRole("Nurse");
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }
    public void setNumberOfPatients(int number){
        this.numberOfPatients = number;
    }

    public int getPatientsUnderCare(int number) {

        return numberOfPatients;
    }

    @Override
    public void drawBlood(Patient patientName) {
        System.out.println(this.getName() + " has drawn blood from " + patientName.getName());


        patientName.giveBlood();
    }
    @Override
    public void fixPatient(Patient patientName){
        System.out.println(this.getName() + " has given treatment to " + patientName);
        patientName.feelBetter();
    }

}
