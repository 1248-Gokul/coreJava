package com.chainsys.ArraysCreating;

public class BankTest {
	public static void test()
	{
	CustomerAccountDetails acd= new CustomerAccountDetails(21,67);
	acd.getCustomer_id();
	acd.getAccount_number();
	acd.getAccount_type();
	acd.getCurrent_balance();
	acd.setAccount_type("Savings");
	acd.setCurrent_balance(50,000.67);
	System.out.println("Account type :"+acd.getAccount_type());
	System.out.println("Customer Id :" +acd.getCustomer_id());
	System.out.println("Account Number :" +acd.getAccount_number());
	System.out.println("Current Balance :"+acd.getCurrent_balance());
	
	NewArrayPerson nap=new NewArrayPerson();
	nap.getName();
	nap.getPhone_number();
	nap.Person(987);
	nap.getE_mail_address();
	nap.getAddress();
	nap.setAddress("kalavasal Street in Madurai");
	nap.setE_mail_address("gokulsanjay@gmail.com");
	nap.setPhone_number(895782732);
	nap.setName("Gokul Prasanth");
	System.out.println("\nPerson Name\n :" + nap.getName());
	System.out.println("Phone_Number :" + nap.getPhone_number() );
	//System.out.println("Person Id :" + nap.Person(987));
	System.out.println("Email_Address :" + nap.getE_mail_address());
	System.out.println("Address :" + nap.getAddress());
	
	Branch b = new Branch(2);
	b.getLocation();
	Branch.getBankName();
	b.getManagerId();
	b.setLocation("Madurai");
	b.setManagerId(8765);
	System.out.println("\nLocation : " + b.getLocation());
	System.out.println("Branch Id :" + b.getId());
	System.out.println("Enter the Manager Id :" + b.getManagerId());
	System.out.println("Enter the BankName :" + Branch.getBankName());
	//BankEmployee be = new BankEmployee(0);
	
	

}


}
