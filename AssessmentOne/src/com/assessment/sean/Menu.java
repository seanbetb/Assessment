package com.assessment.sean;

import java.util.*;

public class Menu {
	
	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("***Employee Menu***");
			System.out.println("  Please select your option: ");
			System.out.println("1. List all employees. ");
			System.out.println("2. Add a new Employee, manager or developer");
			System.out.println("3. Edit an Employee by id");
			System.out.println("4. Delete an Employee by id");
			System.out.println("5. View all Managers");
			System.out.println("6. View all Developers");
			System.out.println("7. Sub-Menu payment");
			System.out.println("8.Exit Menu");
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				listAllEmployees();
				break;
				
			case 2:
				addNewEmployee();
				break;
				
			case 3:
				editEmployeeById();
				break;
				
			case 4:
				deleteEmployeeById();
				break;
				
			case 5:
				viewAllManagers();
				
			case 6:
				viewAllDevelopers();
				
				
			case 7:
				subMenuPayment();
				
			case 8:
				exitMenu();
			}
			
			
			}while (option != 8);
		
		     sc.close();
			
	}

	private void exitMenu() {
		
		
	}

	private void subMenuPayment() {
		// TODO Auto-generated method stub
		
	}
	

	private void viewAllDevelopers() {
		// TODO Auto-generated method stub
		
	}

	private void viewAllManagers() {
		
		
	}

	private void deleteEmployeeById() {
		// TODO Auto-generated method stub
		
	}

	private void editEmployeeById() {
		// TODO Auto-generated method stub
		
	}

	private void addNewEmployee() {
		// TODO Auto-generated method stub
		
	}

	private void listAllEmployees() {
		// TODO Auto-generated method stub
		return;
	}
	
	

}
