package Structural.ProxyPattern;

public class Main {
	
	public static void main(String[] args) {
		
		Inventory inventory = new SuperStoryProxyInventory();
		Store s = new Store("Hexagon Store","Kolkata",inventory);
		
		s.printName();
		s.printLocation();
		s.printInventory();
		
	}

}
