package test.driven.development;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddForEmptyInput() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.add(""));
    }

    @Test
    public void testAddForSingleNumber() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testAddForTwoNumber() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(6, calculator.add("1,5"));
    }

    @Test
    public void testAddForNumbersLineAndCommaSeparated() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    public void testAddForNumbersCustomSeparated() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.add("//;\n1;2"));
    }

    @Test
    public void testAddForNegativeNumbers() {
        Calculator calculator = new Calculator();
        Exception exception = Assert.assertThrows(
                IllegalArgumentException.class, () -> {
                    calculator.add("-1");
                }
        );
        Assert.assertEquals("negative numbers not allowed -1", exception.getMessage());
    }
}
