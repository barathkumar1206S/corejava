package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListArrayListDemo {
	public static void usingstringarraylist() {
		ArrayList<String> stringarraylist = new ArrayList<String>();
		System.out.println("initial size of stringarraylist:" + stringarraylist.size());
		try {
			stringarraylist.add("car");
			stringarraylist.add("auto");
			stringarraylist.add("egg");
			stringarraylist.add("box");
			stringarraylist.add("doll");
			stringarraylist.add("fan");
			// will insert a new value,
			// pushing the current value of index 1 to the next index
			stringarraylist.add(1, "animal");
			stringarraylist.add("girl");
			stringarraylist.add("fan");
			System.out.println("size of stringarraylist after addition:" + stringarraylist.size());
			System.out.println("contents of stringarraylist:" + stringarraylist);
			// will replace he value in index 2
			stringarraylist.set(2, "xenas");
			System.out.println("after set(2):" + stringarraylist);
			System.out.println("lastindex of:'fan'" + stringarraylist.lastIndexOf("fan"));
			// remove the first instance of 'fan'
			stringarraylist.remove("fan");
			stringarraylist.remove(2);
			System.out.println("size after remove(2):" + stringarraylist.size());
			System.out.println("cotents of stringarralist:" + stringarraylist);
			// will reduce the capacity
			stringarraylist.trimToSize();
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}

	}

	public static void lessonArrayList() {
		ArrayList<Employee> empArrayList = new ArrayList<Employee>(30);
		System.out.println("IntiempArrayList size of empArrayList :" + "empArrayList: " + empArrayList.size());
		try {
			for (int i = 0; i < 5; i++) {
				Employee e1 = new Employee(i);
				e1.Name = "Emp" + i;
				empArrayList.add(e1);
			}
			System.out.println("Size of empArrayList after additions: " + empArrayList.size());
			Employee e3 = (Employee) empArrayList.get(4);
			empArrayList.add(e3);
			System.out.println("Size of empArrayList after additions: " + empArrayList.size());

			empArrayList.add(new Employee(4));
			System.out.println("Freq of [Employee id-4] in ArrayList-" + Collections.frequency(empArrayList, e3));
			Iterator<Employee> empIterator = empArrayList.iterator();
			while (empIterator.hasNext()) {
				Object element = empIterator.next();// return current object
				Employee e1 = (Employee) element;
				System.out.println("\t" + e1.getID() + " " + e1.Name);
			}

		} catch (Exception err) {
			System.out.println("Error!!!" + err.getMessage());
		}
	}

}
