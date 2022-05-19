//Find the average of N positive integers, raising a userdefined exception for each negative input.



import java.util.Scanner;

class NegativeInputError extends Exception  //user defined exception
{  
    public NegativeInputError(String s)  
    {   
        super(s);                           // calling the constructor of parent Exception 
    }  
} 


class Pgm7b
{
    public static void main(String[] args) 
    {
        try 
        {
            Scanner sc=new Scanner(System.in);
            int lim,num;
            float sum=0;
            float avg=0;
            System.out.print("Enter the limit : ");
            lim=sc.nextInt();
            for (int i = 0; i < lim; i++) 
            {
                System.out.print("\nEnter number "+(i+1)+" : ");
                num=sc.nextInt();
                if (num < 0) 
                {
                    throw new NegativeInputError("Negative Numbers are not allowed");//throwing exception
                }
                else
                {
                    sum+=num;
                }
            }
            avg=sum/lim;
            System.out.println("\nAverage is : "+avg);
        } 
        
        catch (NegativeInputError ex) 
        {
        	System.out.println("\nCaught the exception");  
            System.out.println("Exception occured: " + ex);  
        }
    }    
}



/*

Output:

Enter the limit : 4

Enter number 1 : 1
Enter number 2 : 2
Enter number 3 : 3
Enter number 4 : 4

Average is : 2.5



Enter the limit : 4

Enter number 1 : 2
Enter number 2 : 3
Enter number 3 : -4

Caught the exception
Exception occured: NegativeInputError: Negative Numbers are not allowed

*/

