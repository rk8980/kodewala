package com.kodewala.interfacemultipleinheritance;



interface Special {
 
}


class NormalUser {
}


class VIPUser implements Special {
}



public class Main {
 public static void main(String[] args) {

     NormalUser n = new NormalUser();
     VIPUser v = new VIPUser();

     checkAccess(n);
     checkAccess(v);
 }

 public static void checkAccess(Object obj) {

     
     if (obj instanceof Special) {
         System.out.println("VIP Access Granted");
     } else {
         System.out.println("Normal Access");
     }
 }
}





//interface Marker {
//    
//}
//class Student implements Marker {
//    String name;
//
//    Student(String name) {
//        this.name = name;
//    }
//}
//class Employee {
//    String name;
//
//    Employee(String name) {
//        this.name = name;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Student s = new Student("Rahul");
//        Employee e = new Employee("Amit");
//
//        checkMarker(s);
//        checkMarker(e);
//    }
//
//    public static void checkMarker(Object obj) {
//        if (obj instanceof Marker) {
//            System.out.println("This object is MARKED");
//        } else {
//            System.out.println("This object is NOT marked");
//        }
//    }
//}