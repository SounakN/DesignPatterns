package Behavioural.VisitorPattern;

public class Rice extends Groceries {


	private double price = 2;
	
	public void setprice(double price) {
		 this.price=price;
	}
	@Override
	public double getprice() {
		return price;
	}
	
	  @Override public void Accept(Visitor v,double price) { v.visit(this,price);
	  
	  }
	 

}
