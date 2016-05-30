package com.test;

import com.learning.collections.MyArrayList;


public class Test {
public static void main(String[] args) {
	/*MyArrayList<String> list = new MyArrayList<String>();
	list.add("RCB");
	list.add("SRH");
	list.add("KKR");
	list.add("MI");
	list.add("CSK");
	System.out.println(list.size());
	System.out.println(list.toString());
	list.delete(2);
	
	System.out.println(list.toString());
	list.add("GL");
	System.out.println(list.toString());
	list.delete(0);
	System.out.println(list.toString());
	System.out.println(list.get(3));
	System.out.println(list.isEmpty());
	System.out.println(list);
	list.delete(3);
	System.out.println(list);*/
	
	MyArrayList<Integer> ints = new MyArrayList<Integer>(5);
	ints.add(1);
	System.out.println(ints);
}
}
