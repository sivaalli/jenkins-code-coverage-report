import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    private Calculator cal;

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(2, cal.add(1,1));
    }

}