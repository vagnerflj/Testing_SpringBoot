package br.com.vagner.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SpyTest {

	@Test
	void testV1() {
		// Given
		List<String> mockArrayList = mock(ArrayList.class);
		
		// When / Then
		assertEquals(0,mockArrayList.size());
		
		when(mockArrayList.size()).thenReturn(5);
		mockArrayList.add("Foo-Bar");
		
		assertEquals(5,mockArrayList.size());
	}
	@Test
	void testV2() {
		// Given
		List<String> spyArrayList = spy(ArrayList.class);
		
		// When / Then
		assertEquals(0,spyArrayList.size());
		
		
		spyArrayList.add("Foo-Bar");
		assertEquals(1,spyArrayList.size());
		
		spyArrayList.remove("Foo-Bar");
		assertEquals(0,spyArrayList.size());
	}
	@Test
	void testV3() {
		// Given
		List<String> spyArrayList = spy(ArrayList.class);
		
		// When / Then
		assertEquals(0,spyArrayList.size());
		when(spyArrayList.size()).thenReturn(5);
		assertEquals(5,spyArrayList.size());
		
		
		spyArrayList.remove("Foo-Bar");
		assertEquals(5,spyArrayList.size());
	}
	@Test
	void testV4() {
		// Given
		List<String> spyArrayList = spy(ArrayList.class);
		
		// When / Then
		spyArrayList.add("Foo-Bar");
		verify(spyArrayList).add("Foo-Bar");
		verify(spyArrayList, never()).remove(anyString());
		verify(spyArrayList, never()).clear();
		
	}
}
