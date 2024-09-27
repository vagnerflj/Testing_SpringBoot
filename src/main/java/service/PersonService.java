package service;

import java.util.concurrent.atomic.AtomicLong;

import model.Person;

public class PersonService implements IPersonService{

	@Override
	public Person createPerson(Person person) {
		
		if(person.getEmail() == null || person.getEmail().isBlank())
		throw new IllegalArgumentException("The Person e-mail is null or empty!");
			
		
		
		var id = new AtomicLong().incrementAndGet();
		person.setId(id);
		return  person;
		
	}
}
