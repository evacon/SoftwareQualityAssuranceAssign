package TestClasses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import ToBeTested.Books;

public class BooksTest {
	int []maxArray = new int[10];
	int []minArray = new int[0];
	
	@Test
	public void checkMaxNumber(){
		Books numbers = new Books();
		assertEquals(10, numbers.numBooks(maxArray));
		
	}
	
	@Test
	public void checkMinNumber(){
		Books numbers = new Books();
		assertEquals(minArray.length, numbers.numBooks(maxArray));
		
	}
	

}
