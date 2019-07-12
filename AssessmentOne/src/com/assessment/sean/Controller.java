package com.assessment.sean;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Controller {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		
		Name one = new Name("Mr", "Tom", "Jenkins");
		Department myDep1 = new Department(001, "Media", 14);
		Employee myDev1 = new Developer(1, one, myDep1, LocalDate.now(), "1234567", "One");
		
		Name two = new Name("Mr", "John", "Mattis");
		Department myDep2 = new Department(002, "Finance", 12);
		Employee myDev2 = new Developer(2, two, myDep2, LocalDate.now(), "3215643", "Two");
		
		Name three = new Name("Mr", "Peter", "Dinklage");
		Department myDep3 = new Department(003, "DevOps", 13);
		Employee myDev3 = new Developer(3, three, myDep3, LocalDate.now(), "54321786", "Three");
		
		Name four = new Name("Mrs", "Jenna", "Fischer");
		Employee myDev4 = new Developer(4, four, myDep3, LocalDate.now(), "32456812", "One" );
		
		Name five = new Name("Mrs", "Emma", "Bunting");
		Employee myDev5 = new Developer(5, five, myDep3, LocalDate.now(), "435467785", "Three");
		
		Name six = new Name("Miss", "Nathalie", "Cassidy");
		Employee myDev6 = new Developer(6, six, myDep2, LocalDate.now(),"45647346", "Two" );
		
		Name seven = new Name("Miss", "Eva", "Gillespie");
		Employee myDev7 = new Developer(7, seven, myDep1, LocalDate.now(), "657834500", "One");
		
		Name eight = new Name("Mr", "Declan", "Quinn");
		Employee myDev8 = new Developer(8, eight, myDep1, LocalDate.now(), "39008703", "Two" );
		
		Name nine = new Name("Mr", "Anthony", "Quinn");
		Employee myDev9 = new Developer(9, nine, myDep2, LocalDate.now(), "239806348", "One" );
		
		Name ten = new Name("Mrs", "Jean", "Melia");
		Employee man1 = new Manager(10, ten, myDep1, LocalDate.now(), "32412345", 12, 4000.00, 1000 );
		
		Name eleven = new Name("Mr", "Peter", "Queally");
		Employee man2 = new Manager(11, eleven, myDep1, LocalDate.now(),"23452345", 12, 4000.00, 1500 );
		
		Name twelve = new Name("Mr", "Seamus", "Gillespie");
		Employee myDev10 = new Developer(12, twelve, myDep1, LocalDate.now(), "98798788", "Two" );
		
		Name thirteen = new Name("Miss", "Jean", "Brodie");
		Employee myDev11 = new Developer(13, thirteen, myDep1, LocalDate.now(), "34562345", "One");
		
		Name fourteen = new Name("Mrs", "Alanis", "Morissette");
		Employee myDev12 = new Developer(14, fourteen, myDep1, LocalDate.now(), "123412345", "Three" );
		
		Name fifteen = new Name("Mr", "Richard", "Ocasek");
		Employee myDev13 = new Developer(15, fifteen, myDep1, LocalDate.now(), "3451234", "Three");
		
		Name sixteen = new Name("Mr", "Richard", "James");
		Employee myDev14 = new Developer(16, sixteen, myDep1, LocalDate.now(), "09878909", "Three");
		
		Name seventeen = new Name("Mrs", "Jane", "Cummiskey");
		Employee myDev15 = new Developer(17, seventeen, myDep1, LocalDate.now(), "76509823", "Two");
		
		Name eighteen = new Name("Mr", "James", "Hendricks");
		Employee myDev16 = new Developer(18, eighteen, myDep1, LocalDate.now(), "123234233", "Two");
		
		Name nineteen = new Name("Mr", "Robert", "Halford");
		Employee myDev17 = new Developer(19, nineteen, myDep1, LocalDate.now(), "12098766", "one");
		
		Name twenty = new Name("Miss", "Daisy", "Harper");
		Employee myDev18 = new Developer(20, twenty, myDep1, LocalDate.now(),"51207865", "One");
		
		Name twentyOne = new Name("Mr", "Vincent", "Furnier");
		Employee man3 = new Manager(21, twentyOne, myDep2, LocalDate.now(), "32769800", 10, 4800, 2000);
		
		Name twentyTwo = new Name("Mr", "Douglas", "Fairbanks");
		Employee man4 = new Manager(22, twentyTwo, myDep2, LocalDate.now(), "23096543", 10, 4500, 1500);
		
		Name twentyThree = new Name("Mrs", "Jennifer", "Grey");
		Employee myDev19 = new Developer(23, twentyThree, myDep2, LocalDate.now(), "123123123", "Three");
		
		Name twentyFour = new Name("Mr", "Ronald", "Weasley");
		Employee myDev20 = new Developer(24, twentyFour, myDep2, LocalDate.now(), "435345345", "Three");
		
		Name twentyFive = new Name("Mr", "Daniel", "Radcliffe");
		Employee myDev21 = new Developer(25, twentyFive, myDep2, LocalDate.now(), "2323232354", "Three");
		
		Name twentySix = new Name("Mr", "Richard", "Cole");
		Employee myDev22 = new Developer(26, twentySix, myDep2, LocalDate.now(), "34667567567", "Two");
		
		Name twentySeven = new Name("Mr", "Richard", "Briers");
		Employee myDev23 = new Developer(27, twentySeven, myDep2, LocalDate.now(), "234789456", "Two");
		
		Name twentyEight = new Name("Mrs", "Regina", "Wayans");
		Employee myDev24 = new Developer(28, twentyEight, myDep2, LocalDate.now(), "0987654", "One");
		
		Name twentyNine = new Name("Mr", "Reginald", "Dwight");
		Employee myDev25 = new Developer(29, twentyNine, myDep2, LocalDate.now(), "120967565", "One");
		
		Name thirty = new Name("Mr", "Angus", "Young");
		Employee man5 = new Manager(30, thirty, myDep3, LocalDate.now(), "65782345", 11, 5000.00, 1200);
		
		Name thirtyOne = new Name("Mrs", "Jennifer", "Beals");
		Employee man6 = new Manager(31, thirtyOne, myDep3, LocalDate.now(), "123098676", 11, 4500.00, 1300);
		
		Name thirtyTwo = new Name("Mr", "Neal", "Schon");
		Employee myDev26 = new Developer(32, thirtyTwo, myDep3, LocalDate.now(), "6456789", "One");
		
		Name thirtyThree = new Name("Mr", "Brian", "Jones");
		Employee myDev27 = new Developer(33, thirtyThree, myDep3, LocalDate.now(), "2345689", "One");
		
		Name thirtyFour = new Name("Mr", "Sean", "Mc Bride");
		Employee myDev28 = new Developer(34, thirtyFour, myDep3, LocalDate.now(), "2345467356", "Three");
		
		Name thirtyFive = new Name("Mr", "John", "Wayne");
		Employee myDev29 = new Developer(35, thirtyFive, myDep3, LocalDate.now(), "6574738947", "Two");
		
		Name thirtySix = new Name("Mr", "Martin", "Reynolds");
		Employee myDev30 = new Developer(36, thirtySix, myDep3, LocalDate.now(), "2049576894", "Two");
		
		Name thirtySeven = new Name("Mrs", "Maria", "Gillespie");
		Employee myDev31 = new Developer(37, thirtySeven, myDep3, LocalDate.now(), "340956134", "Two");
		
		Name thirtyEight = new Name("Mr", "Anthony", "Mc Bride");
		Employee myDev32 = new Developer(38, thirtyEight, myDep3, LocalDate.now(), "659812533", "Three");
		
		Name thirtyNine = new Name("Mr", "Bruce", "Wayne");
		Employee myDev33 = new Developer(39, thirtyNine, myDep3, LocalDate.now(), "2345957897", "Three");
		
		ArrayList<Department> departments = new ArrayList<Department>();
		departments.add(myDep1);
		departments.add(myDep2);
		departments.add(myDep3);
		
		
		
		
		   ArrayList<Developer> developers = new ArrayList<Developer>();
		   developers.add((Developer) myDev1);
		   developers.add((Developer) myDev2);
		   developers.add((Developer) myDev3);
		   developers.add((Developer) myDev4);
		   developers.add((Developer) myDev5);
		   developers.add((Developer) myDev6);
		   developers.add((Developer) myDev7);
		   developers.add((Developer) myDev8);
		   developers.add((Developer) myDev9);
		   developers.add((Developer) myDev10);
		   developers.add((Developer) myDev11);
		   developers.add((Developer) myDev12);
		   developers.add((Developer) myDev13);
		   developers.add((Developer) myDev14);
		   developers.add((Developer) myDev15);
		   developers.add((Developer) myDev16);
		   developers.add((Developer) myDev17);
		   developers.add((Developer) myDev18);
		   developers.add((Developer) myDev19);
		   developers.add((Developer) myDev20);
		   developers.add((Developer) myDev21);
		   developers.add((Developer) myDev22);
		   developers.add((Developer) myDev23);
		   developers.add((Developer) myDev24);
		   developers.add((Developer) myDev25);
		   developers.add((Developer) myDev26);
		   developers.add((Developer) myDev27);
		   developers.add((Developer) myDev28);
		   developers.add((Developer) myDev29);
		   developers.add((Developer) myDev30);
		   developers.add((Developer) myDev31);
		   developers.add((Developer) myDev32);
		   developers.add((Developer) myDev33);
		   //serialize developers
		   FileOutputStream fos = new FileOutputStream("dev.dat");
		   ObjectOutputStream oos = new ObjectOutputStream(fos);
		   oos.writeObject (developers);
		   
		   FileInputStream fis = new FileInputStream("dev.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<Developer>  devNew =  (ArrayList<Developer>) ois.readObject();
			
			for(Developer dev : devNew) {
				System.out.println(dev.toString());
			}
						 
		   
		   ArrayList<Manager> managers = new ArrayList<Manager>();
		   managers.add((Manager) man1);
		   managers.add((Manager) man2);
		   managers.add((Manager) man3);
		   managers.add((Manager) man4);
		   managers.add((Manager) man5);
		   managers.add((Manager) man6);
		   
		   fos = new FileOutputStream("man.dat");
		   oos = new ObjectOutputStream(fos);
		   oos.writeObject (managers);
		   
		   fis = new FileInputStream("man.dat");
		   ois = new ObjectInputStream(fis);
		   @SuppressWarnings("unchecked")
		ArrayList<Manager> manNew = (ArrayList<Manager>) ois.readObject();
		   
		   for(Manager man : manNew) {
			   System.out.println(man.toString());
		   }
		   
		   
		   
		  
		  
		  
		   
		   
		   
		
		
		
		
		
		
		
		
		
		
			
		
		
		

	}

	
		
		
	

}
	
