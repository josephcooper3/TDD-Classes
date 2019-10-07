import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calc.subtract(6, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(12, calc.multiply(6, 2));
    }

}
