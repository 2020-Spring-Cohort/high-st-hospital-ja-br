import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NurseTest{
     private Nurse underTest = new Nurse("Test Nurse");

     @Test
     public void nurseHasNumberOfPatients(){
         int result = underTest.getNumberOfPatients();
         assertEquals(0, result);
     }
      @Test
      public void nurseIsPaid50000(){
          int result = underTest.getSalary();
          assertEquals(50000, result);
      }
      @Test
      public void nurseCanDrawBlood(){
         Patient testPatient = new Patient("Test");
         underTest.drawBlood(testPatient);
         int result = testPatient.getBloodLevel();
         assertEquals(9, result);
      }

  }
