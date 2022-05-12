package com.chainsys.introduction;
/**
 * 
 * @author goku3159
 *
 */

public class EvenNumbers 
{

	public static void main(String[] args) 
	{
		int no = 1546903;
		for(no=0;no<=10;no++)
		{
			if(no%2==0)
			{
				System.out.println("EvenNumbers = " + no);
			}
			else
			{
				System.out.println("Is NOt EvenNumbers = " + no);
			}

		}
	}

}
