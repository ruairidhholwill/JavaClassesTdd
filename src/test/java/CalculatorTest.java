import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(20.00, 10.00);
    }

    @Test
    public void canAdd(){
        assertEquals(30.00, calculator.addNumbers());
    }

    @Test
    public void canMinus(){
        assertEquals(10.00, calculator.minusNumbers());
    }

    @Test
    public void canMultiply(){
        assertEquals(200.00, calculator.multiplyNumbers());
    }

    @Test
    public void canDivide(){
        assertEquals(2.00, calculator.divideNumbers());
    }

}
