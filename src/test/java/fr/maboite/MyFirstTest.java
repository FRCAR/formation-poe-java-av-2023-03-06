package fr.maboite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MyFirstTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("before all");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("before each");
	}

	@Test
	public void testSuccess() {
		int expectedValue = 4;
		int computedValue = 2 + 2;
		assertEquals(expectedValue, computedValue);
	}

	@Test
	@Disabled
	public void testFailure() {
		assertEquals(3, 2);
	}

}
