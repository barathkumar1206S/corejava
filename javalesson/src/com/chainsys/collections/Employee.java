package com.chainsys.collections;

import java.io.Serializable;

public class Employee  implements Serializable
{
    private final int id;
    public String Name;
    public Employee(int v1,String sName)
    {
        id=v1;
        Name=sName;
    }
    public int getID()
    {
        return id;
    }
    public String Name()
    {
        return Name;
    }
    @Override
    public boolean equals(Object obj)
    {
        Class c1=obj.getClass();//provide metadata about the class
        boolean flag=false;
        if(c1==this.getClass())
        {
            Employee other=(Employee) obj;
            if(this.hashCode()==other.hashCode())
                flag=true;
        }
        return flag;
    }
    
    public int hashcode()
    {
        return this.id;
    }
}