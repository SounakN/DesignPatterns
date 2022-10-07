package Structural.ProxyPattern;

public class Items {
	
	public String Name;
	public double Price;
	public int Quantity;
	public Items(String name, double price, int quantity) {
		Name = name;
		Price = price;
		Quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Name :: "+Name+ " and the price :: "+Price+" and the quanity is :: "+Quantity;
		
	}	
	

}
