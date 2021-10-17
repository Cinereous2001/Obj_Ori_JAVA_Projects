import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTester {	
	
	Cube c;
	
	/**
	 * Testing the workhorse constructor. Providing an individual test case
	 * per instance property.
	 */
	@Test
	public void test_Cube() {
		c = new Cube(3.0, "Cube1");
		double delta = 0.0001;
		assertEquals(3.0, c.getLength(), delta);
		assertEquals(c.getName(), "Cube1");
	}

	/**
	 * Testing the toString method. The test cases for this method are as follows.
	 * 
	 * 1. Test if the expected string is equal to the returned string.
	 */
	@Test
	public void test_ToString() {
		c = new Cube(3.0, "Cube1");
		assertEquals("Cube [Name: Cube1, Length: 3.0]", c.toString());
	}


	/**
	 * Testing the getVolume method. Testing to see if correct volume is calculated.
	 */
	@Test
	public void test_GetVolume() {
		c = new Cube(3.0, "Cube1");
		double delta = 0.0001;
		assertEquals(27.0, c.getVolume(), delta);
	}

}
