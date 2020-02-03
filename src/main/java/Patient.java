public class Patient {



    private int HEALTH_LEVEL;
    private int BLOOD_LEVEL;
    private String name;

    public Patient(String name){
        this.name = name;
        this.HEALTH_LEVEL = 20;
        this.BLOOD_LEVEL = 10;

    }

    public int getHealthLevel() {
        return HEALTH_LEVEL;
    }

    public int getBloodLevel() {
        return BLOOD_LEVEL;
    }

    public void giveBlood() {
        this.BLOOD_LEVEL--;
        System.out.println(this.name + " gave blood!\n");
    }

    public void feelBetter(){
        this.HEALTH_LEVEL++;
        System.out.println(this.name + " is feeling better!\n");
    }


    public String getName(){
        return this.name;
    }


}
