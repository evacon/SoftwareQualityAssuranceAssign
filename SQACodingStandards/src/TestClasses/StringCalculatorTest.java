package TestClasses;

import static org.junit.Assert.*;

import org.junit.Test;

import ToBeTested.StringCalculator;


public class StringCalculatorTest {

	@Test(expected = Exception.class)
	public void testAddNegative() {
		
		StringCalculator calc = new StringCalculator();
	
		
		calc.add("-1"); //this will pass because exception is thrown
		
	}
	
	@Test
	public void addString()
	{
		StringCalculator calc = new StringCalculator();
		
		calc.add("1");
		calc.add("1");
	}
	
	@Test
	public void addString1()
	{
		StringCalculator calc = new StringCalculator();
		
		calc.add("s");
		calc.add("s");
		//This test will fail
	}

}
