package test.driven.development;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddForEmptyInput(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.add(""));
    }
}
