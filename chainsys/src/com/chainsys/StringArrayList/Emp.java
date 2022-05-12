package com.chainsys.StringArrayList;

import java.io.Serializable;

public class Emp implements Serializable{
	final int id;
	public String Name;
	public int Id;
	
	public  Emp(int v1, String sName) {
		id=v1;
		Name=sName;
	}
	public int getId() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Class cl = obj.getClass();
		boolean flag=false;
		if(cl == this.getClass()) {
			Emp other =(Emp) obj;
			if(this.hashCode() == other.hashCode())
				flag =true;
		}
		return flag;
		
	}
	/* @Override
	public int hashCode() 
	{
		return this.id;
	} */

}
