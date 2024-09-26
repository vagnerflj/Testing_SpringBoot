package br.com.vagner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		Double actual = math.sum(6.2D, 2D);
		double expected = 8.2D;
		assertEquals(expected, actual);
		 
	}

}
