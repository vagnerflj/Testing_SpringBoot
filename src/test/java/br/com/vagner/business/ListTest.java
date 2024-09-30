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
		
		//If you are using argument matchers, all arguments
		// have to be provided by matchers.
		when(list.get(anyInt())).thenReturn("Erudio");
		
		
		//When && Then
		assertEquals("Erudio", list.get(anyInt()));
		assertEquals("Erudio", list.get(anyInt()));
		
	}
	@Test
	void testMockingList_When_ThrowsAnException(){
		
		//Given
		var list = mock(List.class);
		
		//If you are using argument matchers, all arguments
		// have to be provided by matchers.
		when(list.get(anyInt())).thenThrow(new RuntimeException("Foo Bar"));
		
		
		//When && Then
		assertThrows(RuntimeException.class, () -> {list.get(anyInt());}, () -> "Should have throw an RuntimeException");
		
		
	}

}
