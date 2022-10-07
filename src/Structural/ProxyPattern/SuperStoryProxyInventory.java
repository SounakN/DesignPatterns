package Structural.ProxyPattern;

import java.util.ArrayList;

public class SuperStoryProxyInventory implements Inventory {

	private Inventory inventory;
	@Override
	public ArrayList<Items> getInventory() {
		if(inventory == null) {
			inventory = new SuperStoreInventory();
		}
		return inventory.getInventory();
	}

}
