package com.monica.stringcalculator;

 
public class StringCalculator {
	
	public static int add(String numbers) {
		
		//store the numbers in a array from the string separated using the comma
		
        String[] numbersArray = numbers.split(",");
        
        //throw exception if more than two numbers are provided for  addition 
        if (numbersArray.length > 2) {
            throw new RuntimeException("upto two numbers are allowed seperated by comma");
        } else {
			for (String num : numbersArray) {
				
		//check if string is empty or not 
				if (!num.isEmpty()) {
					Integer.parseInt(num);
				}
			}
		}
        //return zero if the string is empty
		return 0; 
	}
	



}
