import java.util.Scanner;

public class HospitalApplication {
    public static Hospital highStreetHospital = new Hospital();


    public static void main(String[] args) {
            addDefaultPatients();
            addDefaultEmployees();
            showAllPatients();
            printEmployeeList();
            issuePaychecks();
            admitNextPatient();
            printEmployeeList();
            drawBloodFromPatient("Greta","Cooper");
            improvePatientHealth("Jacoby","Diane");
            showAllPatients();
        }

    private static void printEmployeeList() {
        highStreetHospital.printEmployeeList();
    }


    private static void admitNextPatient() {
        highStreetHospital.addPatientToList(new Patient("Audrey"));
    }

    private static void improvePatientHealth(String name, String patientName) {
        ((HealthCareStaff) highStreetHospital.employeeList.get(name)).fixPatient(highStreetHospital.patientList.get(patientName));

    }

    private static void issuePaychecks() {
        highStreetHospital.payAllEmployees();
    }

    private static void showAllPatients() {
        highStreetHospital.printPatientList();
    }

    private static void drawBloodFromPatient(String name, String patientName) {
        ((HealthCareStaff) highStreetHospital.employeeList.get(name)).drawBlood(highStreetHospital.patientList.get(patientName));


    }

    public static void addDefaultPatients(){
        highStreetHospital.addPatientToList(new Patient("Diane"));
        highStreetHospital.addPatientToList(new Patient("Laura"));
        highStreetHospital.addPatientToList(new Patient("Cooper"));
    }
    public static void addDefaultEmployees(){
        highStreetHospital.addNewEmployee(new Doctor("Jacoby", 1337, "Psychiatrist"));
        highStreetHospital.addNewEmployee(new Nurse("Greta"));
        highStreetHospital.addNewEmployee(new Receptionist("Lucy"));
        highStreetHospital.addNewEmployee(new Janitor("Hank"));


        }



    }


