package com.capgemini.Day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day5.FactorialCalc;
import com.capgemini.Day5.FactorialException;
import com.capgemini.Day5.InvalidInputException;

class FactorialCalcTest {

	@Test
	void testLessThantwoInput() {
		assertThrows(InvalidInputException.class,()->FactorialCalc.calculator(0));
		assertThrows(InvalidInputException.class,()->FactorialCalc.calculator(-1));
		assertThrows(InvalidInputException.class,()->FactorialCalc.calculator(1));

	}
	@Test
	void testOutOfBounds() {
		assertThrows(FactorialException.class,()->FactorialCalc.calculator(2147483));
	}
	@Test
	void testWorkingCases() throws InvalidInputException, FactorialException {
		assertEquals(6,FactorialCalc.calculator(3));
		assertEquals(24,FactorialCalc.calculator(4));
	}

}
