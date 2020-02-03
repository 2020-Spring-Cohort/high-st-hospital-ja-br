import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JanitorTest{
   private Janitor underTest = new Janitor("Test Janitor");

   @Test
    public void checkIfJanitorIsSweepingFloor(){
       Boolean result = underTest.getIsSweepingFloor();
   }

   @Test
   public void janitorIsPaid40000(){
       int result = underTest.getSalary();
       assertEquals(40000, result);
   }
}
