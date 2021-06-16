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

    //test no capital letters
    @Test
    public void detectCapitalUseTest1() {
       myString.setString("yup yup");
       boolean capital = myString.detectCapitalUse();
       assertEquals(true, capital);
    }

    //test first letter capital
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("Yup yup");
        boolean capital = myString.detectCapitalUse();
        assertEquals(true, capital);
    }

    //testing capitals in middle of string
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("yup YAH yup");
        boolean capital = myString.detectCapitalUse();
        assertEquals(false, capital);
    }

    //testing all capitals in string
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("YUPYUP");
        boolean capital = myString.detectCapitalUse();
        assertEquals(true, capital);
    }
}
