package br.com.vagner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum_when_sixDottwoisAddedbyTwo_ShouldReturnEightDotTow() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.sum(firstNumber, secondNumber);
		double expected = 8.2D;
		
		assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce" + expected + "!");
		//assertNotEquals(9.2, actual);
		//assertNotNull(actual);
		 
	}
	@Test
	void testSubtraction() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.subtraction(firstNumber, secondNumber);
		double expected = 4.2D;
		
		assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce" + expected + "!");
	}
	@Test
	void testMultiplication() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.multiplication(firstNumber, secondNumber);
		double expected = 12.4D;
		
		assertEquals(expected, actual, () -> firstNumber + "*" + secondNumber + " did not produce" + expected + "!");
	}
	@Test
	void testDivision() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.division(firstNumber, secondNumber);
		double expected = 3.1D;
		
		assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber + " did not produce" + expected + "!");
	}
	
	@Test
	void testDivision_when_FirstNUmberIsDividedBYZero_ShouldThrowArithmeticException() {
		fail();
		
	}
	
	@Test
	void testMean() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.mean(firstNumber, secondNumber);
		double expected = 4.1D;
		
		assertEquals(expected, actual, () -> "(" + firstNumber + "+" + secondNumber + ")/2" + " did not produce" + expected + "!");
	}
	
	@Test
	void testSquareRoot() {
		SimpleMath math = new SimpleMath();
		double Number = 81D;
		double expected = 9D;
		
		Double actual = math.squareRoot(Number);
	
		assertEquals(expected, actual, () -> "Aquare Root of " + Number + " did not produce" + expected + "!");
		//assertNotEquals(9.2, actual);
		//assertNotNull(actual);
		 
	}
}
