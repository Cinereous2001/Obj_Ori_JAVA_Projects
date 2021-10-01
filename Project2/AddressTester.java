import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class AddressTester {

	Address a;
	/**
	 * Testing the default constructor. Providing an individual test case
	 * per instance property.
	 */
	@Test
	public void test_DefaultConstructor() {

		a = new Address();

		assertEquals(0, a.getStreetNumber());
		assertEquals("", a.getStreetName());
		assertEquals("", a.getCity());
		assertEquals("OH", a.getState());
		assertEquals("", a.getZipCode());
	}
	
	/**
	 * Testing the workhorse constructor. Providing an individual test case
	 * per instance property.
	 */
	@Test
	public void test_WorkhorseConstructor() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		assertEquals(2000, a.getStreetNumber());
		assertEquals("Main Street", a.getStreetName());
		assertEquals("Santa Monica", a.getCity());
		assertEquals("FL", a.getState());
		assertEquals("30309", a.getZipCode());

	}

	/**
	 * Testing the copy constructor. Providing an individual test case
	 * per instance property.
	 */
	@Test
	public void test_CopyConstructor() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");
		Address a2 = new Address(a);

		assertEquals(2000, a2.getStreetNumber());
		assertEquals("Main Street", a2.getStreetName());
		assertEquals("Santa Monica", a2.getCity());
		assertEquals("FL", a2.getState());
		assertEquals("30309", a2.getZipCode());

	}

	/**
	 * Testing the equals method. The test cases for this method are as follows.
	 * 
	 * 1. Test if two accounts are equal after cloning one.
	 * 2. Test if two accounts are equal after creating a new account with different information.
	 * 3. Test if a student is equal to a scanner.
	 */
	@Test
	public void test_Equals() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");
		Address a2 = new Address(a);
		Address a3 = new Address(2001, "Main Street", "Santa Monica", "FL", "30309");
		Scanner in = new Scanner(System.in);

		assertTrue(a.equals(a2));
		assertFalse(a.equals(a3));
		assertFalse(a.equals(in));
	}

	/**
	 * Testing the toString method. The test cases for this method are as follows.
	 * 
	 * 1. Test if the expected string is equal to the returned string.
	 */
	@Test
	public void test_ToString() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		assertEquals("2000 Main Street, Santa Monica, FL, 30309", a.toString());
	}
	
	/**
	 * Testing the getStreetNumber method. The test cases for this method are as follows.
	 * 
	 * 1. Checks whether it retrieves the valid street number
	 * 2. Check whether it retrieves the valid street number after using set method
	 */
	@Test
	public void test_GetStreetNumber() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		assertEquals(2000, a.getStreetNumber());
		a.setStreetNumber(5);
		assertEquals(5, a.getStreetNumber());
	}

	/**
	 * Testing the setStreetNumber method. The test cases for this method are as follows.
	 * 
	 * 1. Set the street number to a negative value.
	 * 2. Set the street number to 0
	 * 3. Set the streetNumber to 5
	 *  
	 * @throws IllegalArgumentException If street number is less than 1
	 */
	@Test
	public void test_SetStreetNumber() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		try {
			a.setStreetNumber(-1);
			fail("IllegalArgumentException was supposed to occur");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			a.setStreetNumber(0);
			fail("IllegalArgumentException was supposed to occur");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		a.setStreetNumber(5);
		assertEquals(5, a.getStreetNumber());

	}

	/**
	 * Testing the getStreetName method. The test cases for this method are as follows.
	 * 
	 * 1. Checks whether it retrieves the valid street name
	 * 2. Check whether it retrieves the valid street name after using set method
	 */
	@Test
	public void test_GetStreetName() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		assertEquals("Main Street", a.getStreetName());
		a.setStreetName("Method Street");
		assertEquals("Method Street", a.getStreetName());
	}

	/**
	 * Testing the setStreetName method. The test cases for this method are as follows.
	 * 
	 * 1. Set the street name to a different value
	 *  
	 */
	@Test
	public void testSetStreetName() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		a.setStreetName("Method Street");
		assertEquals("Method Street", a.getStreetName());
	}

	/**
	 * Testing the getCity method. The test cases for this method are as follows.
	 * 
	 * 1. Checks whether it retrieves the valid street number
	 * 2. Check whether it retrieves the valid street number after using set method
	 */
	@Test
	public void test_GetCity() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		assertEquals("Santa Monica", a.getCity());
		a.setCity("Miami");
		assertEquals("Miami", a.getCity());
	}

	/**
	 * Testing the setCity method. The test cases for this method are as follows.
	 * 
	 * 1. Set the city to a different value.
	 */
	@Test
	public void test_SetCity() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		a.setCity("Miami");
		assertEquals("Miami", a.getCity());
	}

	/**
	 * Testing the getState method. The test cases for this method are as follows.
	 * 
	 * 1. Checks whether it retrieves the valid state
	 * 2. Check whether it retrieves the valid state after using set method
	 */
	@Test
	public void test_GetState() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		assertEquals("FL", a.getState());
		a.setState("OH");
		assertEquals("OH", a.getState());
	}

	/**
	 * Testing the setState method. The test cases for this method are as follows.
	 * 
	 * 1. Set the state to a valid value
	 * 2. Set the state to an invalid value with three letters
	 * 3. Set the state to an invalid value with one letter
	 * 
	 * @throws IllegalArgumentException if state is not a two letter abbreviation 
	 */
	@Test
	public void test_SetState() {

		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		a.setState("OH");
		assertEquals("OH", a.getState());
		try {
			a.setState("OHL");
			fail("IllegalArgumentException was supposed to occur");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			a.setState("O");
			fail("IllegalArgumentException was supposed to occur");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Testing the getZipCode method. The test cases for this method are as follows.
	 * 
	 * 1. Checks whether it retrieves the valid ZIP code
	 * 2. Check whether it retrieves the valid ZIP codee after using set method
	 */
	@Test
	public void test_GetZipCode() {
		
		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		assertEquals("30309" , a.getZipCode());
		a.setZipCode("45056");
		assertEquals("45056", a.getZipCode());
	}

	/**
	 * Testing the setZipCode method. The test cases for this method are as follows.
	 * 
	 * 1. Set the zip code to a valid value
	 * 2. Set the zip code to an invalid value with four digits
	 * 3. Set the zip code to an invalid value with six digits
	 * 4. Set the zip code to an invalid value with letters
	 * 
	 * @throws IllegalArgumentException if state is not a two letter abbreviation 
	 */
	@Test
	public void test_SetZipCode() {
		
		a = new Address(2000, "Main Street", "Santa Monica", "FL", "30309");

		a.setZipCode("45056");
		assertEquals("45056", a.getZipCode());
		try {
			a.setZipCode("4505");
			fail("IllegalArgumentException was supposed to occur");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			a.setZipCode("450567");
			fail("IllegalArgumentException was supposed to occur");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		try {
			a.setZipCode("4505H");
			fail("IllegalArgumentException was supposed to occur");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
