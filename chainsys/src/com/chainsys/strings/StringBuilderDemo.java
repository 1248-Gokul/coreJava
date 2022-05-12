package com.chainsys.strings;

public class StringBuilderDemo {
	public static void testA()
	{
		String firstString="Hello how are you today,Is the weather hot or cold";
		StringBuilder stringbuilder = new StringBuilder();
	//	stringbuilder
		System.out.println("lenght = " + stringbuilder.length());
		System.out.println("cpacity = " + stringbuilder.capacity());
		
		stringbuilder.append(firstString);
		System.out.println("buffer= " + stringbuilder);
		System.out.println("lenght = " + stringbuilder.length());
		System.out.println("cpacity = " + stringbuilder.capacity());
		
		firstString="wish it rain this week";
		stringbuilder.append(firstString);
		System.out.println("buffer= " + stringbuilder);
		System.out.println("lenght = " + stringbuilder.length());
		System.out.println("cpacity = " + stringbuilder.capacity());
		
		stringbuilder.trimToSize();
		System.out.println("lenght = " + stringbuilder.length());
		System.out.println("cpacity = " + stringbuilder.capacity());
		
		stringbuilder.replace(3,8,"--this is a Test--");
		System.out.println("replace  " + stringbuilder.length());
		
		stringbuilder.insert(10,"this is august");
		System.out.println("insert = " + stringbuilder);
		System.out.println("lenght = " + stringbuilder.length());
		System.out.println("cpacity = " + stringbuilder.capacity());
		
		stringbuilder.delete(5, 20);
		System.out.println("delete = " + stringbuilder);
		System.out.println("lenght = " + stringbuilder.length());
		System.out.println("cpacity = " + stringbuilder.capacity());
		
		
		
		
	}

}