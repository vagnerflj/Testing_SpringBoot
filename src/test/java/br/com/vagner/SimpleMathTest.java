package br.com.vagner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Teste Math Operations in Simplemath Class")
class SimpleMathTest {

	SimpleMath math;

	@BeforeAll
	static void setup(){
		System.out.println("Running @BeforeAll method!");
	}
	@AfterAll
	static void cleanup(){
		System.out.println("Running @AfterAll method!");
	}
	@BeforeEach
	void beforEachMethod(){
		math = new SimpleMath();
		System.out.println("Running @BeforeEach method!");
	}
	@AfterEach
	void afterEachMethod(){
		System.out.println("Running @AfterEach method!");
	}

	@Test
	@DisplayName("Teste 6.2 + 2 = 8.2")
	void testSum_when_sixDottwoisAddedbyTwo_ShouldReturnEightDotTow() {
		// AAA Arrange, Act, Assert
		// Given / Arrange
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

		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.subtraction(firstNumber, secondNumber);
		double expected = 4.2D;
		
		assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce" + expected + "!");
	}
	@Test
	@DisplayName("Teste 6.2 * 2 = 12.4")
	void testMultiplication() {

		double firstNumber = 6.2D;
		double secondNumber = 2D;

		Double actual = math.multiplication(firstNumber, secondNumber);
		double expected = 12.4D;
		
		assertEquals(expected, actual, () -> firstNumber + "*" + secondNumber + " did not produce" + expected + "!");
	}
	@Test
	@DisplayName("Teste 6.2 / 2 = 3.1")
	void testDivision() {

		double firstNumber = 6.2D;
		double secondNumber = 2D;

		Double actual = math.division(firstNumber, secondNumber);
		double expected = 3.1D;
		
		assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber + " did not produce" + expected + "!");
	}
	// test[System Under Test]_[Condition or State Change]_[Expected Result]
	//@Disabled("Ainda não concluido")
	@Test
	@DisplayName("Teste Division By zero")
	void testDivision_when_FirstNUmberIsDividedBYZero_ShouldThrowArithmeticException() {
		//Given
		double firstNumber = 6.2D;
		double secondNumber = 0D;

		var expectedMessage = "Impossible to divide by zero!";

		ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
			//When && Then
			math.division(firstNumber, secondNumber);
		}, () -> "Division by zero should throw an ArithmeticException");

		assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");

	}
	
	@Test
	@DisplayName("Teste (6.2 + 2)  / 2 = 4.1")
	void testMean() {

		double firstNumber = 6.2D;
		double secondNumber = 2D;

		Double actual = math.mean(firstNumber, secondNumber);
		double expected = 4.1D;
		
		assertEquals(expected, actual, () -> "(" + firstNumber + "+" + secondNumber + ")/2" + " did not produce" + expected + "!");
	}
	
	@Test
	@DisplayName("Teste Square Root of 81 = 9")
	void testSquareRoot() {

		double Number = 81D;
		double expected = 9D;
		
		Double actual = math.squareRoot(Number);
	
		assertEquals(expected, actual, () -> "Aquare Root of " + Number + " did not produce" + expected + "!");
	}

}