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
       myString.setString("yupyup");
       boolean capital = myString.detectCapitalUse();
       assertTrue(capital);
    }

    //test first letter capital
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("Yupyup");
        boolean capital = myString.detectCapitalUse();
        assertTrue(capital);
    }

    //testing capitals in middle of string
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("yupYAHyup");
        boolean capital = myString.detectCapitalUse();
        assertFalse(capital);
    }

    //testing all capitals in string
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("YUPYUP");
        boolean capital = myString.detectCapitalUse();
        assertTrue(capital);
    }

    //test getString to complete coverage
    @Test
    public void testGetString() {
        myString.setString("YUPYUP");
        String str = myString.getString();
        assertEquals("YUPYUP",str);
    }
}
