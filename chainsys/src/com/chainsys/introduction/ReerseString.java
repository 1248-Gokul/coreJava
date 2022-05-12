package com.chainsys.introduction;
/**
 * 
 * @author goku3159
 *
 */
public class ReerseString {
	public static void main(String[] args)
	{
		                String words = "Tom and Jerry are good friends";
		                int count;
		                String ts=words.trim();
		                String[] str = ts.split(" ");
		                count = str.length;
		                System.out.println("Word count " + count);
		                char[] ch = words.toCharArray();
		                int reverseString = ch.length;
		                for (int i = reverseString - 1; i >= 0; i--)
		                {
		                        System.out.print(ch[i]);
		                }
		        }
	

	}


