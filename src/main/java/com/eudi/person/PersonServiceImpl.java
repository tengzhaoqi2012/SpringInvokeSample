package com.eudi.person;

import org.springframework.stereotype.Service;

public class PersonServiceImpl implements IPersonService{

	@Override
	public Person getPerson(String name) {
		Person p = new Person("name=" + name);
		return p;
	}

}
