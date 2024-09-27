package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.Person;

class PersonServiceTest {
	
	@DisplayName("When create a person with sucess should return a person object ")
	@Test
	void testCreatePerson_whenSucess_ShouldReturnPersonObject() {
		
		//Given / Arrange
		IPersonService  service = new PersonService();
		
		
		Person person = new Person(
				"Keith",
				"Moon",
				"Kmoon@vagner.com.br",
				"Wembley UK",
				"Male"
				);
		//When / Act
		Person actual = service.createPerson(person);
		
		//Then / Assert
		assertNotNull(actual, () -> "The createPerson() should not have returned null");
	}
	@DisplayName("When create a person with sucess should Contains firstName in return a person object ")
	@Test
	void testCreatePerson_whenSucess_ShouldContainsFirstNameInReturnPersonObject() {
		
		//Given / Arrange
		IPersonService  service = new PersonService();
		
		
		Person person = new Person(
				"Keith",
				"Moon",
				"Kmoon@vagner.com.br",
				"Wembley UK",
				"Male"
				);
		//When / Act
		Person actual = service.createPerson(person);
		
		//Then / Assert
		assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The FirstName is Different!");
	}

}
