package br.com.vagner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste Math Operations in Simplemath Class")
class SimpleMathTest {

	@Test
	@DisplayName("Teste 6.2 + 2 = 8.2")
	void testSum_when_sixDottwoisAddedbyTwo_ShouldReturnEightDotTow() {
		// AAA Arrange, Act, Assert
		// Given / Arrange
		SimpleMath math = new SimpleMath();

		double firstNumber = 6.2D;
		double secondNumber = 2D;
		double expected = 8.2D;

		//When / Act
		Double actual = math.sum(firstNumber, secondNumber);

		//Then / Assert
		assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce" + expected + "!");

		 
	}
	@Test
	@DisplayName("Teste 6.2 - 2 = 4.2")
	void testSubtraction() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.subtraction(firstNumber, secondNumber);
		double expected = 4.2D;
		
		assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce" + expected + "!");
	}
	@Test
	@DisplayName("Teste 6.2 * 2 = 12.4")
	void testMultiplication() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.multiplication(firstNumber, secondNumber);
		double expected = 12.4D;
		
		assertEquals(expected, actual, () -> firstNumber + "*" + secondNumber + " did not produce" + expected + "!");
	}
	@Test
	@DisplayName("Teste 6.2 / 2 = 3.1")
	void testDivision() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.division(firstNumber, secondNumber);
		double expected = 3.1D;
		
		assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber + " did not produce" + expected + "!");
	}
	// test[System Under Test]_[Condition or State Change]_[Expected Result]
	@Disabled("Ainda não concluido")
	@Test
	@DisplayName("Teste Division By zero")
	void testDivision_when_FirstNUmberIsDividedBYZero_ShouldThrowArithmeticException() {
		fail();
		// Given / Arrange
		// When / Act
		// Then / Assert
		
	}
	
	@Test
	@DisplayName("Teste (6.2 + 2)  / 2 = 4.1")
	void testMean() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.mean(firstNumber, secondNumber);
		double expected = 4.1D;
		
		assertEquals(expected, actual, () -> "(" + firstNumber + "+" + secondNumber + ")/2" + " did not produce" + expected + "!");
	}
	
	@Test
	@DisplayName("Teste Square Root of 81 = 9")
	void testSquareRoot() {
		SimpleMath math = new SimpleMath();
		double Number = 81D;
		double expected = 9D;
		
		Double actual = math.squareRoot(Number);
	
		assertEquals(expected, actual, () -> "Aquare Root of " + Number + " did not produce" + expected + "!");
	}

}
