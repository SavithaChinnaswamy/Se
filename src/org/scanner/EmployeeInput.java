package org.scanner;
import java.util.Scanner;

public class EmployeeInput
{
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		
		System.out.println("1. What is the empID ?");
		int empID = SC.nextInt();
		System.out.println("Ans: empId is " + empID);
		
		SC.nextLine();
		
		System.out.println("2. What is empName ?");
		String empName = SC.nextLine();
		System.out.println("Ans: empName is " + empName);
		
		System.out.println("3. What is EmpEmail ? ");
		String EmpEmail =SC.nextLine();
		System.out.println("Ans : EmpEmail is " + EmpEmail);
		
		System.out.println("4. What is EmpPhoneno ?");
		long EmpPhoneno = SC.nextLong();
		System.out.println("Ans : EmpPhoneno is " +EmpPhoneno);
		
		System.out.println("5. What is EmpSalary ?");
		float EmpSalary = SC.nextFloat();
		System.out.println("ANS : EmpSalary is " + EmpSalary);
		
		SC.nextLine();
		
		System.out.println("6. What is empGender ?");
		String empGender = SC.next();
	    System.out.println("ANS : empGender is " + empGender);
	    
	    SC.nextLine();
	    
	    System.out.println("7. What is empCity ?");
	    String empCity = SC.nextLine();
	    System.out.println("ANS : empCity is " + empCity);   	
	}
}
