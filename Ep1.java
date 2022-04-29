


/*Create a class ‘Employee’ with data members Empid,Name, Salary,Addressand constructors to initialize thedata members.Create another class ‘Teacher’ that inheritthe properties of class employee and contain its own data
members department, Subjects taught and constructors to initialize these data members and also include display function to display all the data members. Use array of objects to display details of N teachers.*/


import java.util.*;

class Employee
{

	int empid;
	String name;
	float salary;
	String address;

	Employee()
	{
		
	}


	Employee(int id, String nm, float sal, String addr)
	{
		empid=id;
		name=nm;
		salary=sal;
		address=addr;
	}

}


class Teacher extends Employee
{

	String department;
	String subject;

	Teacher(int id, String nm, float sal, String addr, String dept, String sub)
	{
	
		empid=id;
		name=nm;
		salary=sal;
		address=addr;
		department=dept;
		subject=sub;
	}
	

void display()
{
	System.out.println("Employee id : "+empid);
	System.out.println("Employee name : "+name);
	System.out.println("Employee salary : "+salary);
	System.out.println("Employee address : "+address);
	System.out.println("Department of teacher : "+department);
	System.out.println("Subject of teacher : "+subject);
}

}




class Ep1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of teachers : ");
		int n = in.nextInt();

		Teacher[] obj = new Teacher[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter employee id : ");	
			int id = in.nextInt();
			System.out.println("Enter employee name : ");	
			String nm = in.next();
			System.out.println("Enter salary : ");	
			float sal = in.nextFloat();
			System.out.println("Enter address : ");	
			String addr = in.next();
			System.out.println("Enter department : ");	
			String dept = in.next();
			System.out.println("Enter subject : ");	
			String sub = in.next();
			obj[i] = new Teacher(id, nm, sal, addr, dept, sub);
		}
		System.out.println("-----------------Recorded details of employee-------------------");	
		for (int i=0; i<n; i++)
		{
			
			obj[i].display();
		}
}
}




























