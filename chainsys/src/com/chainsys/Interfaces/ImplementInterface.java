package com.chainsys.Interfaces;

public class ImplementInterface  implements FirstInterface,SecondInterface 
{	 
	public int a=10;
	public int b=5;
	public int C;

	@Override
	public void Multiple ()
	{
		C = a*b;
		System.out.println("This the value : " + C);
		
	}

	@Override
	public void sum() {
		C = a+b;
		System.out.println("this the value : " + C);
		
	}

}
