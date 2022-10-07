package Structural.ProxyPattern;

public class Store {
	
	private String StoreName;
	private String Location;
	private Inventory Inventory;
	public Store(String storeName, String location, Inventory inventory) {
		StoreName = storeName;
		Location = location;
		Inventory = inventory;
	}
	
	public void printName(){
		System.out.println(this.StoreName);
	}
	public void printLocation(){
		System.out.println(this.Location);		
	}
	public void printInventory(){
		for(Items i : Inventory.getInventory()) {
			System.out.println(i);
		}
	}

}
