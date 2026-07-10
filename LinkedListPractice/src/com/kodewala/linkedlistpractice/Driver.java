package com.kodewala.linkedlistpractice;

import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("blr");
		list.add("bom");
		list.add("del");
		list.add("pune");
		list.add("rnc");
		list.add("dto");
		list.add("che");
		list.add("hyd");
		list.add("kol");
		
		
		list.add("smvt");
		System.out.println(list);
		list.add(3,"ahemdabad");
		System.out.println(list);
		
		
	}

}
