//Program to create a generic stack and do the Push and Pop operations.

import java.util.*;
class StackOperations<T>
{
	void push(ArrayList<T> arr,T item)
	{
		arr.add(item);
	}

	void pop(ArrayList<T> arr)
	{
		if(arr.isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
		int index = arr.size()-1;
		System.out.println("poped item is : "+arr.get(index));
		arr.remove(index);
		}
	}

	void Display(ArrayList<T> arr)
	{
		System.out.print("Stack : ");
		for(T elements :arr)
		{
			System.out.print(elements+"\t");
		}
		System.out.print("\n");
	}
}


class stack
{
	public static void main(String args[])
	{
	StackOperations s=new StackOperations();
	Scanner sc=new Scanner(System.in);
	ArrayList<String> sr=new ArrayList<String>();
	ArrayList<Integer> AI=new ArrayList<Integer>();

	while(true)
	{
		System.out.print("\n1.push\n2.pop\n3.Display\n4.exit\nSelect your choice : ");
		int ch=sc.nextInt();
				
		switch(ch)
		{
		case 1:System.out.print("Enter the item to push : ");
			 String item=System.console().readLine();
			 s.push(sr,item);
			 break;
					
		case 2:s.pop(sr);
			 break;
					
		case 3:s.Display(sr);
			 break;
					
		default:System.exit(0);				
		}
	}
	}
}



/*

OUTPUT:

1.push
2.pop
3.Display
4.exit
Select your choice : 3
Stack : 

1.push
2.pop
3.Display
4.exit
Select your choice : 2
Stack is Empty

1.push
2.pop
3.Display
4.exit
Select your choice : 1
Enter the item to push : 1

1.push
2.pop
3.Display
4.exit
Select your choice : 1
Enter the item to push : 3

1.push
2.pop
3.Display
4.exit
Select your choice : 1
Enter the item to push : 5

1.push
2.pop
3.Display
4.exit
Select your choice : 3
Stack : 1	3	5	

1.push
2.pop
3.Display
4.exit
Select your choice : 2
poped item is : 5

1.push
2.pop
3.Display
4.exit
Select your choice : 3
Stack : 1	3	

1.push
2.pop
3.Display
4.exit
Select your choice : 2
poped item is : 3

1.push
2.pop
3.Display
4.exit
Select your choice : 3
Stack : 1	

1.push
2.pop
3.Display
4.exit
Select your choice : 2
poped item is : 1

1.push
2.pop
3.Display
4.exit
Select your choice : 3
Stack : 

1.push
2.pop
3.Display
4.exit
Select your choice : 4


*/
