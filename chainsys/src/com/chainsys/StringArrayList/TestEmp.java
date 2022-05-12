package com.chainsys.StringArrayList;

public class TestEmp {

	public static void main(String[] args) {
		SAEmployee firstEmp=new SAEmployee(111);
		SAEmployee secondEmp=new SAEmployee(111);
		System.out.println(firstEmp.hashCode());
		System.out.println(secondEmp.hashCode());
		boolean result=firstEmp.equals(secondEmp);
		System.out.println(result);
		boolean result1=firstEmp.equals(firstEmp);
		System.out.println(result1);
		result1=firstEmp.equals("Hello");
		System.out.println(result1);


	}

}
