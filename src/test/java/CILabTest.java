import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
       myString.setString("yup yup");
       boolean capital = myString.detectCapitalUse();
       assertEquals(false, capital);
    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("Yup yup");
        boolean capital = myString.detectCapitalUse();
        assertEquals(true, capital);
    }


}
