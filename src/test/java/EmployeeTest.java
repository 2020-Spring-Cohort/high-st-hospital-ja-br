import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


 class EmployeeTest {
    private Employee underTest= new Employee();
    @Test
    public void testsGoHere(){

    }
    @Test
    public void employeeCanBePaidWithPaySalary(){
        int result = underTest.paySalary();
        assertEquals(10, result);
    }
    @Test
    public  void employeeHasAName(){
        String result = underTest.getName();
        assertEquals("Bob", result);
    }
    @Test
    public  void employeeHasANumber(){
        int result = underTest.getEmployeeNumber();
        assertEquals(1, result);
    }
    @Test
    public  void employeeHasASalary(){
        int result = underTest.getSalary();
        assertEquals(1000, result);
    }
    @Test
    public  void employeePayStatus(){
        Boolean result = underTest.hasBeenPaid();
        assertEquals(false, result);
    }
}

 class PatientTest{
    private Patient underTest = new Patient();

    @Test
     public void patientHasHealthLevel(){
        int result = underTest.getHealthLevel();
        assertEquals(100, result);
    }
    @Test
    public void patientHasBloodLevel(){
        int result = underTest.getBloodLevel();
        assertEquals(100, result);
    }
}

 class DoctorTest{
     private Doctor underTest = new Doctor();

     @Test
     public void doctorHasASpecialty(){
         String result = underTest.getSpecialty();
         assertEquals("Heart", result);
     }
 }

  class NurseTest{
     private Nurse underTest = new Nurse();

     @Test
     public void nurseHasNumberOfPatients(){
         int result = underTest.getNumberOfPatients();
         assertEquals(0, result);
     }
  }

 class ReceptionistTest{
    private Receptionist underTest = new Receptionist();

    @Test
    public void checkIfReceptionistIsOnPhone(){
        Boolean result = underTest.getIsOnPhone();
        assertEquals(false, result);
    }
}

 class JanitorTest{
    private Janitor underTest = new Janitor();

    @Test
     public void checkIfJanitorIsSweepingFloor(){
        Boolean result = underTest.getIsSweepingFloor();
    }
 }