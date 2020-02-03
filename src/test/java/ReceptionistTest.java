import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReceptionistTest{
    private Receptionist underTest = new Receptionist("Test Receptionist");

    @Test
    public void checkIfReceptionistIsOnPhone(){
        Boolean result = underTest.getIsOnPhone();
        assertEquals(false, result);
    }
     @Test
     public void receptionistIsPaid45000(){
         int result = underTest.getSalary();
         assertEquals(45000, result);
     }
}
