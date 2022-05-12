package com.chainsys.ExceptionHandling;

public class DemoTrace {
	public static void m1() {
	try
	{
		m1();
	}
	catch(Exception err)
	{
		System.out.println("getmessage "+err.getMessage());
		err.printStackTrace();
		/**Throwable t1=err.getCause();
		if(null=t1)
		{
			Class c1=t1.getClass();
			System.out.println("Cause "+c1.getName());
		}
		else 
		{
			System.out.println("Cause is Null");
		}**/
	}
	finally
	{
		System.out.println("Inside M1 Finally");
	}
	/**public static void m4()
	{
		int x=0;
		int y=0;
		int z=0;**/
		
	}
}

