package com.chainsys.Constructor;

public class TestShape {
		public static void main(String[] args) 
		{
			//Shape s1=new Shape();
			Shape s1=Shape.getShape();
			s1.display();
		}
	}


