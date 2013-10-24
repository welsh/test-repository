package org.welsh.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTwoTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTwoTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTwoTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testAppTwo() {
		assertTrue(false);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testAppThree() {
		assertTrue(true);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testAppFour() {
		assertTrue(false);
	}
}
