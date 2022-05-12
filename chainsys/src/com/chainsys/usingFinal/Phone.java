package com.chainsys.usingFinal;

public class Phone {
 public void makeAcall() {
	 System.out.println("Call made...");
 }
 public final void sendSMS()
 {
	 System.out.println("SMS send...");
 }
}
class Nokia extends Phone
{
	@Override
	public void makeAcall()
	{
		System.out.println("Call Made from Nokia");
	}
}
