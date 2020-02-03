import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoctorTest{
    private Doctor underTest = new Doctor("Love", 1, "Heart");

    @Test
    public void doctorHasASpecialty(){
        String result = underTest.getSpecialty();
        assertEquals("Heart", result);
    }

    @Test
    public void doctorIsPaid90000(){
        int result = underTest.getSalary();
        assertEquals(90000, result);
    }
    @Test
    public void doctorCanDrawBlood(){
        Patient testPatient = new Patient("test");
        underTest.drawBlood(testPatient);
       int result = testPatient.getBloodLevel();
       assertEquals(9, result);

    }
    @Test
    public void doctorHasAnEmployeeNumber(){
        int result = underTest.getEmployeeNumber();
        assertEquals(1, result);

    }


}
