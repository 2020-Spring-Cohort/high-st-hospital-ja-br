public class Receptionist extends Employee{
    Boolean isOnPhone = false;

    public Receptionist(String name){
        this.setName(name);
        this.setSalary(45000);
        this.setRole("Receptionist");
    }

    public Boolean getIsOnPhone() {
        return isOnPhone;
    }

}
