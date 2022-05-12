package com.chainsys.usingFinal;

public class ShapePrivateConstructor 
{
	public static void main(String args[]) {
		
	 int height;
	 int width;
	 private  ShapePrivateConstructor()
	 {
		System.out.println("Shape CreatedA " + hashCode());
	 }
	private ShapePrivateConstructor(int a)
	{
		height=a;
		width=a;
		System.out.println("Shape CreatedB"+hashCode());
	}
	public static ShapePrivateConstructor () 
	{
		return new ShapePrivateConstructor(); //call to private constructor
	} 
	
}
}
