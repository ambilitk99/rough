//Program to remove all the elements from a linked list

import java.util.*;

class Linked_List_8b
{
	public static void main(String args[])
	{
		// Create a linked list.
		LinkedList<String> ll = new LinkedList<String>();
		LinkedList<String> l = new LinkedList<String>();

		// Add elements to the linked list.
		ll.add("Aneetha");
		ll.add("Shamil");
		ll.add("Fathima");
		ll.add("Reema");
		
		ll.add("Alen");
		ll.addLast("Naseera");
		ll.addFirst("Amrutha");
		ll.add(0, "Ambili");
		System.out.println("Original contents of ll: " + ll);

		// Remove elements from the linked list.
		ll.removeAll(ll);
		System.out.println("Contents of ll after deletion using removeAll() method: " + ll);

		// Add elements to the linked list.
		l.addFirst("Amrutha");
		l.addLast("Vani");
		l.add("Saranya");
		l.add("Aswin");
		l.add("Anand");
		l.add("Scissna");
		l.add("Hasna");
		
		
		
		l.add(1, "Janan");
		System.out.println("Original contents of l: " + l);
		l.clear();
		System.out.println("Contents of l  after deletion using clear() method: " + l);
	}
}



/*

OUTPUT
-------


Original contents of ll: [Ambili, Amrutha, Aneetha, Shamil, Fathima, Reema, Alen, Naseera]
Contents of ll after deletion using removeAll() method: []
Original contents of l: [Amrutha, Janan, Vani, Saranya, Aswin, Anand, Scissna, Hasna]
Contents of l  after deletion using clear() method: []


*/




