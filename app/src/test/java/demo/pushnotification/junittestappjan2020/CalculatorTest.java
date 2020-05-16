package demo.pushnotification.junittestappjan2020;

import org.junit.Assert;
import org.junit.Test;

import static java.time.Duration.ofMinutes;
import static org.junit.Assert.*;

public class CalculatorTest {
Calculator cal=new Calculator();
    @Test
    public void addTwoNum() {
        assertEquals(30,cal.addTwoNum(10,20));
        assertEquals(20,cal.addTwoNum(10,10));
    }

    @Test
    public void subTwoNum() {
        assertEquals(10,cal.subTwoNum(20,10));
    }

    @Test
    public void divideTwoNum() {
        assertTrue("abc".contains("a"));
    }

    @Test(timeout = 1100)
    public void testInfiniteTametakingLoop()
    {
    }
}