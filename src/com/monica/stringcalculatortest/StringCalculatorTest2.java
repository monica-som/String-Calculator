package com.monica.stringcalculatortest;

import org.junit.Assert;
import org.junit.Test;

import com.monica.stringcalculator.StringCalculator2;

public class StringCalculatorTest2 {
	
		  //@Test(expected = RuntimeException.class)
		  //  public final void givenStringOfNumbers_whenMorethan2Numbers_ExceptionIsThrown() {
		  //      StringCalculator2.add("1,3,5");
		  //  }
		    @Test
		    public final void givenStringOfNumbers_when2Numbers_NoExceptionIsThrown() {
		        StringCalculator2.add("6,1");
		        Assert.assertTrue(true);
		    }
		    @Test
		    public final void givenString_whenEmpty_ReturnValueIs0() {
		        Assert.assertEquals(0, StringCalculator2.add(""));
		    }
		    @Test
			public final void givenStringOfNumbers_whenOneNumberIsUsed_ReturnsSameNumber() {
				Assert.assertEquals(5, StringCalculator2.add("5"));
			}

			@Test
			public final void givenStringOfNumbers_whenTwoNumbersAreUsed_ReturnSumOfTheirs() {
				Assert.assertEquals(3+6, StringCalculator2.add("3,6"));
			}
			@Test
			public final void givenStringOfNumbers_whenAnyNumberOfNumbersAreUsed_ReturnSumOfTheirs() {
				Assert.assertEquals(3+6+11+1+27, StringCalculator2.add("3,6,11,1,27"));
			}



}
