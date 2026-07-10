package com.kodewala.interfacemultipleinheritance;
public class Person implements Cloneable
{
	String name;
	
	Person(String _name) {
		this.name = name;
	}
	
	@Override
	
	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone(); // object class clone
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person("Kodewala");
		
		Person p1 = p.clone();
		
		System.out.println(" p " + p.name);
		System.out.println(" p1 " + p1.name);
		
		
		if (p instanceof Cloneable) {
			System.out.println("p is type of cloneable");
		}
		else
		{
			System.out.println("p is not a type of cloneable. You can not clone the object of person class");
		}
	}
}




