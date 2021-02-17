package com.monica.stringcalculator;

public class StringCalculator3 {
	
	public static int add(String numbers) {
	int sum = 0;
	//refactoring - to handle new line between numbers to be added 
	String[] numbersArray = numbers.split(",|\n");
	for (String num : numbersArray) {
		if (!num.trim().isEmpty()) {
			sum += Integer.parseInt(num);
		}
	}
	return sum;
}

}
