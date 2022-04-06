/* 2. Write a program to search an element in an array using
	a) linear search
	b) simple binary search
	c) recursive binary search
	d) using Arrays .binarySearch ( ) */

//linear search
import java.util.*;
class Linear2{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int i,k=0;
            System.out.print("Enter Number Of Elements: ");
            int n=s.nextInt();
            int arr[]=new int[n];//declaring array
            System.out.print("Enter The Elements:\n ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();//reading values
             }
             System.out.print("Enter The Element To Search: ");
             int a=s.nextInt();
System.out.print("\n");             

              for( i=0;i<n;i++)
                {
                  if(a==arr[i])//comparing
                  {
                   System.out.println("Item Found At Index : " +i);
                   k=1;//setting flag
                    break;
                   }
          
                }
 if(k==0)
             {
               System.out.print("Iten Not Found at Index \n  ");
              }
             
}
}



/*
output

Enter Number Of Elements: 5
Enter The Elements:
 1
2
3
4
5
Enter The Element To Search: 3

Item Found At Index : 2

Enter Number Of Elements: 4
Enter The Elements:
 1
2
3
4
Enter The Element To Search: 1

Item Found At Index : 0

Enter Number Of Elements: 3   
Enter The Elements:
 1
2
3
Enter The Element To Search: 4

Iten Not Found at Index

*/
