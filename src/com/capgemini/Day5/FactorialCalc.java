package com.capgemini.Day5;

public class FactorialCalc {

	public static long calculator(int i) throws InvalidInputException, FactorialException {
		if(i<2) {
			throw new InvalidInputException("Number not less than 2");
		}
		else {
		 long factorial=1;
			for(int j=1;j<=i;j++)
				factorial*=j;
			if(factorial>Integer.MAX_VALUE)
				throw new FactorialException("CANT HANDLE THIS!!");
			else
				return factorial;
		}
		
	}

}
