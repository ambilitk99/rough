/* 1. Define a class ‘product’ with data members pcode, pname and price.
Create 3 objects of the class and find the product having the lowest
price.*/


import java.util.*;
class Products
{
    int pcode;
    String pname;
    double price;
    void setdata(int a,String b,double c) // initialising the values
          {
            pcode=a;
            pname=b;
            price=c;
       
          }




    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in ) ;
        int a1,a2,a3;
        String b1,b2,b3;
        double c1,c2,c3;
        Products ob1=new Products();
        Products ob2=new Products();
        Products ob3=new Products();

       
        System.out.println("Enter the product 1 pcode,pname,price: ");
        a1=in.nextInt();
                b1=in.next();
        c1=in.nextDouble();
                ob1.setdata(a1,b1,c1);

        System.out.println("Enter the product 2 pcode,pname,price: ");
        a2=in.nextInt();
                b2=in.next();
        c2=in.nextDouble();
                ob2.setdata(a2,b2,c2);

        System.out.println("Enter the product 3 pcode,pname,price: ");
        a3=in.nextInt();
                b3=in.next();
        c3=in.nextDouble();
                ob3.setdata(a3,b3,c3);

        System.out.println("Lowest price product:");
        if(ob1.price<ob2.price && ob1.price<ob3.price)  
              System.out.println(" Product code= " +ob1.pcode+" , Product name="+ob1.pname+" , price="+ob1.price);
        if(ob2.price<ob1.price && ob2.price<ob3.price)  
              System.out.println(" Product code= " +ob2.pcode+" , Product name="+ob2.pname+" , price="+ob2.price);
        if(ob3.price<ob1.price && ob3.price<ob2.price)  
              System.out.println(" Product code= " +ob3.pcode+" , Product name="+ob3.pname+" , price="+ob3.price);
    }
}





/*


output

Enter the product 1 pcode,pname,price: 
3
book
30
Enter the product 2 pcode,pname,price: 
3
pen
10
Enter the product 3 pcode,pname,price: 
6
bag
300
Lowest price product:
 Product code= 3 , Product name=pen , price=10.0


Enter the product 1 pcode,pname,price: 
1
apple
50
Enter the product 2 pcode,pname,price: 
2
orange
60
Enter the product 3 pcode,pname,price: 
3
banana
20
Lowest price product:
 Product code= 3 , Product name=banana , price=20.0
*/
