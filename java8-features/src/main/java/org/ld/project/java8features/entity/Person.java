package org.ld.project.java8features.entity;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Person {
	
	String name;
	String lastName;
	int leftLimit = 48; // numeral '0'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
	
	public Person ()
	{
		Random random = new Random();
		String generatedString = random.ints(leftLimit, rightLimit + 1)
			      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
			      .limit(targetStringLength)
			      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			      .toString();
		
		this.name = generatedString;
		this.lastName= generatedString;
	
	}
	
	public Person ( String name, String lastName)
	{
		this.name = name;
		this.lastName= lastName;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
		
    

}
