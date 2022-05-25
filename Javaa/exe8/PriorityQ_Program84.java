


// 8.4- Program to demonstrate the creation of queue object using the PriorityQueue class


  



import java.util.*;

public class PriorityQ_Program84
{
	public static void main(String args[])
	{

		PriorityQueue<String> queue=new PriorityQueue<String>();

		queue.add("Aaliya");
		queue.add("Ambili");
		queue.add("Fathima");
		queue.add("Reema");
		System.out.println("Elements in Priority Queue : "+queue);
		
	}
}



/*

OUTPUT
---------


Elements in Priority Queue : [Aaliya, Ambili, Fathima, Reema]




*/
