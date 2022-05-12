package com.chainsys.ExceptionHandling;
import java.util.Scanner;
public class NestedTry
{
	static String[] data;
	public static void main(String args[])
	{
		int num=0;
		int numvalue=0;
		data=new String[2];
		java.util.Scanner sc =null;
		try
		{
			sc=new Scanner(System.in);
			try
			{
				System.out.println("Enter Value of X");
				data[0]=sc.nextLine();
				numvalue=Integer.parseInt(data[2]);
				System.out.println("The Square is "+ numvalue*numvalue);
			}
			catch(NumberFormatException nb)
			{
				System.out.println("NOT a Number ");
			}
			num=data.length;
			System.out.println("Array Length "+num);
		}
		catch(ArrayIndexOutOfBoundsException ne)
		{
			System.out.println("ArrayIndexOutOfBoundException - No arguments given!! ");
		}
		catch(Exception er)
		{
			System.out.println("Exception "+er.getMessage());
		}
		finally 
		{
			System.out.println("Inside Finally");
		}
	}
}


