package Structural.DecoratorPattern;

import java.util.ArrayList;
import java.util.List;

public class PizzaPepperoni implements Pizza{

	ArrayList<String> Toppings = new ArrayList<>();
	
	String PizzaName = "PizzaHawaian";
	
	public PizzaPepperoni(ArrayList x) {
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
