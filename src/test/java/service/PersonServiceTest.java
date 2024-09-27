package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.Person;

class PersonServiceTest {
	
	Person person;
	IPersonService service;
	
	@BeforeEach
	void setup() {
		person = new Person("Keith", "Moon", "Kmoon@vagner.com.br", "Wembley UK", "Male");
		service = new PersonService();
	}
	
	@DisplayName("When create a person with sucess should return a person object ")
	@Test
	void testCreatePerson_whenSucess_ShouldReturnPersonObject() {
		
		//When / Act
		Person actual = service.createPerson(person);
		
		//Then / Assert
		assertNotNull(actual, () -> "The createPerson() should not have returned null");
	}
	@DisplayName("When create a person with sucess should Contains valid  Field in return a person object ")
	@Test
	void testCreatePerson_whenSucess_ShouldContainsFirstNameInReturnPersonObject() {
		
		//Given / Arrange
		//When / Act
		Person actual = service.createPerson(person);
		
		//Then / Assert
		assertNotNull(person.getId(), () -> "Person ID is missing");
		assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The FirstName is Incorrect!");
		assertEquals(person.getLastName(), actual.getLastName(), () -> "The LastName is Incorrect!");
		assertEquals(person.getAdress(), actual.getAdress(), () -> "The Adress is Incorrect!");
		assertEquals(person.getGender(), actual.getGender(), () -> "The Gender is Incorrect!");
		assertEquals(person.getEmail(), actual.getEmail(), () -> "The Email is Incorrect!");
	}
	
	@DisplayName("When create a person with null e-mail should throw Exception")
	@Test
	void testCreatePerson_WhithNullEmail_ShouldThrowIllegalArgumentException() {
		//Given / Arrange
		
		person.setEmail(null);
		
		var expectedMessage = "The Person e-mail is null or empty!";
				
		//When / Act & //Then / Assert
		IllegalArgumentException exception = assertThrows(
				IllegalArgumentException.class,
				() ->  service.createPerson(person), 
				() -> "Empty e-mail should have couse an IllegalArgumentException");
		
		//Then / Assert
		assertEquals(expectedMessage, 
				exception.getMessage(),
				() -> "Exceprion error message is incorrect!");
	
	}
		
		
}
