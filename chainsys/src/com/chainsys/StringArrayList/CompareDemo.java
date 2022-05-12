package com.chainsys.StringArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CompareDemo{
public static void main (String args[]) {
			public static void compareEmp()
			{
				Emp el=new Emp (100, null);
				el.Name="Sam";
				Emp e2 =new Emp (200, null);
				e2.Name = "Musk";
				Emp e3=new Emp (300, null);
				e3.Name = "Jobs";
				ArrayList<Emp> empList=new ArrayList<Emp>();
				empList.add(-2,e3); 
				empList.add(e3);
				empList.add(el);
				System.out.println(empList);
				Collections.sort(null);
				System.out.println(empList);
}
}


