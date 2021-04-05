package day4_task;

import java.util.Scanner;

public class HRSystem {

	public static void main(String[] args) {
		Employee ob = new Employee();
		int id,s,e;
		String name,project;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id : ");
		id=sc.nextInt();
		System.out.println("Enter employee name : ");
		name=sc.next();
		System.out.println("Enter employee project : ");
		project=sc.next();
		System.out.println("Enter employee salary : ");
		s=sc.nextInt();
		System.out.println("Enter employee experience : ");
		e=sc.nextInt();
		ob.setEmpId(id);
		ob.setEmpName(name);
		ob.setProjectName(project);
		ob.setSalary(s);
		ob.setExp(e);
		ob.workingOnProject();
		
		
		
	}
}
