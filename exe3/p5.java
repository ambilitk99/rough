import java.util.*;
class p5
{


void area(int a,int b)
{
System.out.println("AREA OF RECTANGLE: "+(a*b));
}
void area(int x)
{
System.out.println("AREA OF SQUARE: "+(x*x));
}

void area(float r,int i,int j)
{
System.out.println("AREA OF CIRCLE: "+(3.14*r*r));
}
 public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            
            
            p5 obj=new p5();
           System.out.println("1.RECTANGLE\n2.SQUARE\n3.CIRCLE\n\nEnter your Choice:  ");
           int ch=s.nextInt();
           int a,b,c,d,rad;
           float ar;

          
          switch(ch)
          {
           case 1:System.out.println("Enter length and breadth: ");
                  a=s.nextInt();
                   b=s.nextInt();
                   obj.area(a,b);
                   break;

            case 2:System.out.println("Enter length : ");
                  c=s.nextInt();
                   
                   obj.area(c);
                    break;

            case 3:System.out.println("Enter Radius : ");
                  rad=s.nextInt();
                   
                   obj.area(rad,0,0);
                    
                   break;
           default:System.out.println("INVALID INPUT.... ");
                     break;
           }


}
}


/* 

output

1.RECTANGLE
2.SQUARE
3.CIRCLE

Enter your Choice:  
1
Enter length and breadth: 
4
2
AREA OF RECTANGLE: 8

1.RECTANGLE
2.SQUARE
3.CIRCLE

Enter your Choice:  
2
Enter length : 
4
AREA OF SQUARE: 16

1.RECTANGLE
2.SQUARE
3.CIRCLE

Enter your Choice:  
4
INVALID INPUT.... 

1.RECTANGLE
2.SQUARE
3.CIRCLE

Enter your Choice:  
3
Enter Radius : 
4
AREA OF CIRCLE: 50.24
  */

