package com.kodewala.stringbuilderexp;

public class StringManipulationDemo {
//	StringManipulationDemo() {
//		String sb = new String("Hello");
//		System.out.println(sb);
//	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		
		// append
		sb.append(" World ");
		System.out.println("after append : "+sb);
		
		// insert
		sb.insert(12, " java");
		System.out.println("after insert : "+sb);
		
		// delete
		
		sb.delete(2, 10);
		System.out.println("after delete :" + sb);
		StringManipulationDemo sm = new StringManipulationDemo();
	}

}
