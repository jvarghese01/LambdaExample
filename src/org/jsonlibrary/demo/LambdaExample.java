package org.jsonlibrary.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
	
	public static interface CheckPerson {
	    boolean test(Person p);
	}
	
	
	
	public static class CheckPersonEligibleForSelectiveService implements CheckPerson {
	    public boolean test(Person p) {
	        return p.gender == Person.Sex.MALE &&
	            p.getAge() >= 18 &&
	            p.getAge() <= 25;
	    }
	}
	
	
	
	public static class Person {

	    public enum Sex {
	        MALE, FEMALE
	    }

	    String name;
	    LocalDate birthday;
	    Sex gender;
	    String emailAddress;

	    public int getAge() {
	        return 19;
	    }

	    public void printPerson() {
	        System.out.println("Joe");
	    }
	}	
	


	public static void main(String[] args) {
		Person p1 = new Person();
		p1.gender=Person.Sex.MALE;

		Person p2 = new Person();
		p2.gender=Person.Sex.MALE;

		
		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		
		printPersons(
			    people, (Person p) -> p.gender == Person.Sex.MALE
		        && p.getAge() >= 18
		        && p.getAge() <= 25);

	}
	
	
	
	public static void printPersons(
		    List<Person> roster, CheckPerson tester) {
		    for (Person p : roster) {
		        if (tester.test(p)) {
		            p.printPerson();
		        }
		    }
		}	

}
