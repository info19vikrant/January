package Anku;

import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);;
	int empId, total_leaves,paid_leaves=2,sick_leaves=2,casual_leaves=2;
	String empName;
	double total_salary;
    static int bal_leaves;
	public void data_in() {
		
		System.out.println("Enter the employee id");
		empId = sc.nextInt();
		System.out.println("Enter Employee name");
		empName = sc.next();
		
		System.out.println("Enter total salary");
		total_salary = sc.nextDouble();
	}

	public void calcutate_balance_leaves() {
		char lt;
		int nl;
		boolean chk;
		System.out.println("Enter the type of leave");
		System.out.println("Enter 'p' for paid leave");
		System.out.println("Enter 's' for sick leave");
		System.out.println("Enter 'c' for casual leave");
		lt=sc.next().charAt(0);
		System.out.println("Enter no of leaves");
		nl=sc.nextInt();
		chk=avail_leaves(nl,lt);
		if(chk==true){
			total_leaves=paid_leaves+sick_leaves+casual_leaves;
			System.out.println(total_leaves+"total leaves are available");
		}
	    
        
	}
	boolean avail_leaves(int no_of_leaves,char type_of_leave)
	{
		switch(type_of_leave){
		case 'p':
		{
			if(paid_leaves>0){
				System.out.println("leave granted");
				paid_leaves=paid_leaves-no_of_leaves;
				System.out.println(paid_leaves+"more paid  leaves are available");
				return true;
			}
			else{
				System.out.println("No paid leave is available");
		         return false;
			}}
		
		case 's':
		{
			if(sick_leaves>0){
				System.out.println("leave granted");
				sick_leaves=sick_leaves-no_of_leaves;
				System.out.println(sick_leaves+"more sick leaves are available");
				return true;
				
			}
			else{
				System.out.println("No sick leave is available");
			 return false;
		}}
		
		case 'c':
		{
			if(casual_leaves>0){
				System.out.println("leave granted");
				casual_leaves=casual_leaves-no_of_leaves;
				System.out.println(casual_leaves+"more casual leaves are available");
				return true;
			}
			else{
				System.out.println("No casual leave is available");
			 return false;
		}}
		default:
			System.out.println("wrong choice");
		
		}
		return false;
	    }
	public static void main(String args[])
	{
		Employee ob=new Employee();
		ob.data_in();
		ob.calcutate_balance_leaves();
		
	}
		}
