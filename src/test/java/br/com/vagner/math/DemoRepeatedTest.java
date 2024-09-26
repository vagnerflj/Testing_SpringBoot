package br.com.vagner.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import br.com.vagner.SimpleMath;

class DemoRepeatedTest {

	SimpleMath math;
	@BeforeEach
	void beforEachMethod(){
		math = new SimpleMath();
		System.out.println("Running @BeforeEach method!");
	}
	@RepeatedTest(value = 3, name = "{displayName}. Repetition"
	+ "{currentRepetition} of {totalRepetitions}")
	@DisplayName("Teste Division By zero")
	void testDivision_when_FirstNUmberIsDividedBYZero_ShouldThrowArithmeticException(
			RepetitionInfo repetitionInfo,
			TestInfo testInfo
			) {
		System.out.println("Repetition N " + repetitionInfo.getCurrentRepetition() + 
				" of" + repetitionInfo.getTotalRepetitions());
		System.out.println("Running " + testInfo.getTestMethod().get().getName());
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

}
