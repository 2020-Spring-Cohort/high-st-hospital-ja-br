import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HospitalTest{
    private Hospital underTest = new Hospital();

    @Test
    public void hospitalHasAListOfPatients(){
      underTest.addPatientToList(new Patient("Bob"));
      Boolean result = underTest.patientList.containsKey("Bob");
      assertEquals(true, result);
    }


}
