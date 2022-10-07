package Behavioural.VisitorPattern;

import java.lang.reflect.Array;
import java.util.*;

public class GroceryList extends Groceries{

	ArrayList<Groceries> grocers ;
	
	
	public void AddGroceryList(List<Groceries> c) {
		 grocers = new ArrayList<>();
		grocers.addAll(c);
	}


	@Override
	public double getprice() {
		return grocers.stream().mapToDouble(g->g.getprice()).sum();
	}


	
	  @Override 
	  public void Accept(Visitor v,double price) { 
		  grocers.forEach(g->g.Accept(v,price));
	  v.visit(this); 
	  }
	 

}
