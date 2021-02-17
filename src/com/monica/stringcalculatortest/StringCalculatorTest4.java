package com.monica.stringcalculatortest;

import org.junit.Assert;
import org.junit.Test;

import com.monica.stringcalculator.StringCalculator4;

public class StringCalculatorTest4 {
	@Test
    public final void givenStringOfNumbers_when2Numbers_NoExceptionIsThrown() {
        StringCalculator4.add("6,1");
        Assert.assertTrue(true);
    }
    @Test
    public final void givenString_whenEmpty_ReturnValueIs0() {
        Assert.assertEquals(0, StringCalculator4.add(""));
    }
    @Test
	public final void givenStringOfNumbers_whenOneNumberIsUsed_ReturnsSameNumber() {
		Assert.assertEquals(5, StringCalculator4.add("5"));
	}

	@Test
	public final void givenStringOfNumbers_whenTwoNumbersAreUsed_ReturnSumOfTheirs() {
		Assert.assertEquals(3+6, StringCalculator4.add("3,6"));
	}
	@Test
	public final void givenStringOfNumbers_whenAnyNumberOfNumbersAreUsed_ReturnSumOfTheirs() {
		Assert.assertEquals(3+6+11+1+27, StringCalculator4.add("3,6,11,1,27"));
	}
	@Test
	public final void givenStringOfNumbers_whenNewLineIsUsedBetweenNumber_ReturnSumOfTheirs() {
		Assert.assertEquals(4+10+23, StringCalculator4.add("4,10\n23"));
	}
	@Test
	public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
		Assert.assertEquals(4+76+19, StringCalculator4.add("//;\n4;76;19"));
	}




}
