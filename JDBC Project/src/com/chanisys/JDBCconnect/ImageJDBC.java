package com.chanisys.JDBCconnect;
	import java.sql.*;  
	import java.io.*; 
public class ImageJDBC {
	public static void main(String[] args) 
	  {  
	 try
	 {  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
	              
	PreparedStatement ps=con.prepareStatement("insert into IMAGE_TABLE values(?,?)");  
	ps.setString(1,"Gokul");  
	  
	FileInputStream fin=new FileInputStream("d:\\3159.jpg");  
	ps.setBinaryStream(2,fin,fin.available());  
	int i=ps.executeUpdate();  
	System.out.println(i+" records affected");  
	          
	con.close();  
	}
	  catch (Exception e) {
		  e.printStackTrace();
	   }  
	  }  
	}

