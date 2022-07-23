package com.chainsys.practices.pexception;

import java.lang.Throwable;

public class ExceptionHandling {
	public static void main(String[] args) throws Throwable {
		try {
			int i = 4 / 0;
			System.out.println("OutPut :" + i);;
		} catch (Exception e) {
			e.printStackTrace(); // This Tool used handle the exception and errors
			System.err.println("Cause : " + e.getCause()); // The Cause Will be return the null value 
		}
	}
}
