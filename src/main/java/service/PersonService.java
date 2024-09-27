package service;

import java.util.concurrent.atomic.AtomicLong;

import model.Person;

public class PersonService implements IPersonService{

	@Override
	public Person createPerson(Person person) {
		var id = new AtomicLong().incrementAndGet();
		person.setId(id);
		return  person;
		
	}
}
