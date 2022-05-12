package com.chainsys.file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.chainsys.collections.Employee;

public class Readobj
{
    public static void main(String arg[])throws Exception
    {
         FileInputStream fis = new FileInputStream("C:\\Users\\bara3134\\Barath\\Test1.txt");
         ObjectInputStream ois = new ObjectInputStream(fis) ;
          Employee ob =null;
         try
        {
            ob = (Employee) ois.readObject();
        }
        catch(Exception e)
        {
            System.out.println("Exception during deserialization: " +e);
        }
        finally
        {
            try
            {
                ois.close();
            }
            catch(Exception e)
            {
                System.out.println("Exception during ois close: " + e);
            }
        }
        if(null!=ob)
        {
        	System.out.println(ob.getID() +" "+ ob.Name);


            System.out.println("HashCode "+ob.hashCode());            
}
}
}