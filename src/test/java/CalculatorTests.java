import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    Calculator calculator;

    @Before public void before(){ calculator = new Calculator(4,2,4.44,2.22);}

    @Test public void canAdd(){assertEquals(6, calculator.add());}

    @Test public void canSubtract(){assertEquals(2, calculator.subtract());}

    @Test public void canMultiply(){assertEquals(8, calculator.multiply());}

    @Test public void canDivide(){assertEquals(2.0, calculator.divide(), 0.0);}
}
