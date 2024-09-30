package br.com.vagner.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matcher.*;


import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTestWithBDD {
	
	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturn10(){
		
		//Given
		List<?> list = mock(List.class);
		given(list.size()).willReturn(10);
		
		
		//When && Then
		assertThat(list.size(),is(10));
		assertThat(list.size(),is(10));
		assertThat(list.size(),is(10));
	}
	@Test
	void testMockingList_When_SizeIsCalled_ShouldReturnMultipleValue(){
		
		//Given
		List<?> list = mock(List.class);
		given(list.size()).willReturn(10).willReturn(20);
		
		
		//When && Then
		assertThat(list.size(),is(10));
		assertThat(list.size(),is(20));
		assertThat(list.size(),is(20));
	}
	@Test
	void testMockingList_When_GetIsCalled_ShouldReturnErudio(){
		
		//Given
		var list = mock(List.class);
		given(list.get(0)).willReturn("Erudio");
		
		
		//When && Then
		assertThat(list.get(0),is("Erudio"));
		assertNull(list.get(1));
		
	}
	@Test
	void testMockingList_When_GetIsCalledWithArgumentMatcher_ShouldReturnErudio(){
		
		//Given
		var list = mock(List.class);
		
		//If you are using argument matchers, all arguments
		// have to be provided by matchers.
		given(list.get(anyInt())).willReturn("Erudio");
		
		
		//When && Then
		assertThat(list.get(anyInt()),is("Erudio"));
		assertThat(list.get(anyInt()),is("Erudio"));
		
	}
	@Test
	void testMockingList_When_ThrowsAnException(){
		
		//Given
		var list = mock(List.class);
		
		//If you are using argument matchers, all arguments
		// have to be provided by matchers.
		given(list.get(anyInt())).willThrow(new RuntimeException("Foo Bar"));
		
		
		//When && Then
		assertThrows(RuntimeException.class, () -> {list.get(anyInt());}, () -> "Should have throw an RuntimeException");
		
		
	}

}
