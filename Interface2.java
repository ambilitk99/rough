 /*
 2. Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu driven program to find area and perimeter of objects.
*/


import java.util.*;

interface AP
{
	void input();
	void perimeter();
	void area();
}

class Circle implements AP
{
	int r = 0;
	double pi = 3.14, ar = 0, peri = 0;
	public void input()
	{
		r = 4;
	}
	public void area()
	{
		ar = pi*r*r;
		System.out.println("Area of circle : "+ar);
	}
	public  void perimeter()
	{
		peri = 2*pi*r;
		System.out.println("Perimeter of circle : "+peri);
	}
}

class Rectangle extends Circle
{
	int l = 0, b = 0;
	double ar, peri;
	public void input()
	{
		super.input();
		l = 6;
		b = 4;
	}
	public void area()
	{
		super.area();
		ar = l*b;
		System.out.println("Area of rectangle : "+ar);
	}
	public void perimeter()
	{
		super.perimeter();
		peri = 2*(l+b);
		System.out.println("Perimeter of rectangle : "+peri);
		
	}
}

public class Interface2
{
	public static void main(String args[])
	{
		Rectangle obj = new Rectangle();
		do{
			Scanner ch = new Scanner(System.in);
			System.out.println("Caclulate Area and Perimeter of Circle and Rectangle");
			System.out.println("-----------------------------------------------------");
			System.out.println("\n1. Area\n2. Perimeter\n3. Exit\nChoose an option : ");
			int a = ch.nextInt();
			
			switch(a)
			{
			
				case 1:  
					obj.input();
					obj.area();
					System.out.println("-------------------------------");
					break;
				case 2:
					obj.input();
					obj.perimeter();
					System.out.println("-------------------------------");
					System.out.println(" ");
					break;

				default:
					System.out.println("Enter valid input");
					System.out.println("Exiting......");
					System.exit(0);
					break;
			}
		}while(true);
   

	}
}


