package com.monica.stringcalculatortest;

import org.junit.Assert;
import org.junit.Test;

import com.monica.stringcalculator.StringCalculator4;
import com.monica.stringcalculator.StringCalculator5;

public class StringCalculatorTest5 {
	@Test
    public final void givenStringOfNumbers_when2Numbers_NoExceptionIsThrown() {
        StringCalculator5.add("6,1");
        Assert.assertTrue(true);
    }
    @Test
    public final void givenString_whenEmpty_ReturnValueIs0() {
        Assert.assertEquals(0, StringCalculator5.add(""));
    }
    @Test
	public final void givenStringOfNumbers_whenOneNumberIsUsed_ReturnsSameNumber() {
		Assert.assertEquals(5, StringCalculator5.add("5"));
	}

	@Test
	public final void givenStringOfNumbers_whenTwoNumbersAreUsed_ReturnSumOfTheirs() {
		Assert.assertEquals(3+6, StringCalculator5.add("3,6"));
	}
	@Test
	public final void givenStringOfNumbers_whenAnyNumberOfNumbersAreUsed_ReturnSumOfTheirs() {
		Assert.assertEquals(3+6+11+1+27, StringCalculator5.add("3,6,11,1,27"));
	}
	@Test
	public final void givenStringOfNumbers_whenNewLineIsUsedBetweenNumber_ReturnSumOfTheirs() {
		Assert.assertEquals(4+10+23, StringCalculator5.add("4,10\n23"));
	}
	@Test
	public final void givenStrigOfNumbers_whenNewDelimiterIsFound_ReturnTheSumOfNumbers() {
		Assert.assertEquals(4+76+19, StringCalculator5.add("//;\n4;76;19"));
	}
	@Test
	public final void givenStrigOfNumbers_whenNegativeNumbersAreUsed_RuntimeExceptionIsThrown() {
		RuntimeException exception = null;
		try {
			StringCalculator5.add("1,-8,15,-43,99");
		} catch (RuntimeException e) {
			exception = e;
		}
		Assert.assertNotNull(exception);
		Assert.assertEquals("Negatives are not allowed: [-8, -43]", exception.getMessage());
	}

}
