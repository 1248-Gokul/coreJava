package com.chainsys.StringArrayList;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
	public static void main(String args[])
	{
		ArrayDeque<String> arraydeque=new ArrayDeque<String>();
		//use an ArrayDeque like stack.
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");//Duplicate Value
		arraydeque.push("Z");//Duplicate value
		arraydeque.push("E");
		arraydeque.push("F");
		
//		System.out.println("Before popping the Stack : "+arraydeque.size());
//		while(arraydeque.peek() != null)
	//		System.out.println(arraydeque.pop() + " ");
		
	//	System.out.println("After popping the stack: "+arraydeque.size());
		
	//	System.out.println("Before popping the Stack : "+arraydeque.size());
		Iterator<String> iterator =arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println("\t"+ iterator.next());
		}

		Iterator<String> striterator =arraydeque.descendingIterator();
		while(striterator.hasNext()) 
		{
			System.out.println("\t" +striterator.next());
		}
		arraydeque.addFirst("H");
		arraydeque.addFirst("i");
		iterator =arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println("\t"+iterator.next());
		}
		//pollFirst
		//retrieves and removes the first element of this deque,or
		//returns null if this dequeue is empty
		System.out.println("***********PollFirst: "+arraydeque.pollFirst());
		System.out.println(arraydeque);
		System.out.println("***********PollLast: "+arraydeque.pollLast());
		System.out.println(arraydeque);
		
		
		System.out.println("***********PeekFirst: "+arraydeque.peekFirst());
		System.out.println(arraydeque);
		System.out.println("***********PeekLast: "+arraydeque.peekLast());
		System.out.println(arraydeque);
		//pollFirst
		//retrieves and removes the first element of this deqeue,or
		//returns null if this dequeue is empty
		System.out.println("***********RemoveFirst: "+arraydeque.removeFirstOccurrence("X"));
		System.out.println(arraydeque);
		System.out.println("***********RemoveLast: "+arraydeque.removeLastOccurrence("Z"));
		System.out.println(arraydeque);
		
		
		
		
	}
}
