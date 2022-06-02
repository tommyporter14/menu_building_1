package menu_building_1;
import java.util.ArrayList;
import java.util.Scanner;
public class menu3 {

	//transaction method
	public static void completeTransaction(int choice, ArrayList<MenuItem> items) {
		MenuItem item = items.get(choice -1);
		System.out.printf("Here is your %s coffee worth %.2f\n", item.getName(), item.getPrice());
	}
	
	//displayMenu method
	public static void displayMenu(ArrayList<MenuItem> items) {
		System.out.println("M E N U");
		System.out.println("=================");
		//loop through options and items
		for (int i = 0; i < items.size(); i ++) {
			MenuItem item = items.get(i);
			System.out.printf("%d. %s \t %.2f\n", i + 1, item.getName(), item.getPrice());
		}
		System.out.printf("%d. EXIT\n", items.size() + 1);
		System.out.println("=================");
	}
	
	//main
	public static void main(String[] args) {
		
		//user choice variable
		int choice;
		
		//menu data
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		menuItems.add(new MenuItem("Americano", 2.50));
		menuItems.add(new MenuItem("Cappuccino", 3.00));
		menuItems.add(new MenuItem("Latte", 3.50));
		menuItems.add(new MenuItem("Espresso", 2.00));
		
		//exit option
		int EXIT = menuItems.size()+1;
		
		//create inputValidation object
		inputValidation v = new inputValidation();
		
		//displayMenu method call
		displayMenu(menuItems);
		
		
		//get choice from user
		choice = v.readInteger("Enter Choice: ", "Error, invalid input", 1, EXIT);
		
		//menu loop
		while (choice != EXIT) {
			
			//check choice value
			completeTransaction(choice, menuItems);
		
			//displayMenu method call
			displayMenu(menuItems);
			
			//get choice from user again
			choice = v.readInteger("Enter Choice", "Error, invalid input", 1, EXIT);
		}
		
		//end message
		System.out.println("Goodbye!");	
	}

}