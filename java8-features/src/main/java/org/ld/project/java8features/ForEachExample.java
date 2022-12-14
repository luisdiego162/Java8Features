package org.ld.project.java8features;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import org.ld.project.java8features.entity.Person;

import java.lang.Integer;

/**
 * 
 * Java 8 has introduced forEach method in java.lang.Iterable interface so 
 * that while writing code we focus on business logic. 
 * The forEach method takes java.util.function.Consumer object as an argument, 
 * so it helps in having our business logic at a separate location that we can reuse. 
 * Let’s see forEach usage with a simple example.
 * 
 * @author luisdiego
 *
 */
public class ForEachExample {

	public static void main(String[] args) {
		
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}

		});
		
		//traversing with Consumer interface implementation
		List<Person> myPersonList = new ArrayList<Person>();
		for(int i=0; i<10; i++) myPersonList.add(new Person());
		MyPerson person = new MyPerson();
		myPersonList.forEach(person);
		
	}

}

//Consumer implementation that can be reused
class MyPerson implements Consumer<Person>{

	public void accept(Person t) {
		System.out.println("Consumer impl Person::"+t.getName()
		+ " "+t.getLastName()
		);
	}
}



