import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {

        private Patient underTest = new Patient("Name");

        @Test
        public void patientHasHealthLevel(){
            int result = underTest.getHealthLevel();
            assertEquals(20, result);
        }
        @Test
        public void patientHasBloodLevel(){
            int result = underTest.getBloodLevel();
            assertEquals(10, result);
        }
        @Test
        public void patientCanGiveBlood(){
            underTest.giveBlood();
            int result = underTest.getBloodLevel();
            assertEquals(9, result);
        }
    }

