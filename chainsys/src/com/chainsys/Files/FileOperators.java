package com.chainsys.Files;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileOperators {
	private static Paths paths;
	public static void main(String[] args) throws IOException{
		   //CreateFile();
		   //RenameFile();
		   //FileWrites();
		   //FileReading();
		   //DeletFile();
			//FileCopy();
			//FileModify();
			FileMove();
	}
	   
		public static void CreateFile() 
		{
			File ff = new File("D:\\Temp\\Java1\\codes\\Gokulss.txt");
		 try {
			 ff.createNewFile();
			 if(!ff.exists()) {
				System.out.println("File is Created ");
			 }
		} catch (IOException e)
		 {
			System.out.println(" This File Already Exists");
		}
		}
		public static void RenameFile()
		{
			File ff = new File("D:\\Temp\\Java1\\codes\\Files1.txt");
			File f = new File("D:\\Temp\\Java1\\codes\\ProgramsFile.txt");
			boolean flag=ff.renameTo(f);
			if(flag==true)
			{
				System.out.println("Name Changed ");
			}
			else
			{
				System.out.println("Name Not changed ");
			}
		}
		public static void FileWrites() {
		        try { FileWriter ff = new FileWriter("D:\\Temp\\Java1\\codes\\ProgramsFile.txt",true);
		        
		            ff.append("Hello How Are You !!!!!");
		            ff.close();
		        } catch (IOException i) 
		        {
		        	System.out.println("Append is Error...");
		           // i.printStackTrace();
		        }
		    }
		public static void FileReading() {
			try {
			      File ff = new File("D:\\Temp\\Java1\\codes\\ProgramsFile.txt");
			      Scanner sc = new Scanner(ff);
			      while (sc.hasNextLine()) 
			      {
			        String data = sc.nextLine();
			        System.out.println(data);
			      }
			      sc.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      //e.printStackTrace();
		}
		}

		public static void DeletFile()
		{
			File ff = new File("D:\\Temp\\Java1\\codes\\ProgramsFile.txt");
			System.out.println("The data is Deleted... " + ff.delete());
		}

public static void FileCopy()
{	
	try {
	InputStream ff=new FileInputStream("d:\\Temp\\test.txt");
	OutputStream Nc=new FileOutputStream("d:\\Temp\\copy.txt ");
	 int content=ff.read();
	while(content != -1)
{
	 Nc.write(content);
	 content=ff.read();
	}
	Nc.flush();
	}
	catch (IOException e) 
	{
		e.printStackTrace();
	}
	
}
public static void FileMove() {
    
    File SourceFile=new File("d:\\Temp\\test.txt");
    File DestinationFile=new File("D:\\Temp\\Java1\\codes\\Gokulss.txt");
    try {
        Files.copy(SourceFile.toPath(),DestinationFile.toPath() ,StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File Move Successfully");
    } catch(IOException e) {
        e.printStackTrace();
    }
     }

public static void FileModify() throws IOException
{
    FileWriter f = new FileWriter("d:\\Temp\\test.txt");
    try (FileWriter filewriter = new FileWriter("d:\\Temp\\copy.txt")) {
        f.write("hello mr.venkat");
        f.close();
        System.out.println("Modify the file");
    } catch (Exception e) {
        System.out.println("Error");
    }

}
}

		

	


