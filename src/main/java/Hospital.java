import java.util.HashMap;
import java.util.Map;

public class Hospital {
    public Boolean doctorHired = false;
    public HashMap<String, Patient> patientList = new HashMap<>();
    public HashMap<String, Employee> employeeList = new HashMap<>();

    public int numberOfPatients;

    public void addPatientToList(Patient newPatient){
        patientList.put(newPatient.getName(), newPatient);
        numberOfPatients = patientList.size();
        System.out.println(newPatient.getName() + " has been admitted");
        System.out.println("Patients list has been updated!\n");

    }


    public void printPatientList(){
        for(Map.Entry<String, Patient> patient : patientList.entrySet() ){
            System.out.println( patient.getKey() + " Blood: " + patient.getValue().getBloodLevel() + " Health: " + patient.getValue().getHealthLevel() + "\n");
        }
    }


    public void addNewEmployee(Employee newEmployee){

        employeeList.put(newEmployee.getName(), newEmployee);
    }

    public void printEmployeeList() {
        for (Map.Entry<String, Employee> employee : employeeList.entrySet()) {
            System.out.println(employee.getKey() + "( ID: " + employee.getValue().getEmployeeNumber() + " Salary: " + employee.getValue().getSalary() + " Received pay: " + employee.getValue().getPayReceived() + " )");
            if (employee.getValue().getRole() == "Doctor") {
                System.out.println("   ---Specialty : " + ((Doctor) employee.getValue()).getSpecialty() + "\n");
            }
            if (employee.getValue().getRole() == "Nurse") {
                System.out.println("   ---Patients under care : " + numberOfPatients + "\n");
            }
            if (employee.getValue().getRole() == "Receptionist") {
                System.out.println("   ---On the phone : " + ((Receptionist) employee.getValue()).isOnPhone + "\n");
            }
            if (employee.getValue().getRole() == "Janitor") {
                System.out.println("   ---Sweeping the floor : " + ((Janitor) employee.getValue()).isSweepingFloor + "\n");
            }
        }
    }
    public void payAllEmployees(){
        for (Map.Entry<String, Employee> employee : employeeList.entrySet()){
            employee.getValue().paySalary();
        }
    }

    public void setDoctorHired(boolean b) {
        this.doctorHired = b;
    }
}
