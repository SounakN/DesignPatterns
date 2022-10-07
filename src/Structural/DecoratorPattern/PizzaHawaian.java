package Structural.DecoratorPattern;

import java.util.ArrayList;
import java.util.List;

public class PizzaHawaian implements Pizza{

	ArrayList<String> Toppings = new ArrayList<>();
	
	String PizzaName = "PizzaPepperoni";
	
	public PizzaHawaian(ArrayList x) {
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
