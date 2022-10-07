package Structural.DecoratorPattern;

import java.util.ArrayList;
import java.util.List;

public class PizzaMargharita implements Pizza{

	ArrayList<String> Toppings = new ArrayList<>();
	
	String PizzaName = "PizzaMargharita";
	
	public PizzaMargharita(ArrayList x) {
		this.Toppings = x;
	}
	@Override
	public ArrayList getTopings() {
		return Toppings;
	}

	@Override
	public String getname() {
		return PizzaName;
	}

}
