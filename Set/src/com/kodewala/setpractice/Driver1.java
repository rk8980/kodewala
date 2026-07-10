package com.kodewala.setpractice;

class Person
{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	@Override
	public int hashCode()
	{
		return 4321343;
	}
}
public class Driver1 {

	public static void main(String[] args) {
		// contract 1 --> if two object are same ,then hashCode must be same.
		
		String s1 = "Kodewala";
		String s2 = "Kodewala";
		
		System.out.println(s1.hashCode() + " and " + s2.hashCode());
		
		
		// contract 2 --> if two object are returning same hasCode ,then object may or may not be equal
		
		Person p1 = new Person("Ajay");
		Person p2 = new Person("Viyay");
		
		System.out.println(p1.hashCode() + " and " + p2.hashCode() + " is p1 and p2 equal ?" + p1.equals(p2));

	}

}
