package br.com.vagner.mockito.staticwithparams;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

class MyUtilsTest {

	@Test
	void shouldMockStaticMethodWithParams() {
		try(MockedStatic<MyUtils> mockedStatic = mockStatic(MyUtils.class)){
			mockedStatic.when(() -> MyUtils.getWelcomeMessage(eq("Vagner"), anyBoolean())).thenReturn("Howdy Vagner!");
		
			
			String result = MyUtils.getWelcomeMessage("Vagner", false);
			
			assertEquals("Howdy Vagner!", result);
		}
	}

}
