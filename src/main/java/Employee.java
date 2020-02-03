public class Employee {

    private String role;
    private String name;
    private int employeeNumber;



    private int employeeSalary;
    private Boolean payReceived = false;

    public Employee(){

    }

    public String getName() {

        return name;
    }
    public void setName(String employeeName){
        this.name = employeeName;
    }

    public int getEmployeeNumber() {

        return employeeNumber;
    }

    public void setSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public int getSalary() {
        return employeeSalary;
    }

    public void paySalary(){
        this.payReceived = true;
        System.out.println(this.name + " has been paid!\n");
    }

    protected void setEmployeeNumber(int number) {
        this.employeeNumber = number;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public Boolean getPayReceived(){
        return this.payReceived;
    }
}
