package Structural.ProxyPattern;

import java.util.ArrayList;

public class SuperStoreInventory implements Inventory {

	ArrayList<Items> Stock = new ArrayList<Items>();
	
	public  SuperStoreInventory() {
		Stock.add(new Items("PEPE",0.25,12));
		Stock.add(new Items("ALU",0.80,13));
		Stock.add(new Items("POTOL",0.78,11));
		Stock.add(new Items("JHINGA",0.55,1));
		Stock.add(new Items("KUMRO",0.26,12));
		Stock.add(new Items("DHAROS",0.87,133));
		Stock.add(new Items("PEYNAJ",0.25,1));
	}
	@Override
	public ArrayList<Items> getInventory() {
		return Stock;
	}

}
