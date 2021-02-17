package com.monica.stringcalculator;

public class StringCalculator2 {
	
	public static int add(String numbers) {
		int sum = 0;
		String[] numbersArray = numbers.split(",");
		//Refactoring- removing the exception to find sum of one or any amount of numbers 
		
		//if (numbersArray.length > 2) {
		//	throw new RuntimeException("upto two numbers are allowed separated by comma");
		//}
		for (String num : numbersArray) {
			if (!num.trim().isEmpty()) { 
				//refactoring - adding the number to find sum if array is not empty
				sum += Integer.parseInt(num);
			}
		}
		return sum;
	}
}
