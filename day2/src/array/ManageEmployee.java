package array;

import java.util.Scanner;

class Employee 
{
	
	private String empid;
	private String fname;
	
	//to make cons: right click ->source ->generate constructor using fields

	public Employee(String empid, String fname) 
	{
		this.empid = empid;
		this.fname = fname;
	}
	
	//to make toString() :right click->source ->generate toString()
@Override
public String toString() {
	return "Employee [empid=" + empid + ", fname=" + fname + "]";
}
}

public class ManageEmployee {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of Employeees");
		int count=sc.nextInt();
		String empno,ename;
		Employee []emps=new Employee[count];
		
		for(int i=0;i<emps.length;i++)
		{
			System.out.println("enter empinfo" +(i+1));
			System.out.println("empno and name:");
			empno=sc.next();
			ename=sc.next();
			emps[i]=new Employee(empno,ename);
		}
		System.out.println("employee records are");
		for(Employee emp :emps)
		{
			System.out.println(emp);
		}
	}
}
		/*
		 
		emps[0]=new Employee("E001","rani");
		emps[1]=new Employee("E002","raja");
				System.out.println(emps[0]);
		System.out.println(emps[1]);
		
	}
}
*/