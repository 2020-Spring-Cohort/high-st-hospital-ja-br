import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class EmployeeTest {
    private Employee underTest= new Employee();
    @Test
    public void testsGoHere(){

    }
    @Test
    public void employeeCanBePaidWithPaySalary(){
        underTest.paySalary();
        Boolean result = underTest.getPayReceived();
        assertTrue(result);
    }

    @Test
    public  void employeeHasANumber(){
        int result = underTest.getEmployeeNumber();
        assertEquals(0, result);
    }
    @Test
    public  void employeeHasASalary(){
        int result = underTest.getSalary();
        assertEquals(0, result);
    }
    @Test
    public  void employeePayStatus(){
        Boolean result = underTest.getPayReceived();
        assertEquals(false, result);
    }
}



