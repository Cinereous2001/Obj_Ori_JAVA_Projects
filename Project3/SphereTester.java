import static org.junit.Assert.*;

import org.junit.Test;

public class SphereTester {

	Sphere sp;
	
	/**
	 * Testing the workhorse constructor. Providing an individual test case
	 * per instance property.
	 */
	@Test
	public void test_Sphere() {
		sp = new Sphere(6.0, "Sphere3");
		double delta = 0.0001;
		assertEquals(sp.getRadius(), 6.0, delta);
		assertEquals("Sphere3", sp.getName());
	}
	
	/**
	 * Testing the toString method. The test cases for this method are as follows.
	 * 
	 * 1. Test if the expected string is equal to the returned string.
	 */
	@Test
	public void test_ToString() {
		sp = new Sphere(6.0, "Sphere3");
		assertEquals("Sphere [Name: Sphere3, Radius: 6.0]", sp.toString());
	}

	/**
	 * Testing the getVolume method. Testing to see if correct volume is calculated.
	 */
	@Test
	public void test_GetVolume() {
		
		sp = new Sphere(6.0, "Sphere3");
		double delta = 0.001;
		assertEquals(sp.getVolume(), 904.779, delta);
	}

}
