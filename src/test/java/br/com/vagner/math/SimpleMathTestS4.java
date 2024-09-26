package br.com.vagner.math;

import br.com.vagner.SimpleMath;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Teste Math Operations in Simplemath Class")
class SimpleMathTestS4 {

	SimpleMath math;

	@BeforeEach
	void beforEachMethod(){
		math = new SimpleMath();
	}
	@DisplayName("Teste double subtraction [double firstNumber, double secondNumber, double expected]")
	@ParameterizedTest
	//@MethodSource("testDivisionInputParameters")
	//@MethodSource()
	@CsvFileSource(resources = "/testDivision.csv")


	void testDivision(double firstNumber, double secondNumber, double expected) {

		System.out.println("Test " + firstNumber + " / " + secondNumber + " = " + expected + "!");
		Double actual = math.division(firstNumber, secondNumber);
		
		assertEquals(expected, actual, 2D, () -> firstNumber + "/" + secondNumber + " did not produce" + expected + "!");
	}
	//public static Stream<Arguments> testDivisionInputParameters(){
	/**
	public static Stream<Arguments> testDivision(){
		return Stream.of(
				Arguments.of(6.2D, 2D, 3.1D),
				Arguments.of(71D, 14D, 5.07D),
				Arguments.of(18.3D, 3.1D, 5.90D)
		);
	}
	 */

}