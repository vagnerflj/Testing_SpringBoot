package br.com.vagner.business;
import br.com.vagner.service.stubs.*;
import br.com.vagner.service.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseBusinessStubTest {

	@Test
	void testCoursesRElatedToSPring_when_UsingStub() {
		
		//Given /Arrange
		CourseService stubService = new CourseServiceStub();
		CourseBusiness business = new CourseBusiness(stubService);
		
		//When /Act
		var filteredCourses = business.retriveCoursesRElatedToSpring("Vagner");
		
		//Then / Assert
		assertEquals(4, filteredCourses.size());
		
	}
	@Test
	void testCoursesRElatedToSPring_when_UsingFooBarStudent() {
		
		//Given /Arrange
		CourseService stubService = new CourseServiceStub();
		CourseBusiness business = new CourseBusiness(stubService);
		
		//When /Act
		var filteredCourses = business.retriveCoursesRElatedToSpring("Foo Bar");
		
		
		//Then / Assert
		assertEquals(0, filteredCourses.size());
		
	}

}
