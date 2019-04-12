package TestClasses;


import static org.junit.Assert.*;

import org.junit.Test;

import ToBeTested.Calculator;


public class CalculatorTest {

	@Test
	public void testAdd() {
		
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.add(9,3);
		assertEquals(expected, actual);
	}

	@Test
	public void testSub() {
		
		Calculator calc = new Calculator();
		int expected = 8;
		int actual = calc.sub(10,2);
		assertEquals(expected, actual);
		
	}

	@Test
	public void testMult() {
		
		Calculator calc = new Calculator();
		int expected = 20;
		int actual = calc.mult(10,2);
		assertEquals(expected, actual);
	}

	@Test
	public void testDiv() {
		
		Calculator calc = new Calculator();
		int expected = 5;
		int actual = calc.div(10,2);
		assertEquals(expected, actual);
		
	}

}
