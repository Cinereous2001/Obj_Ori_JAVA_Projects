import static org.junit.Assert.*;

import org.junit.Test;

public class GlomeTester {

	Glome gl;
	
	/**
	 * Testing the workhorse constructor. Providing an individual test case
	 * per instance property.
	 */
	@Test
	public void test_Glome() {
		gl = new Glome(6.0, "Glome4");
		double delta = 0.00001;
		assertEquals(gl.getRadius(), 6.0, delta);
		assertEquals("Glome4", gl.getName());
	}
	
	/**
	 * Testing the toString method. The test cases for this method are as follows.
	 * 
	 * 1. Test if the expected string is equal to the returned string.
	 */
	@Test
	public void test_ToString() {
		gl = new Glome(6.0, "Glome4");
		assertEquals("Glome [Name: Glome4, Radius: 6.0]", gl.toString());
	}

	/**
	 * Testing the getVolume method. Testing to see if correct volume is calculated.
	 */
	@Test
	public void test_GetVolume() {
		gl = new Glome(6.0, "Glome4");
		double delta = 0.00001;
		assertEquals(gl.getVolume(), 6395.50365, delta);
	}



}
