package com.kodewala.oopspractice.override;


class Employee
{
	public void saySomething()
	{
		System.out.println("Hello");
	}
}
class Manager extends Employee
{
	public void saySomething()
	{
		System.out.println("hey bro");
	}
}
public class Driver {

	public static void main(String[] args) {
		Manager mgr = new Manager();
		mgr.saySomething();
		System.out.println("--------------------------");
		
		Employee e1 = new Manager();
		e1.saySomething();
		
		System.out.println("---------------------------");
		Employee e2 = new Employee();
		e2.saySomething();
	}

}


////Base class
//class Device {
// public void turnOn() {
//     System.out.println("Device is turning on...");
// }
//}
//
////Subclass 1
//class Light extends Device {
// @Override
// public void turnOn() {
//     System.out.println("Light is ON 💡");
// }
//}
//
////Subclass 2
//class Fan extends Device {
// @Override
// public void turnOn() {
//     System.out.println("Fan is spinning 🌀");
// }
//}
//
////Subclass 3
//class AC extends Device {
// @Override
// public void turnOn() {
//     System.out.println("AC is cooling ❄️");
// }
//}
//
////Main class
//public class SmartHomeApp {
// public static void main(String[] args) {
//
//     // Runtime Polymorphism
//     Device d1 = new Light();
//     Device d2 = new Fan();
//     Device d3 = new AC();
//
//     d1.turnOn();
//     d2.turnOn();
//     d3.turnOn();
// }
//}