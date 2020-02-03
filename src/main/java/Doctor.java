public class Doctor extends Employee implements HealthCareStaff {

    private String specialty;

    public Doctor(String name, int number, String specialty){
        this.setName(name);
        this.setEmployeeNumber(number);
        this.specialty = specialty;
        this.setSalary(90000);
        this.setRole("Doctor");
    }



    public String getSpecialty() {

        return specialty;
    }

    @Override
    public void drawBlood(Patient patient) {
        System.out.println(this.getName() + " has drawn blood from " + patient.getName());

        patient.giveBlood();
    }

    @Override
    public void fixPatient(Patient patient){
        System.out.println(this.getName() + " has given treatment to " + patient.getName());
        patient.feelBetter();
    }
}
