package com.monica.stringcalculatortest;

import org.junit.Assert;
import org.junit.Test;
import com.monica.stringcalculator.StringCalculator;

public class StringCalculatorTest {
	
	   @Test(expected = RuntimeException.class)
	    public final void givenStringOfNumbers_whenMorethan2Numbers_ExceptionIsThrown() {
	        StringCalculator.add("1,3,5");
	    }
	    @Test
	    public final void givenStringOfNumbers_when2Numbers_NoExceptionIsThrown() {
	        StringCalculator.add("6,1");
	        Assert.assertTrue(true);
	    }
	    @Test
	    public final void givenString_whenEmpty_ReturnValueIs0() {
	        Assert.assertEquals(0, StringCalculator.add(""));
	    }

}
