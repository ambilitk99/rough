/*Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.*/


import java.util.*;
class Sort
{
public static void main(String args[])
{

Scanner in=new Scanner(System.in);

System.out.println("Enter the 3 numbers:");
int x=in.nextInt();
int y=in.nextInt();
int z=in.nextInt();

if(x>y && y>z)
{

	System.out.println("Numbers are increacing order");
}

else if(x<y && y<z)
{
	System.out.println("Numbers are decreacing order");
}
else
{
	System.out.println("Neither increasing or decreasing order");
}
}
}



/*Enter the 3 numbers:
3
2
1
Numbers are increacing order*/

