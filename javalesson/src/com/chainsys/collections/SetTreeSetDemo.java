package com.chainsys.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> ts=new TreeSet<String>();
ts.add("Cut");
ts.add("fun");
ts.add("Assam");
ts.add("Ball");
ts.add("dog");
ts.add("Aag");
ts.add("AAg");
ts.add("Event");
ts.add("Fan");
ts.add("Delhi");
ts.add("carrot");
ts.add("Ball");
ts.add("apple");
ts.add("boy");
ts.add("egg");
ts.add("fool");
System.out.println("Size "+ts.size());
Iterator<String> itr=ts.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
