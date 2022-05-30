package menu_building_1;
import java.util.Scanner;
public class menu2 {

	//displayMenu method
	public static void displayMenu(int opts[], String items[], double pr[]) {
		System.out.println("M E N U");
		System.out.println("=================");
		//loop through options and items
		for (int i = 0; i < opts.length -1; i ++) {
			 System.out.printf("%d. %s \t %.2f\n", opts[i], items[i], pr[i]);
		}
		System.out.printf("%d. %s \n", opts[opts.length-1], items[items.length-1]);
		System.out.println("=================");
		System.out.print("Enter number choice: ");
	}
	public static void main(String[] args) {
		//user choice variable
		int choice;
		//menu data
		int options[] = {1,2,3,4,5};
		String menuItems[] = {"Americano", "Cappuccino", "Latte", "Espresso", "Exit"};
		double prices[] = {2.00, 2.50, 3.00, 2.00};
		//exit option
		int EXIT = options[options.length - 1];
		
		//displayMenu method call
		displayMenu(options, menuItems, prices);
		
		//set up scanner
		Scanner scnr = new Scanner(System.in);
		
		//get choice from user
		choice = scnr.nextInt();
		
		//menu loop
		while (choice != EXIT) {
			//check choice value
			if(choice == options[0]) {
				System.out.printf("Here is a %s \t %.2f\n", menuItems[0], prices[0]);
			} else if(choice == options[1]) {
				System.out.printf("Here is a %s \t %.2f\n", menuItems[1], prices[1]);
			} else if (choice == options[2]) {
				System.out.printf("Here is a %s \t %.2f\n", menuItems[2], prices[2]);
			} else if (choice == options[3]) {
				System.out.printf("Here is a %s \t %.2f\n", menuItems[3], prices[3]);
			}
		
			//displayMenu method call
			displayMenu(options, menuItems, prices);
			
			//get choice from user again
			choice = scnr.nextInt();
		}
		
		//end message
		System.out.println("Goodbye!");	
		scnr.close();
	
	}

}
