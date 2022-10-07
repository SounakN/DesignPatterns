package Structural.DecoratorPattern;

import java.util.ArrayList;

public class ExtraCheeseDecoration implements Pizza{

	Pizza pizza;
	ArrayList x;
	
	public ExtraCheeseDecoration(Pizza pizza,ArrayList x) {
		this.x = x;
		this.pizza = pizza;
	}

	@Override
	public ArrayList getTopings() {
		x.add("Extra Chesse");
		return x;
	}

	@Override
	public String getname() {
		return pizza.getname();
	}

}
