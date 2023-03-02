package com.cogent;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {
	
	/*
	 * Each test method should do the best to test full coverage of the class in test.
	 * You want to set each assert in it's own test method annotated with @test.
	 * That way you can find out which tests fail and why.
	 * It is also a good idea to name the test methods specifically such as twoPlusTwoShouldBeFour.
	*/

	//2 plus 2 should equal 4 tested by assertEquals
	@Test
	void twoPlusTwoShouldBeFour() {
		SimpleCalculator sc = new SimpleCalculator();
		assertEquals(4, sc.add(2, 2));
	}
	
	//different type of assert's below
	
	@Test
	void testAddIsNotEqual() {
		SimpleCalculator sc = new SimpleCalculator();
		assertNotEquals(5, sc.add(2, 2));			

	}
	
	@Test
	void testAddIsTrue() {
		SimpleCalculator sc = new SimpleCalculator();
		assertTrue(sc.add(2, 5) == 7);

	}
	
	@Test
	void testAddIsNotNull() {
		SimpleCalculator sc = new SimpleCalculator();
		assertNotNull(sc.add(2, 2));
	}

}
