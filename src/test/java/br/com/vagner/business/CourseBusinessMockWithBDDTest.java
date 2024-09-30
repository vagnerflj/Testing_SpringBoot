package br.com.vagner.business;

import br.com.vagner.service.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matcher.*;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CourseBusinessMockWithBDDTest {
	
	CourseService mockService; 
	CourseBusiness business;
	List<String> courses;
	
	@BeforeEach
	void setup() {
		//Given /Arrange
		mockService = mock(CourseService.class);
		business = new CourseBusiness(mockService);
		
		courses = Arrays.asList(
				"REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker"
				);
	}
	@Test
	void testCoursesRelatedToSpring_when_UsingAMock() {
		
		given(mockService.retrieveCourses("Vagner")).willReturn(courses);
		//When /Act
		var filteredCourses = business.retriveCoursesRelatedToSpring("Vagner");
		
		//Then / Assert
		assertThat(filteredCourses.size(), is(4));
		
	}
	
	@DisplayName("Delete Courses not Releted to Spring Using Mockito sould call method")
	@Test
	void testDeleteCoursesNotRelatedToSpring_UsingMockitoVerify_Should_CallMethod_deleteCourse() {
		
		//Given
		given(mockService.retrieveCourses("Vagner")).willReturn(courses);
		
		//When /Act
		business.deleteCoursesNotRelatedToSpring("Vagner");
		
		//Then
		//verify(mockService).deleteCourse("Microsserviços do 0 com Spring Cloud, Kotlin e Docker");
		
		//Then
		//verify(mockService, times(1)).deleteCourse("Microsserviços do 0 com Spring Cloud, Kotlin e Docker");
		
		//Then
		//verify(mockService, never()).deleteCourse("Microsserviços do 0 com Spring Cloud, Kotlin e Docker");
			
		//Then
		//verify(mockService, atLeast(1)).deleteCourse("Microsserviços do 0 com Spring Cloud, Kotlin e Docker");
			
		//Then
		verify(mockService, atLeastOnce()).deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
				
	}

	@DisplayName("Delete Courses not Releted to Spring Using Mockito sould call method V2")
	@Test
	void testDeleteCoursesNotRelatedToSpring_UsingMockitoVerify_Should_CallMethod_deleteCourseV2() {
		
		//Given
		given(mockService.retrieveCourses("Leandro")).willReturn(courses);
		
		//When /Act
		business.deleteCoursesNotRelatedToSpring("Leandro");
		
	
		//Then
		then(mockService).should().deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
		
		//Then
		then(mockService).should().deleteCourse("Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#");
		
		//Then
		then(mockService).should(never()).deleteCourse("Microsserviços do 0 com Spring Cloud, Kotlin e Docker");
				
	}
	

}
