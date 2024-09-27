package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonServiceTest {
	
	@DisplayName("When create a person with sucess should return a person object ")
	@Test
	void testCreatePerson_whenSucess_ShouldReturnPersonObject() {
		
		//Given / Arrange
		IPersonService  service = new PersonService();
		
		//When / Act
		
		//Then / Assert
	}

}
