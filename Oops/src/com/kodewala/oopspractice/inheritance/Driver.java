package com.kodewala.oopspractice.inheritance;
class Person {
	
    String name = "Rahul";
    

    public void display() {
    	
        System.out.println("Name: " + name);
    }
}

//class Student extends Person {
//	
//    int rollNo = 101;
//
//    public void show() {
//    	
//        System.out.println("Roll No: " + rollNo);
//        
//    }
//   
//}

public class Driver extends Person {
	int rollNo = 101;

    public void show() {
    	
        System.out.println("Roll No: " + rollNo);
        
    }

	
	 public static void main(String[] args) {
			Driver student = new Driver();
			student.display();
			student.show();
	    }

}
