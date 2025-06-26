package IBSJavaAdvance;

import IBSJavaAdvance.CalculatorOop.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorOopTest {
    @Test
    public void checkSumTwoNumbersTest() {
        Calculator calc = new Calculator(2.1, 3.7, "+");
        Assert.assertEquals(5.8, calc.getResult(), 0.0001);
    }

    @Test
    public void checkSubtractionTwoNumbersTest() {
        Calculator calc = new Calculator(4.0, 1.5, "-");
        Assert.assertEquals(2.5, calc.getResult(), 0.0001);
    }

    @Test
    public void checkMultiplicationTwoNumbersTest() {
        Calculator calc = new Calculator(2.0, 7.5, "*");
        Assert.assertEquals(15.0, calc.getResult(), 0.0001);
    }

    @Test
    public void checkDivisionTwoNumbersTest() {
        Calculator calc = new Calculator(20.2, 2.0, "/");
        Assert.assertEquals(10.1, calc.getResult(), 0.0001);
    }

    @Test
    public void checkZeroDivisionTest() {
        Calculator calc = new Calculator(20.0, 0.0, "/");
        Assert.assertTrue(calc.getResult() == null);
    }
}
