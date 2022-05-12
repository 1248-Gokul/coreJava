package com.chainsys.ExceptionHandling;
import java.util.Scanner;
public class ExceptionDemoA {

	public static void main(String[] args) 
	{
		m3();

	}
	public static void m1() {
		try
		{
			m2();
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
	}	
	public static void m2() {
	}
	public static void m3() {
	}
	public static void m4()
	{
		System.out.println("Before Try");
		int x=0,y=0,z=0;
		String s1=null,s2=null;
		java.util.Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			System.out.println("Inside try");
			System.out.println("enter the valueof X");
			s1=sc.nextLine();
			System.out.println("enter the valueof Y");
			s2=sc.nextLine();
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			z=x/y;
			System.out.println("Result "+z);
			
		}
		catch(ArithmeticException err) {
			System.out.println("Inside Catch1 "+err.getMessage());
			System.out.println("Error Type "+err.getClass().getName());
		}
		catch(NumberFormatException err) {
			System.out.println("Inside Catch2 "+err.getMessage());
			System.out.println("Error Type "+err.getClass().getName());
		}
		catch(Exception err) {
			System.out.println("Inside Catch3 "+err.getMessage());
			System.out.println("Error Type "+err.getClass().getName());
		}
		finally
		{
			System.out.println("Inside Finally");
		}
	}
}

