package br.com.vagner.mockito;

import br.com.vagner.business.CourseBusiness;
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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class CourseBusinessMockitoInjectMocksTest {
	
	@Mock
	CourseService mockService; 
	
	@InjectMocks
	CourseBusiness business;
	
	@Captor
	ArgumentCaptor<String> argumentCaptor;
	
	List<String> courses;
	
	@BeforeEach
	void setup() {
		//Given /Arrange
		//business = new CourseBusiness(mockService);
		
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
		verify(mockService, atLeastOnce()).deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
				
	}

	@DisplayName("Delete Courses not Releted to Spring Using Mockito sould call method V2")
	@Test
	void testDeleteCoursesNotRelatedToSpring_UsingMockitoVerify_Should_CallMethod_deleteCourseV2() {
		
		//Given
		given(mockService.retrieveCourses("Leandro")).willReturn(courses);
		
		String arquiteturaCourse = "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#";
		String agileCourse = "Agile Desmistificado com Scrum, XP, Kanban e Trello";
		String restSpringCourse = "Microsserviços do 0 com Spring Cloud, Kotlin e Docker";
		
		//When /Act
		business.deleteCoursesNotRelatedToSpring("Leandro");
		
		//Then
		then(mockService).should().deleteCourse(agileCourse);
		//Then
		then(mockService).should().deleteCourse(arquiteturaCourse);
		//Then
		then(mockService).should(never()).deleteCourse(restSpringCourse);
				
	}
	@DisplayName("Delete Courses not Releted to Spring Capturing Arguments sould call method")
	@Test
	void testDeleteCoursesNotRelatedToSpring_CapturingArguments_Should_CallMethod_deleteCourseV2() {
		
		//Given
		given(mockService.retrieveCourses("Leandro")).willReturn(courses);
		
		//ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
				
		//When /Act
		business.deleteCoursesNotRelatedToSpring("Leandro");
		
		//Then
		then(mockService).should(times(7)).deleteCourse(argumentCaptor.capture());
		assertThat(argumentCaptor.getAllValues().size(), is(7));
			
	}

}
