//CS 280 Assignment 1
//Creator: Nicole Lyu

import java.util.Scanner;
public class AdministratorTest {
	
	

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the employee's name: ");
		String newName=kb.nextLine();
		
		System.out.println("Enter the hire date for "+newName+" below -");
		System.out.println("Enter month: ");
		String newMonth = kb.nextLine();
		System.out.println("Enter day: ");
		int newDay = kb.nextInt();
		System.out.println("Enter year: ");
		int newYear = kb.nextInt();
		Date hireTime = new Date(newMonth,newDay,newYear);
		
		System.out.println("Enter salary per year: ");
		double newSalary=kb.nextDouble();
		kb.nextLine();
		
		SalariedEmployee hehe = new SalariedEmployee(newName, hireTime,newSalary);
		
		
		System.out.println("Enter the title for "+hehe.getName());
		String newTitle=kb.nextLine();
		
		System.out.println("Enter the area of responsibility for "+hehe.getName());
		String newResponsibility=kb.nextLine();
		
		System.out.println("Enter the immediate supervisor for "+hehe.getName());
		String newSupervisor=kb.nextLine();
		
		
		Administrator one = new Administrator(newTitle,newResponsibility, newSupervisor);
		Administrator two = new Administrator(hehe.getName(), hehe.getHireDate( ),hehe.getSalary(), one.getTitle(),one.getResponsibility(), one.getSupervisor());
				
		System.out.println("\nThe 3-argument:\n");
		System.out.println(one);
		System.out.println("****************************");
		System.out.println("The 6-argument:\n");
		System.out.println(two);
		kb.close();
		}
		
	
}
