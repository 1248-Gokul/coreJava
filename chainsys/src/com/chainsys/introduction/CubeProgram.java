package com.chainsys.introduction;

public class CubeProgram {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		int temp,cube = 0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the  value");
		int x=sc.nextInt();
		sc.close();
		temp=x;
		while(x>0) {
			int remainder = x%10;
		    cube = cube + remainder *remainder *remainder;
		    x = x/10;
		}
		if(temp == cube)
		{
			System.out.println("Same As Input Number");
		}
		else
		{
			System.out.println("Different Number");
		}
		
		
		
		
		
	}

}
