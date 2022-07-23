package com.chainsys.Abstract;
import com.chainsys.Abstract.AbsTest;
public abstract class AbsDemoA extends AbsDemoB {
	public AbsDemoA()
	{
		System.out.println("DemoAChild Object Created "+hashCode());
	}
	public static void testDemoA() {
//		AbsDemoA a1=new AbsDemoA();//abstract class
//		AbsDemoA.show();// static method

		DemoBChild b1 = new DemoBChild();// child class
		b1.echo();// parent.echo()
	}
}
	
