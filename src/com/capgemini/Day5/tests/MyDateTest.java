package com.capgemini.Day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Day5.InvalidDayException;
import com.capgemini.Day5.InvalidMonthException;
import com.capgemini.Day5.MyDate;

class MyDateTest {

	@Test
	void testValidCases() {
		try {
			MyDate d1= new MyDate(29,2,1996) ;
			MyDate d2= new MyDate(12,12,1996) ;
			MyDate d3= new MyDate(31,3,1996) ;
		}
		catch(Exception e)
		{
			fail("Exception occured") ;
		}
	}
	
	void testInvalidCases() {
		assertThrows(InvalidMonthException.class,()->new MyDate(12,13,1996));
		assertThrows(InvalidDayException.class,()->new MyDate(31,11,1996));
		assertThrows(InvalidDayException.class,()->new MyDate(29,2,1997));
		assertThrows(InvalidDayException.class,()->new MyDate(32,12,1996));
		
	}

}
