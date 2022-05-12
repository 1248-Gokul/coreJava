package com.chainsys.Encapsulation;
import com.chainsys.Encapsulation.Customer;
public class CustomerTest { 
		public static void main(String[] args) 
		{
			Customer c1=new Customer();		
			//c1.setCustomerID(123);
			c1.setName("Tom "+(char)91);
			c1.setAddress("Some where in India");
			c1.setCity("Chennai");
			c1.setMobileNo(9888444411d);
			
			c1.echo();
			c1.placeOrder();
			c1.getFeedback();		
		}
	}


