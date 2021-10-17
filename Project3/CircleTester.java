import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class CircleTester {
	Circle c;
	/**
	 * 
	 */
	@Test
	public void test_GetName() {
		fail("Not yet implemented");
	}

	/**
	 * Testing the workhorse constructor. Providing an individual test case
	 * per instance property.
	 */
	@Test
	public void test_Circle() {
		c = new Circle(5.0, "Circle1");
		double delta = 0.0001;
		assertEquals(c.getRadius(), 5.0, delta);
		assertEquals(c.getName(), "Circle1");
	}

	/**
	 * Testing the getArea method. Testing to see if correct area is calculated.
	 */
	@Test
	public void test_GetArea() {
		c = new Circle(5.0, "Circle1");
		double delta = 0.00001;
		assertEquals(c.getArea(), 78.53982, delta);
	}

	/**
	 * Testing the equals method. The test cases for this method are as follows.
	 * 
	 * 1. Test if two circles are equal after creating a new circle with same and different information
	 * 2. Test if two circles are equal when they refer to the same object
	 * 3. Test if a square is equal to a scanner.
	 */
	@Test
	public void test_EqualsObject() {
		c = new Circle(5.0, "Circle1");
		Circle c1 = new Circle(5.5, "Circle2");
		Circle c2 = new Circle(5.0, "Circle1");
		Circle c3 = c;
		Scanner in = new Scanner(System.in);
		
		assertTrue(c2.equals(c));
		assertTrue(c2.equals(c3));
		assertFalse(c2.equals(in));
		assertFalse(c2.equals(c1));
	}
	
	/**
	 * Testing the toString method. The test cases for this method are as follows.
	 * 
	 * 1. Test if the expected string is equal to the returned string.
	 */
	@Test
	public void test_ToString() {
		c = new Circle(5.0, "Circle1");
		assertEquals("Circle [Name: Circle1, Radius: 5.0]", c.toString());
	}

	/**
	 * Testing the getRadius method. Checking whether it can retrieve desired value or not
	 */
	@Test
	public void test_GetRadius() {
		c = new Circle(5.0, "Circle1");
		double delta = 0.0001;
		assertEquals(5.0, c.getRadius(), delta);
	}

	/**
	 * Testing the setRadius method. Checking whether it can retrieve desired value or not after setting a new value
	 */
	@Test
	public void test_SetRadius() {
		c = new Circle(5.0, "Circle1");
		double delta = 0.0001;
		c.setRadius(5.5);
		assertEquals(5.5, c.getRadius(), delta);
	}

}
