/*
2. Find the average of N positive integers, raising a user defined exception for each negative input.
*/



import java.util.*;
class myException extends Exception
{
	public myException(String s)
           {
	     super(s);
           }

}

class Excep2 
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items : ");
		int n=sc.nextInt();

		int d;
		int total=0;
		int c=0;
		System.out.println("Enter numbers : ");
		for(int i=0;i<n;i++)
		{
		    d = sc.nextInt();
	try
	{
		if(d>=0)
		{
		    c++;
		    total=total+d;
		}
		else
		{	
			throw new myException("Negative numbers not allowed");
		}

	}

	catch(myException ex)
	{
		System.out.println(ex.getMessage()+"\n");

}

}
System.out.println("Average of " + c + " positive numbers="+(double)total/c);

}

}



/*

OUTPUT

Enter the number of items : 
3
Enter numbers : 
7
8
15
Average of 3 positive numbers=10.0

ksb@ksb-Lenovo-Product:~/ambili/java/exe7$ java Excep2
Enter the number of items : 
3  
Enter numbers : 
-5
Negative numbers not allowed

*/
