package menu_building_1;
import java.util.Scanner;
public class menu {

	public static void main(String[] args) {
		//user choice variable
		int choice;
		
		//display menu
		System.out.println("M E N U");
		System.out.println("=================");
		System.out.println("1. Americano");
		System.out.println("2. Latte");
		System.out.println("3. Espresso");
		System.out.println("4. Exit");
		System.out.println("=================");
		System.out.print("Enter number choice: ");
		
		//set up scanner
		Scanner scnr = new Scanner(System.in);
		
		//get choice from user
		choice = scnr.nextInt();
		
		//menu loop
		while (choice != 4) {
			//check choice value
			if(choice == 1) {
				System.out.print("Here is an Americano!");
			} else if(choice == 2) {
				System.out.println("Here is a Latte!");
			} else if (choice == 3) {
				System.out.println("Here is an Espresso");
			}
		
			//display menu again
			System.out.println("M E N U");
			System.out.println("=================");
			System.out.println("1. Americano");
			System.out.println("2. Latte");
			System.out.println("3. Espresso");
			System.out.println("4. Exit");
			System.out.println("=================");
			System.out.print("Enter number choice: ");
		
			//get choice from user again
			choice = scnr.nextInt();
		}
		
		//end message
		System.out.println("Goodbye!");	
		scnr.close();
	
	}

}
