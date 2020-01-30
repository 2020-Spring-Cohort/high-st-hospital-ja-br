public class Employee {

    String name = "Bob";
    int employeeNumber = 1;
    int employeeSalary = 1000;
    public int paySalary() {
       return 10;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public int getSalary() {
        return employeeSalary;
    }

    public Boolean hasBeenPaid() {
        return false;
    }
}
