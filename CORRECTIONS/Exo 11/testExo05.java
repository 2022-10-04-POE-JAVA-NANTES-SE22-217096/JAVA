package Tests;

import static org.junit.Assert.assertNotEquals;

import junit.framework.TestCase;

public class testExo05 extends TestCase {
	
	public void testWhatsNumber() {
		
		//SUCCESS
		assertEquals("Le nombre est zéro (et il est pair)", Exo05.whatsNumber(0));
		assertEquals("Le nombre est positif et impair", Exo05.whatsNumber(5));
		
		assertEquals("Le nombre est négatif et pair", Exo05.whatsNumber(-8));
		
		//FAIL
		assertNotEquals("Le nombre est positif et pair", Exo05.whatsNumber(5));
	}

}