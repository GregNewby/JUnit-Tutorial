package com.cogent;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	//2 plus 2 should equal 4
	@Test
	void testAdd() {
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
