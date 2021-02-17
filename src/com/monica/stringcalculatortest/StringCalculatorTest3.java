package com.monica.stringcalculatortest;

import org.junit.Assert;
import org.junit.Test;

import com.monica.stringcalculator.StringCalculator3;

public class StringCalculatorTest3 {

	@Test
    public final void givenStringOfNumbers_when2Numbers_NoExceptionIsThrown() {
        StringCalculator3.add("6,1");
        Assert.assertTrue(true);
    }
    @Test
    public final void givenString_whenEmpty_ReturnValueIs0() {
        Assert.assertEquals(0, StringCalculator3.add(""));
    }
    @Test
	public final void givenStringOfNumbers_whenOneNumberIsUsed_ReturnsSameNumber() {
		Assert.assertEquals(5, StringCalculator3.add("5"));
	}

	@Test
	public final void givenStringOfNumbers_whenTwoNumbersAreUsed_ReturnSumOfTheirs() {
		Assert.assertEquals(3+6, StringCalculator3.add("3,6"));
	}
	@Test
	public final void givenStringOfNumbers_whenAnyNumberOfNumbersAreUsed_ReturnSumOfTheirs() {
		Assert.assertEquals(3+6+11+1+27, StringCalculator3.add("3,6,11,1,27"));
	}
	@Test
	public final void givenStringOfNumbers_whenNewLineIsUsedBetweenNumber_ReturnSumOfTheirs() {
		Assert.assertEquals(4+10+23, StringCalculator3.add("4,10\n23"));
	}


}
