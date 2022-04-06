//recursive binary search
import java.util.*;

class Recursive2
{
int bisearch(int f,int l,int x,int arr[])//recursive fun
{

if(l>=f)
{
int mid=(f+l)/2;
if(arr[mid]==x)//case of match
return mid;

if(x>arr[mid])
return bisearch(mid+1,l,x,arr);//case of right side
return bisearch(f,mid-1,x,arr);//case of left side
}
return -1;
}
public static void main(String args[]){
            
           
           Recursive2 obj=new Recursive2();
Scanner s=new Scanner(System.in);
            int i;
 System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];
               
             System.out.println("Enter the elements in sorted order : ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();
             
System.out.print("\n");
           
           int k=obj.bisearch(0,n-1,a,arr);//invoking bisearch
          if(k==-1)
          System.out.print("Element Not Found");
          else
            System.out.print("Element Found At Index : "+k);
           
           
}

}



/* 
output
Enter Number of elements: 5
Enter the elements in sorted order : 
1
2
3
4
5
Enter the element to search: 3

Element Found At Index : 2

Enter Number of elements: 3
Enter the elements in sorted order : 
1
2
3
Enter the element to search: 4

Element Not Found
*/
