package com.monica.stringcalculator;

public class StringCalculator4 {
	
	//refactoring to handle string "//[delimiter]\n[numbers…]"
	//finds the final string to add and extracting the new delimiter
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
	
		for (String num : numbersArray) {
			if (!num.trim().isEmpty()) { 
				//refactoring - adding the number to find sum if array is not empty
				sum += Integer.parseInt(num);
			}
		}
		return sum;
	}
	

}
