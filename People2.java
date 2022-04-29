/*
Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class ‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification, Salary and its own constructor. 
Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data members like Subject, Department, Teacherid and also contain constructors and methods to display the data members.
Use array of objects to display details of N teachers.
*/




import java.util.*;
class Person{  //create class Person
	String Name;
	String Gender;
	int Age;
	String Address;
	
	 Person(String gen,String name,int age,String add){
			Gender=gen;
			Name=name;
			Age=age;
			Address=add;
}

}
class Employee extends Person { 	//create class Employee that inherit person
	int Empid;
	String Company_name;
	String Qualification;
	double Salary;
	
	Employee(String gen,String name,int age,String add,int id,String c_n,String qu, double sal){			//constructor of Employee
		super(gen,name,age,add);
		Empid=id;
		Company_name=c_n;
		Qualification=qu;
		Salary=sal;
		
	}
	
}

class Teacher extends Employee { 	//create class Teacher that inherit Employee 

	String Sub;
	String Dpt;
	int T_id;
	Teacher(String gen,String name,int age,String add,int id,String c_n,String qu, double sal,String dpt,String sub,int tid){
		super(gen,name,age,add,id,c_n,qu,sal);
		
		Sub=sub;
		Dpt=dpt;
		T_id=tid;
		
	
	
	}
	
	

void display(){  	//method fo display all data members of all classes
  System.out.println("\nName:"+super.Name+"\nGender :"+super.Gender+"\nAge: "+super.Age+"\nAddress:"+super.Address);
  System.out.println("\nEmp id: "+Empid+"\nCompany name:"+Company_name+"\nQualification: "+Qualification+"\nSalary: "+Salary);
		
  System.out.println("\nTearchers id: "+T_id+"\nDepartment: "+Dpt+"\nSubject: "+Sub);
  System.out.println("-------------------------------");
	

	}

}

class People2 {  //Main class

	public static void main(String args[]){		//main method
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the no.of Teacher: ");
		int n=obj.nextInt();
	
			
		  Teacher[] arr=new Teacher[n];	//Allocating memory for n objects of type Teacher
			
		  for(int i=0;i<n;i++)
                  {

			System.out.println("\nEnter the details of Teacher "+(i+1));
					
					
			System.out.print("\nEnter Name: ");
			String name=obj.next();
					
			System.out.print("Enter Gender: ");
			String gen=obj.next();
			System.out.print("Enter Age: ");
			int age=obj.nextInt();
					
			System.out.print("Enter Address: ");
			String ad=obj.next();
					    
			System.out.print("\nEnter Emp id: ");
			int id=obj.nextInt();
					
			System.out.print("Enter Company name: ");
			String cname=obj.next();
					
			System.out.print("Enter Qualification: ");
			String qu=obj.next();					
					
			System.out.print("Enter Emp salary: ");
			double sal=obj.nextDouble();
					
			System.out.print("\nEnter Tearchers id: ");
			int t_id=obj.nextInt();
					
			System.out.print("Enter Department: ");
			String dep=obj.next();

			System.out.print("Enter Subject: ");
			String sub=obj.next();
			
			arr[i]=new Teacher(gen,name,age,ad,id,cname,qu,sal,dep,sub,t_id); 			
//calling constructor of Teacher class and passing parameters
					
					
			System.out.println("-----------------------\n");
					
			}

		for(int j=0;j<n;j++){ 
			System.out.println("Details of Teacher-" +(j+1));
			System.out.println("-----------------------\n");

			arr[j].display();

		}
		
	}
		
}
















/*

OUTPUT 

Enter the no.of Teacher: 2

Enter the details of Teacher 1

Enter Name: sabna
Enter Gender: f
Enter Age: 32
Enter Address: calicut

Enter Emp id: 1
Enter Company name: abcd
Enter Qualification: mca
Enter Emp salary: 8000

Enter Tearchers id: 2
Enter Department: mca
Enter Subject: java
-----------------------


Enter the details of Teacher 2

Enter Name: Ajay
Enter Gender: m
Enter Age: 47
Enter Address: kozhikode

Enter Emp id: 4
Enter Company name: abcd
Enter Qualification: mca
Enter Emp salary: 90000

Enter Tearchers id: 3
Enter Department: mca
Enter Subject: network
-----------------------

Details of Teacher-1
--------------------

Name:sabna
Gender :f
Age: 32
Address:calicut

Emp id: 1
Company name:abcd
Qualification: mca
Salary: 8000.0

Tearchers id: 2
Department: mca
Subject: java
-------------------------------
Details of Teacher-2
--------------------------

Name:Ajay
Gender :m
Age: 47
Address:kozhikode

Emp id: 4
Company name:abcd
Qualification: mca
Salary: 90000.0

Tearchers id: 3
Department: mca
Subject: network

*/
