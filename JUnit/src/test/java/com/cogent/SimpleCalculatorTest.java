package com.cogent;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {
	
	/*
	 * Each test method should do the best to test full coverage of the class in test.
	 * You want to set each assert in it's own test method annotated with @test.
	 * That way you can find out which tests fail and why.
	 * It is also a good idea to name the test methods specifically such as twoPlusTwoShouldBeFour.
	*/
	
	SimpleCalculator sc = null;
	CalculatorService service = mock(CalculatorService.class); //This is a mock service that may be created elsewhere
	
	// @BeforeEach runs before each test is run
	@BeforeEach
	void setUpSimpleCalculator() {
		sc = new SimpleCalculator(service);
	}

	//2 plus 2 should equal 4 tested by assertEquals
	@Test
	void twoPlusTwoShouldBeFour() {
		assertEquals(4, sc.add(2, 2));
	}
	
	//different type of assert's below
	@Test
	void testAddIsNotEqual() {
		assertNotEquals(5, sc.add(2, 2));			
	}
	
	@Test
	void testAddIsTrue() {
		assertTrue(sc.add(2, 5) == 7);
	}
	
	@Test
	void testAddIsNotNull() {
		assertNotNull(sc.add(2, 2));
	}
	
	@Test
	void twoMultiplyByTwoPlusFirstNumEqualsSix() {
		when(service.multiply(2, 2)).thenReturn(4);
		assertEquals(6, sc.multiplyThenAddNum1(2, 2));
	}

}
