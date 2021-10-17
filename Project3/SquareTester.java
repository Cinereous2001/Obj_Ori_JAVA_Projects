import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class SquareTester {

	Square s;
	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	/**
	 * Testing the workhorse constructor. Providing an individual test case
	 * per instance property.
	 */
	@Test
	public void test_Square() {
		s = new Square(4.0, "Square2");
		double delta = 0.0001;
		assertEquals(s.getLength(), 4.0, delta);
		assertEquals(s.getName(), "Square2");
	}

	/**
	 * Testing the getArea method. Testing to see if correct area is calculated.
	 */
	@Test
	public void test_GetArea() {
		
		s = new Square(4.0, "Square2");
		double delta = 0.00001;
		assertEquals(s.getArea(), 16.0, delta);
		
	}

	/**
	 * Testing the equals method. The test cases for this method are as follows.
	 * 
	 * 1. Test if two squares are equal after creating a new square with same and different information
	 * 2. Test if two squares are equal when they refer to the same object
	 * 3. Test if a square is equal to a scanner.
	 */
	@Test
	public void test_EqualsObject() {
		s = new Square(5.0, "Square1");
		Square s1 = new Square(5.5, "Square1");
		Square s2 = new Square(5.0, "Square1");
		Square s3 = s;
		Scanner in = new Scanner(System.in);
		
		assertTrue(s2.equals(s));
		assertTrue(s2.equals(s3));
		assertFalse(s2.equals(in));
		assertFalse(s2.equals(s1));
	}

	/**
	 * Testing the toString method. The test cases for this method are as follows.
	 * 
	 * 1. Test if the expected string is equal to the returned string.
	 */
	@Test
	public void test_ToString() {
		s = new Square(5.0, "Square1");
		assertEquals("Square [Name: Square1, Length: 5.0]", s.toString());
	}

	/**
	 * Testing the getLength method. Checking whether it can retrieve desired value or not
	 */
	@Test
	public void test_GetLength() {
		s = new Square(5.0, "Square1");
		double delta = 0.0001;
		assertEquals(s.getLength(), 5.0, delta);
	}
	
	/**
	 * Testing the setLength method. Checking whether it can retrieve desired value or not after setting s different value
	 */
	@Test
	public void test_SetLength() {
		s = new Square(5.0, "Square1");
		double delta = 0.0001;
		s.setLength(5.5);
		assertEquals(s.getLength(), 5.5, delta);
	}

}
