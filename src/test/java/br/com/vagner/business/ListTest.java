package br.com.vagner.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTest {
	
	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturn10(){
		
		//Given
		List<?> list = mock(List.class);
		when(list.size()).thenReturn(10);
		
		
		//When && Then
		assertEquals(10, list.size());
	}
	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturnMultipleValue(){
		
		//Given
		List<?> list = mock(List.class);
		when(list.size()).thenReturn(10).thenReturn(20);
		
		
		//When && Then
		assertEquals(10, list.size());
		assertEquals(20, list.size());
		assertEquals(20, list.size());
	}
	@Test
	void testMockingList_When_GetIsCalled_ShouldReturnErudio(){
		
		//Given
		var list = mock(List.class);
		when(list.get(0)).thenReturn("Erudio");
		
		
		//When && Then
		assertEquals("Erudio", list.get(0));
		assertNull(list.get(1));
		
	}
	@Test
	void testMockingList_When_GetIsCalledWithArgumentMatcher_ShouldReturnErudio(){
		
		//Given
		var list = mock(List.class);
		when(list.get(anyInt())).thenReturn("Erudio");
		
		
		//When && Then
		assertEquals("Erudio", list.get(anyInt()));
		assertNull(list.get(anyInt()));
		
	}

}
