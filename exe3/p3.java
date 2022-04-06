/*Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ information and Search for an employee given eNo, using the concept of Array of Objects.*/


import java.util.*;
class emp
{
int eno,esal;
String ename;
void setdata(int a,String b,int c)
{
eno=a;
ename=b;
esal=c;
}
}
class p3{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
           
           
            System.out.print("Enter Number of Employees: ");
             int n=s.nextInt();
            emp obj[]=new emp[n];
          for(int j=0;j<n;j++)
             obj[j]=new emp();
             int a,f=0;
             String b;
             int c,i;
            for(i=0;i<n;i++)
            {
             System.out.println("Enter Employee number,Employee name,Salary of person : "+(i+1));
             a=s.nextInt();
             b=s.next();
             c=s.nextInt();
             obj[i].setdata(a,b,c);
             
             }

                     

             System.out.println("Enter person id to search: ");
             int id=s.nextInt();

                        

              for(i=0;i<n;i++)
                {
                  if(id==obj[i].eno)
                  {
                   System.out.println("Person exists in the list ");
                    f=1;
                    break;
                   }
          
                }
            if(f==0)
               System.out.println("Person not found ");
}
}


/*
 output

Enter Number of Employees: 3
Enter Employee number,Employee name,Salary of person : 1
1
anu
3000
Enter Employee number,Employee name,Salary of person : 2
2
vinu 
2000
Enter Employee number,Employee name,Salary of person : 3
3
sanu
50000
Enter person id to search: 
3
Person exists in the list 

Enter Number of Employees: 3
Enter Employee number,Employee name,Salary of person : 1
1
anu
3000
Enter Employee number,Employee name,Salary of person : 2
2
vinu 
2000
Enter Employee number,Employee name,Salary of person : 3
3
sanu
50000
Enter person id to search: 
4
Person not found 

*/

