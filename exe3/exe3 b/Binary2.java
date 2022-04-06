//simple binary search

import java.util.*;
class Binary2{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int i;
            
            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];
               int k=0;
             System.out.print("Enter the elements in sorted order:\n ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();

             
System.out.print("\n");  
           
             int f=0,l=n-1,mid=(f+l)/2;
            while(f<=l)
             {
              if(a>arr[mid])
               {
                 f=mid+1;
                 mid=(f+l)/2;
                }
               else if(a<arr[mid])
              {
                 l=mid-1;
                 mid=(f+l)/2;
                 
               }
             else//case of match
              {
               System.out.print("Element Found At Index : "+mid);
              k=1;
                break;
                
               }


             }
             if(k==0)
             {
               System.out.println("Element Not Found At Index ");
              }
             



}
}


/*
output
Enter Number of elements: 5
Enter the elements in sorted order:
 1
2
3
4
5
Enter the element to search: 4

Element Found At Index : 3
Enter Number of elements: 3
Enter the elements in sorted order:
 1
2
3
Enter the element to search: 4

Element Not Found At Index 
*/

