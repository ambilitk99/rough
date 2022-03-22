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
