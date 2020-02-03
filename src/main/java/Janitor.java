public class Janitor extends Employee{

    public Janitor(String name){
        this.setName(name);
        this.setSalary(40000);
        this.setRole("Janitor");
    }

    Boolean isSweepingFloor = false;

    public Boolean getIsSweepingFloor() {
        return isSweepingFloor;
    }


}
