package com.capgemini.Day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.Day5.CountryNotValidException;
import com.capgemini.Day5.EmployeeNameInvalidException;
import com.capgemini.Day5.TaxCalculator;
import com.capgemini.Day5.TaxNotEligibleException;

class TaxCalculatorTest {

	TaxCalculator test1;
	@BeforeEach
		void setup() {
			test1=new TaxCalculator();
		}
	
	@Test
	void testInvalidCountryInput() {
	assertThrows(CountryNotValidException.class, ()->test1.calculateTax("Vipul",false,100000))	;
	}
	@Test 
	void testInvalidNameInput(){
		assertThrows(EmployeeNameInvalidException.class,()->test1.calculateTax(null,true,100000));
	}
	@Test
	void testInvalidSalary() {
		assertThrows(TaxNotEligibleException.class,()->test1.calculateTax("Vipul", true, 9000));
	}
	@Test
	void testWorkingCases() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		assertEquals(400,test1.calculateTax("Vipul", true, 10000));
	}

}
