package com.monica.stringcalculator;

public class StringCalculator1 {

		
		public static int add(String numbers) {
			int sum = 0;
			String[] numbersArray = numbers.split(",");
			if (numbersArray.length > 2) {
				throw new RuntimeException("upto two numbers are allowed seperated by comma");
			}
			for (String num : numbersArray) {
				if (!num.trim().isEmpty()) { 
					//refactoring - adding the number to find sum if array is not empty
					sum += Integer.parseInt(num);
				}
			}
			return sum;
		}


}

