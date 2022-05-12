package com.chainsys.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.FileReader;



public class FileOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//createFile();
	
//renameFile();
//appendDataToFile();
	 //modifyDataInFile();
	//readDataFromFile();
	//deleteFile();
		fileWriting();
showallfiles();
//copyFile();
	//moveFile();
	}
	public static void createFile() {
	File file= new File("C:\\Users\\bara3134\\Barath\\Test.txt");
	boolean present=file.exists();
	if(present==false)
		
		
	try {
		boolean created=file.createNewFile();
		System.out.println("File is Created:"+created);
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	

	}
	
	
	
	public static void renameFile() throws IOException {
		File file= new File("C:\\Users\\bara3134\\Barath\\Test.txt");
		file.createNewFile();
		File newName= new File("C:\\Users\\bara3134\\Barath\\Test1.txt");
		boolean renameSuccess=file.renameTo(newName);
		System.out.println("File is Renamed:"+renameSuccess);
	System.out.println(file.canExecute());
	System.out.println(file.canRead());
	System.out.println(file.getName());
		
	}
	

 public static void appendDataToFile()
{
	 String data=" chainsys,chennai";
	try
{
		 FileWriter fw = new FileWriter("C:\\Users\\bara3134\\Barath\\Test1.txt",true);
		  fw.write(data);
		  System.out.println("Data appended");
		fw.close();
}
		 catch(IOException e)
 {
 System.out.println("File append error");
 }
}


	        
	    
	 public static void modifyDataInFile() throws IOException
	    {
	             FileOutputStream file = new FileOutputStream("C:\\Users\\bara3134\\Barath\\Test1.txt");
	             String modify = "msd.";
	             byte[] b = modify.getBytes();
	             file.write(b);
	             file.close();
	             System.out.println("Modification Complete");
	             FileInputStream file1 = new FileInputStream("C:\\Users\\bara3134\\Barath\\Test1.txt");
	             int i;
	             while((i=file1.read())!=-1)
	             {
	             System.out.print((char)i);
	             }
	             file1.close(); 
	        
	    }
	 public static void readDataFromFile()
	    {
		 File file= new File("C:\\Users\\bara3134\\Barath\\Test1.txt");

	        try 
	        {
	            FileReader reader = new FileReader(file);
	           
	            char[] ch=new char[(int) file.length()];
	            //System.out.println(ch.length);
	            reader.read(ch);
	            for(char c: ch)
	            {
	                System.out.print(c);
	            }
	        }
	        catch (FileNotFoundException e) 
	        {
	            e.printStackTrace();
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	    }
//	 public static void readDataFromFile()
//	    {
//	 File file= new File("C:\\Users\\bara3134\\Barath\\Test.txt");
//
//	 try
//     {
//	
//         Scanner sc=new Scanner(file);
//         while(sc.hasNextLine())
//         {
//             System.out.println(sc.nextLine());
//         }
//     }catch(IOException e)
//     {
//         System.out.println("Error");
//     }
//	    }
	 
public static void copyFile()
{ 
try 
 
{
 InputStream input=new FileInputStream("C:\\Users\\bara3134\\Barath\\Test1.txt");

 OutputStream output=new FileOutputStream("C:\\Users\\bara3134\\Barath\\Test.txt");
	  int content=input.read();
	 while(content != -1)
	 {
	 output.write(content);
	  content=input.read();
}
output.flush();
 }
catch (IOException e) 
{
    e.printStackTrace();
}
	 
}
public static void moveFile()
{
	 File file= new File("C:\\Users\\bara3134\\Barath\\Test.txt");
boolean moveFile1=file.renameTo(new File("d:\\Success",file.getName()));
    System.out.println("File Moved: "+moveFile1);
}

public static void deleteFile() {
	File file= new File("C:\\Users\\bara3134\\Barath\\Test.txt");
	file.delete();
	boolean present=file.exists();
	System.out.println("File is Deleted:"+present);

		
	}
//Listing all files and folders in directory
public static void showallfiles() {
File file = new File("C:\\Users\\bara3134\\Barath");
String[] listoffilesfolders=file.list();
for(int i=0;i<listoffilesfolders.length;i++) {
	System.out.println(listoffilesfolders[i]);
}}
//listing only files
public static void listingonlyfiles() {
	File file=new File("C:\\Users\\bara3134\\Barath");
	File[] fileList=file.listFiles();
	for(File f:fileList)
	if(	f.isFile())
		System.out.println(f);
}

//listing only folders
public static void listingonlyfolders() {
	File file=new File("C:\\Users\\bara3134\\Barath");
	File[] fileList=file.listFiles();
	for(File f:fileList)
	if(	f.isDirectory())
		System.out.println(f);
}
//listing only .txt
public static void listingtxtfiles() {
	File file=new File("C:\\Users\\bara3134\\Barath");
File[] filefolderArray=	file.listFiles();
for(File f:filefolderArray) {
	if(f.isFile()) {
	String fileName=f.getName();
int lastDot=	fileName.lastIndexOf(".");
String extension=fileName.substring(lastDot+1);
if(extension.equals("txt"));
System.out.println(fileName);}

	
}}
//listing only 5mb  files
public static void showingsize() {
	File file=new File("C:\\Users\\bara3134");
	File[] filefolderArray=	file.listFiles();
	for(File f:filefolderArray) {
		if(f.isFile()) {
		String fileName=f.getName();
	int lastDot=	fileName.lastIndexOf(".");
	String extension=fileName.substring(lastDot+1);
	
if(f.length()>20)
	System.out.println(fileName+"Size :"+f.length());}

}

}
//FileWriting
public static void fileWriting() {
	File file= new File("C:\\Users\\bara3134\\Barath\\abc.txt");
	try {
		file.createNewFile();
		FileWriter writer=new FileWriter(file);
		writer.write(97);
		writer.write("How are you");
		writer.flush();
		writer.close();
		//filereader
		
//	1.)	FileReader fr= new FileReader(file);
//	int output=	fr.read();
//	while(output!=-1) {
//		System.out.println((char)output);
//		output=fr.read();
//		
//	}
		FileReader fr= new FileReader(file);
		char[] ch=new char[(int)file.length()];
		System.out.println(ch.length);
		fr.read(ch);
		for(char ch1:ch)
			System.out.println(ch1);
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}


}

		

	


