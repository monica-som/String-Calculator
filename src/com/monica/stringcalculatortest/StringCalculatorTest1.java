package com.monica.stringcalculatortest;

import org.junit.Assert;
import org.junit.Test;

import com.monica.stringcalculator.StringCalculator1;

public class StringCalculatorTest1 {
	  @Test(expected = RuntimeException.class)
	    public final void givenStringOfNumbers_whenMorethan2Numbers_ExceptionIsThrown() {
	        StringCalculator1.add("1,3,5");
	    }
	    @Test
	    public final void givenStringOfNumbers_when2Numbers_NoExceptionIsThrown() {
	        StringCalculator1.add("6,1");
	        Assert.assertTrue(true);
	    }
	    @Test
	    public final void givenString_whenEmpty_ReturnValueIs0() {
	        Assert.assertEquals(0, StringCalculator1.add(""));
	    }
	    @Test
		public final void givenStringOfNumbers_whenOneNumberIsUsed_ReturnsSameNumber() {
			Assert.assertEquals(5, StringCalculator1.add("5"));
		}

		@Test
		public final void givenStringOfNumbers_whenTwoNumbersAreUsed_ReturnSumOfTheirs() {
			Assert.assertEquals(3+6, StringCalculator1.add("3,6"));
		}


}
