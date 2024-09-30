package br.com.vagner.mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

class HamcrestMatchersTest {

	@Test
	void testHamcrestMatchersTest() {
		//Given
		List<Integer> scores = Arrays.asList(99,100,101,105);
		
		//When && Then
		assertThat(scores, hasSize(4));
		assertThat(scores, hasItems(100,101));
		assertThat(scores, everyItem(greaterThan(98)));
		assertThat(scores, everyItem(lessThan(106)));
		
		// Check String
		assertThat("", is(emptyString()));
		assertThat(null, is(emptyOrNullString()));
		
		//Arrays
		Integer[] myArray = {1,2,3};
		assertThat(myArray, arrayWithSize(3));
		assertThat(myArray, arrayContaining(1, 2, 3));
		assertThat(myArray, arrayContainingInAnyOrder(2, 3, 1));
	}

}
