//Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.

import java.util.*;

class Array_List_8a
{
	public static void main(String args[]) 
	{
		// Create an array list.
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of al: " + al.size());

		// Add elements to the array list.
		al.add("Fathima");
		al.add("Aneetha");
		al.add("Shamil");
		al.add("Reema");
		al.add("Krishna");
		al.add("Vani");
		al.add(0, "Ambili");
		System.out.println("Size of al after additions: " + al.size());

		// Display the array list.
		System.out.println("Contents of al: " + al);

		// Remove elements from the array list.
		al.remove("Naseera");
		al.remove(2);
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
	}
}



/*

OUTPUT
------



Initial size of al: 0
Size of al after additions: 7
Contents of al: [Ambili, Fathima, Aneetha, Shamil, Reema, Krishna, Vani]
Size of al after deletions: 6
Contents of al: [Ambili, Fathima, Shamil, Reema, Krishna, Vani]


*/

