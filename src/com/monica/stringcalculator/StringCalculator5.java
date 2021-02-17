package com.monica.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator5 {
	
	public static int add(String numbers) {
		String delimiter = ",|\n";
		String num = numbers;
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("//") + 2;
			delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
			num = numbers.substring(numbers.indexOf("\n") + 1);	
		}
		return add(num, delimiter);
	}
	public static int add(String numbers,String delimiter) {
		int sum = 0;
		String[] numbersArray = numbers.split(delimiter);
		List<Integer> negativeNumbers = new ArrayList<>();
		for (String num : numbersArray) {
			if (!num.trim().isEmpty()) { 
				int numberInt = Integer.parseInt(num.trim());
				if (numberInt < 0) {
					negativeNumbers.add(numberInt);
				}
				sum += numberInt;

			}
		}
		if (negativeNumbers.size() > 0) {
			throw new RuntimeException("Negatives are not allowed: " + negativeNumbers.toString());
		}
		return sum;
	}
	


}
