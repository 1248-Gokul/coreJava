package com.chainsys.unitTest;
import com.chainsys.Variables.Bank;

public class BankTest {
public static void testDeposit() 
{
	 System.out.println("Before Balance " + Bank.currentBalance);
	 Bank.deposit(10000);
	 System.out.println("After Balance " + Bank.currentBalance);
}

public static void testWithdraw()
{
	System.out.println("Before Balance " + Bank.currentBalance);
	int withdraw = Bank.withdraw(5000);
	System.out.println("total amount is" + withdraw);
	System.out.println("After Balance " + Bank.currentBalance);
	}
public static void testOpenaccount()
{
Bank.openAccount("GokulPrasanth", 1312345787);
System.out.println(Bank.customerName);
System.out.println(Bank.accountNumber);

 }
}
