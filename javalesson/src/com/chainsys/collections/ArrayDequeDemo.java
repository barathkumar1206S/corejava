package com.chainsys.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> arraydeque=new ArrayDeque<String>();
        //Use an ArrayDeque like a stack
        arraydeque.push("A");
        arraydeque.push("B");
        arraydeque.push("X");
        arraydeque.push("Z");
        arraydeque.push("D");
        arraydeque.push("X");//duplicate value
        arraydeque.push("Z");//duplicate value
        arraydeque.push("E");
        arraydeque.push("F");
        System.out.println("Before popping the stack : " + arraydeque.size());
        //while(arraydeque.peek() != null)
        //{
            //System.out.println(arraydeque.pop() + " ");
            //System.out.println("After popping the stack :"+ arraydeque.size());
        //}
        Iterator<String> iterator=arraydeque.iterator();
        while(iterator.hasNext())
        {
            System.out.println("\t"+ iterator.next());
        }
        Iterator<String> striterator=arraydeque.descendingIterator();
        while(striterator.hasNext())
        {
            System.out.println("\t"+ striterator.next());
        }
        arraydeque.addFirst("H");
        arraydeque.addLast("I");
        iterator=arraydeque.iterator();
        while(iterator.hasNext()) {
        	System.out.println("\t"+iterator.next());
        }
        //PollFirst
        //Retrives and removes the first element of this deque,or
        //returns null if this deque is empty
        System.out.println("*******pollFirst: "+arraydeque.pollFirst());
        System.out.println(arraydeque);
        System.out.println("*******pollLast: "+arraydeque.pollLast());
        System.out.println(arraydeque);
        //PeekFirst
      //Retrives,but doesnot removes the first element of this deque,or
        //returns null if this deque is empty
        System.out.println("*******peekFirst: "+arraydeque.peekFirst());
        System.out.println(arraydeque);
        System.out.println("*******peekLast: "+arraydeque.peekLast());
        System.out.println(arraydeque);
        //removeFirst
        //Retrives and removes the first element of this deque,or
        // This method differs from pollFirst only in that it thros an exception
        //if this deque is empty.
        System.out.println("*******removeFirst: "+arraydeque.removeFirst());
        System.out.println(arraydeque);
        System.out.println("*******removeLast: "+arraydeque.removeLast());
        System.out.println(arraydeque);
        
        //---
        System.out.println("*******removeFirstOccurrence: "+arraydeque.removeFirstOccurrence("X"));
        System.out.println(arraydeque);
        System.out.println("*******removeLastOccurrence: "+arraydeque.removeLastOccurrence("Z"));
        System.out.println(arraydeque);

	}

}
