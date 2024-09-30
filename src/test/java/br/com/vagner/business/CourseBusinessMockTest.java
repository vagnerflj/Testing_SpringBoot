package br.com.vagner.business;
import br.com.vagner.service.stubs.*;
import br.com.vagner.service.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CourseBusinessMockTest {
	
	CourseService mockService; 
	CourseBusiness business; 
	
	@BeforeEach
	void stup() {
		//Given /Arrange
		mockService = mock(CourseService.class);
		business = new CourseBusiness(mockService);
	}
	@Test
	void testCoursesRElatedToSPring_when_UsingStub() {
		
		//When /Act
		var filteredCourses = business.retriveCoursesRElatedToSpring("Vagner");
		
		//Then / Assert
		assertEquals(4, filteredCourses.size());
		
	}
	@Test
	void testCoursesRElatedToSPring_when_UsingFooBarStudent() {

		//When /Act
		var filteredCourses = business.retriveCoursesRElatedToSpring("Foo Bar");
		
		
		//Then / Assert
		assertEquals(0, filteredCourses.size());
		
	}

}
