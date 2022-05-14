/*Write a Java program to find the number of days in a month for a given year.
Check Leap year also.*/
import java.util.Scanner;
public class Days{

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int Month = 0; 
        String MonthOfName = "";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                Month = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                   Month = 29;
                } else {
                 Month = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                Month = 31;
                break;
            case 4:
                MonthOfName = "April";
              Month = 30;
                break;
            case 5:
                MonthOfName = "May";
               Month = 31;
                break;
            case 6:
                MonthOfName = "June";
                Month = 30;
                break;
            case 7:
                MonthOfName = "July";
               Month = 31;
                break;
            case 8:
                MonthOfName = "August";
                Month = 31;
                break;
            case 9:
               
                Month = 30;
                break;
            case 10:
                MonthOfName = "October";
             Month = 31;
                break;
            case 11:
                MonthOfName = "November";
                Month = 30;
                break;
            case 12:
                MonthOfName = "December";
                Month = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + Month + " days\n");
 

if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
else
         System.out.println("Specified year is not a leap year");
}
} 





/*2. Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implementsthe above interface. Create a menu driven program to find area and perimeter of objects.*/


import java.util.*;
interface total          //interface for total
{
    void input();
    void area();
    void perimeter();
}

class Circle implements total           //circle implements total
{
    int r=0;
    double pi=3.14;
    double area=0;
    double perimeter=0;
   
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter radius: ");
        r=in.nextInt();
    }
   
    public void area()
    {
        area=pi*r*r;
        System.out.println("area of circle: " + area);
    }
   
    public void perimeter()
    {
        perimeter=2*pi*r;
        System.out.println("perimeter of circle: " + perimeter);
    }
}


class Rectangle implements total                         //rectangle implements total
{
    int l=0,b=0;
    double area=0;
    double perimeter=0;
   
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter length: ");
        l=in.nextInt();
        System.out.print("Enter breadth: ");
        b=in.nextInt();
    }
   
    public void area()
    {
        area=l*b;
        System.out.println("area of rectangle: " + area);
    }
   
    public void perimeter()
    {
        perimeter=2*(l+b);
        System.out.println("perimeter of rectangle: " + perimeter);
    }
}


class shape
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Circle obj1 = new Circle();                //object for circle and rectangle
        Rectangle obj2 = new Rectangle();
       
        while(true)
        {
            System.out.println("\n1.Circle\n2.Rectangle\n3.Exit\nEnter your choice\n\n");
             int c=in.nextInt();
            switch(c)
            {
                case 1: obj1.input();
                    obj1.area();
                    obj1.perimeter();
                    break;
                case 2: obj2.input();
                    obj2.area();
                    obj2.perimeter();
                    break;
                case 3:System.exit(0);
                      default:System.out.println("invalid");
            }
        }
    }
}


/*
______________________________output______________________________
1.Circle
2.Rectangle
3.Exit
Enter your choice
1
Enter radius: 2
area of circle: 12.56
perimeter of circle: 12.56
1.Circle
2.Rectangle
3.Exit
Enter your choice
2
Enter length: 3
Enter breadth: 4
area of rectangle: 12.0
perimeter of rectangle: 14.0
1.Circle
2.Rectangle
3.Exit
Enter your choice
3
*/
