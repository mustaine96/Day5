package com.capgemini.Day5;

public class MyCalculator {

	public static long power(int n, int p)throws Exception {
		
		if(n==0 && p==0)
			throw new ZeroInputException("Both parameters cannot be 0");
		if(n<0 || p<0)
			throw new Exception("n and p should not be -ve");
		else
			return (long) Math.pow(n,p);
		
		
		//return null;
	}

}

//
//@FunctionInterface
//public interface Executable{
//	public void execute();
//}
//Annonymous Inner class;
//Executable e=new Executable() {
//	@override
//	public void execute() {
//		MyCalculator.power(0, 0);
//	}
//}
//Lambda Expression
//() -> c1.power(0, 0)