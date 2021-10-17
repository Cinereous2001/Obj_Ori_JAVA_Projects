import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class CylinderTester {

	Cylinder cy;

	/**
	 * Testing the workhorse constructor. Providing an individual test case
	 * per instance property.
	 */
	@Test
	public void test_Cylinder() {
		cy = new Cylinder(5.0, 6.0, "Cylinder2");
		double delta = 0.0001;
		assertEquals(5.0, cy.getHeight(), delta);
		assertEquals(6.0, cy.getRadius(), delta);
		assertEquals("Cylinder2", cy.getName());
	}
	
	/**
	 * Testing the equals method. The test cases for this method are as follows.
	 * 
	 * 1. Test if two cylinders are equal after creating a new square with same and different information
	 * 2. Test if two cylinders are equal when they refer to the same object
	 * 3. Test if a cylinder is equal to a scanner.
	 */
	@Test
	public void test_EqualsObject() {
		cy = new Cylinder(5.0, 6.0, "Cylinder3");
		Cylinder cy1 = new Cylinder(5.5, 6.0, "Cylinder3");
		Cylinder cy2 = new Cylinder(5.0, 6.0, "Cylinder3");
		Cylinder cy3 = cy;
		Scanner in = new Scanner(System.in);

		assertTrue(cy2.equals(cy));
		assertTrue(cy2.equals(cy3));
		assertFalse(cy2.equals(in));
		assertFalse(cy2.equals(cy1));

	}

	/**
	 * Testing the toString method. The test cases for this method are as follows.
	 * 
	 * 1. Test if the expected string is equal to the returned string.
	 */
	@Test
	public void test_ToString() {
		cy = new Cylinder(5.0, 6.0, "Cylinder2");
		assertEquals("Cylinder [Name: Cylinder2, Height: 5.0, Radius: 6.0]", cy.toString());
	}


	/**
	 * Testing the getVolume method. Testing to see if correct volume is calculated.
	 */
	@Test
	public void testGetVolume() {
		cy = new Cylinder(5.0, 6.0, "Cylinder1");
		double delta = 0.001;
		assertEquals(cy.getVolume(), 565.487, delta);

	}

	/**
	 * Testing the getHeight method. Checking whether it can retrieve desired value or not
	 */
	@Test
	public void test_GetHeight() {
		cy = new Cylinder(5.0, 6.0, "Cylinder1");
		double delta = 0.0001;
		assertEquals(5.0, cy.getHeight(), delta);
	}

	/**
	 * Testing the setHeight method. Checking whether it can retrieve desired value or not after setting a new value
	 */
	@Test
	public void test_SetHeight() {
		cy = new Cylinder(5.0, 6.0, "Cylinder1");
		double delta = 0.0001;
		cy.setHeight(5.5);
		assertEquals(5.5, cy.getHeight(), delta);
	}

}
