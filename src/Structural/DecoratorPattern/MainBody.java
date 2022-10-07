package Structural.DecoratorPattern;

import java.util.ArrayList;
import java.util.List;

public class MainBody {
	
	public static void main(String[] args) {
		order(new PizzaHawaian(new ArrayList<>(List.of("Cheese","ham","pinapple","Tomato"))));
		Pizza p = new PizzaMargharita(new ArrayList<>(List.of("Cheese","Tomato")));
		order(new ExtraCheeseDecoration(p, new ArrayList<>(List.of("Cheese","Tomato"))));
		order(new PizzaPepperoni(new ArrayList<>(List.of("Cheese","Pepperoni"))));
	}

	private static void order(Pizza pizza) {
		System.out.println("The Piiza that youi have ordeed is :: "+pizza.getname()+" and the Toppings that you have ordered :: "+pizza.getTopings());
		
	}

}
