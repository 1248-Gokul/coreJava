package com.chainsys.StringArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeDemo 
{
	public static void main(String args[]) 
	{
		DemoA();
	}
	
		public static void DemoA()
		{
			TreeSet<String> ts =new TreeSet<String>();
			ts.add("Cut");
			ts.add("Fun");
			ts.add("Assam");
			ts.add("Ball");
			ts.add("Dog");
			ts.add("Aag");
			ts.add("AAg");
			ts.add("Event");
			ts.add("Fan");
			//ts.add(null);
			ts.add("Delhi");
			ts.add("Carrot");
			ts.add("Dail");
			ts.add("Apple");
			ts.add("Boy");
			ts.add("Egg");
			ts.add("Fool");
			System.out.println("Size "+ts.size());
			Iterator<String> itr=ts.iterator();
			while(itr.hasNext()) 
			{
				System.out.println(itr.next());
			}
		}
}

