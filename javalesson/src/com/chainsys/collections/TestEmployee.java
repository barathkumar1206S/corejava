package com.chainsys.collections;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Employee firstemp=new Employee(111);
Employee secondemp=new Employee(111);
System.out.println(firstemp.hashCode());
System.out.println(secondemp.hashCode());
boolean result=firstemp.equals(firstemp);
System.out.println(result);
result=firstemp.equals(firstemp);
System.out.println(result);

		

	}

}
