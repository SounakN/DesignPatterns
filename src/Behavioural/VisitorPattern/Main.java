package Behavioural.VisitorPattern;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Bread b1 = new Bread();
		Bread b2 = new Bread();
		Rice r1 = new Rice();
		Rice r2 = new Rice();
		GroceryList GC = new GroceryList();
		GC.AddGroceryList(Arrays.asList(b1,b2,r1,r2));
		System.out.println(GC.getprice());
		
		GC.Accept(new DiscountVisitor(),5.0); System.out.println(GC.getprice());
		 
	
	}

}
