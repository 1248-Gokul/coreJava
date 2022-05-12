package com.chainsys.StringArrayList;
import java.util.*;
public class LinkedListDemo {
	private static Iterator<String> StringIterator = null;
	public static void nain(String args[]) {
		LinkedList<String> StringLinkedList = new LinkedList();
		StringLinkedList.add("F");
		StringLinkedList.add("B");
		StringLinkedList.add("D");
		StringLinkedList.add("E");
		StringLinkedList.add("C");
		StringLinkedList.add("F");
		StringLinkedList.add("B");
		StringLinkedList.add("D");
		StringLinkedList.add("E");
		StringLinkedList.add("C");
		StringLinkedList.addLast("Z");
		StringLinkedList.addFirst("A");
		StringLinkedList.add(1, "A2");
		Iterator<String> Stringiterator=StringLinkedList.iterator();
		while(StringIterator.hasNext()) {
			System.out.print(StringIterator.next() + " ");
		}
		StringLinkedList.remove("Z");
		StringLinkedList.remove(2);
		StringIterator=StringLinkedList.iterator();
		while(StringIterator.hasNext()) {
			System.out.print(StringIterator.next()+ " ");
		}
		StringLinkedList.removeFirst();
		StringLinkedList.removeLast();
		StringIterator=StringLinkedList.iterator();
		while(StringIterator.hasNext()) {
			System.out.print(StringIterator.next() + " ");
		}
		}

}
