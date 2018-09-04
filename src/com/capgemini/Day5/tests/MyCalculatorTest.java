package com.capgemini.Day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.Day5.MyCalculator;
import com.capgemini.Day5.NegativeIntegerException;
import com.capgemini.Day5.ZeroInputException;

class MyCalculatorTest {

//	MyCalculator c1;
//	@BeforeEach
//	void setup() {
//		c1=new MyCalculator();
//		
//	}
	
//	@Test
//	void testPower() throws NegativeIntegerException, ZeroInputException  {
//		assertEquals(243,c1.power(3, 5));
//		//assertEquals(16,c1.power(2, 4));
//		assertThrows(ZeroInputException.class, () -> c1.power(0, 0));
//		assertThrows(NegativeIntegerException.class, () -> c1.power(-1,3));
//		
//	}

	@Test
	void testPowerWithValidInputs() throws Exception {
		assertEquals(243,MyCalculator.power(3,5));
		
	}
	@Test
	void testPowerWithZeroInputs() {
		Exception e;
		e=assertThrows(Exception.class,()->MyCalculator.power(0, 0));
		assertEquals("Both parameters cannot be 0",e.getMessage());
		
	}
	@Test
	void testPowerWithNegativeException() {
		Exception e;
		e=assertThrows(Exception.class,()->MyCalculator.power(-1,-2));
		assertEquals("n and p should not be -ve",e.getMessage());
	}
}
