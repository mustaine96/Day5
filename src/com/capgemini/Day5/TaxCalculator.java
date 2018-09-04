package com.capgemini.Day5;

public class TaxCalculator {
	
	public double calculateTax(String empName, boolean isIndian, double empSal )throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException  {
		
		if(isIndian==false)
			throw new CountryNotValidException("The Employee should vbe Indian to calculate tax");
			else if(empName==null || empName=="")
				throw new EmployeeNameInvalidException("The employee name cannot be empty");
			else if(empSal<10000)
				throw new TaxNotEligibleException("The employee does notnneed to pay tax");
			else
			{
				double taxAmount=0;
				if(empSal>100000) {
					taxAmount=empSal*8/100;
				}
				else if(empSal>50000)
					taxAmount=empSal*6/100;
				else if(empSal>30000)
					taxAmount=empSal*5/100;
				else
					taxAmount=empSal*4/100;
				return taxAmount;
			}
		
	}

}
