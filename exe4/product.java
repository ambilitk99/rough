/* 1. Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)and static nested class RAM (memory, manufacturer). Create an object of CPU and print information of Processor and RAM.*///PROGRAM FOR INNER CLASS CONCEPT



import java.util.*;

class product             //outer class

{


float price=10000;

void display()

{
System.out.println("Price: "+price);
processor p=new processor();     //Creating object for inner class processor 
p.display();
}

class processor                      //ineer class
{
int core=6;
String man="ACD";
void display()
{
System.out.println("Number Of Cores: "+core);
System.out.println("CPU Manufcture: "+man);
}

}

static class ram                   //static inner class
{
int size=4;
String manu="DELL";
void display()
{
System.out.println("RAM Size: "+size+ " GB");
System.out.println("RAM Manufacture: "+manu);
}
}

public static void main(String args[])
{
product obj=new product();                 //creating a object outer class

System.out.println("System Information");

System.out.println("\n");
obj.display();
product.ram obj2=new product.ram();                //Creating object for static inner class
obj2.display();
}
}








/*

output

System Information


Price: 10000.0
Number Of Cores: 6
CPU Manufcture: ACD
RAM Size: 4 GB
RAM Manufacture: DELL
*/








