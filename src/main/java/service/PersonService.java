package service;

import model.Person;

public class PersonService implements IPersonService{

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return new Person();
		
	}
}
