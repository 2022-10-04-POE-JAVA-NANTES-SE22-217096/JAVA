package Tests;

import static org.junit.Assert.assertNotEquals;

import junit.framework.TestCase;

public class testCalculer extends TestCase {

	public void testAddition() {
		//SUCCESS
		assertEquals(9, Calculer.addition(5, 4));
		assertNotEquals(9, Calculer.addition(5, 8));
	}
	
	public void testAdditionV2() {	
		//FAIL
		//assertEquals(9, Calculer.addition(5, 8));
	}
	
}
