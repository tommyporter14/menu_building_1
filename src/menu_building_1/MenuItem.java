package menu_building_1;

public class MenuItem {
	//variables
	private String name;
	private double price;
	
	//constructor
	MenuItem(String name, double price){
		this.name = name;
		this.price = price;
	}
	//getters
	public String  getName() {
		return name;
	}
	public double getPrice() {
		
		return price;
	}
}
