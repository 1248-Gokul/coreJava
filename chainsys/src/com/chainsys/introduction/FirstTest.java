package com.chainsys.introduction;
/**
 * 
 * @author goku3159
 *
 */

public class FirstTest {

	public static void main(String[] args) {
		int number;
		for(number=1;number<100;number++)
		{
			if(number%3==0)
			{
				System.out.println("Fizz = " + number);
			}
			if(number%5==0)
			{
				System.out.println("Buzz = "+ number);
			}
			if(number%3==0 && number%5 ==0)
			{
				System.out.println("FizzBuzz = " + number);
			}
		}

	}

}
