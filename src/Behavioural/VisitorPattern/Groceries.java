package Behavioural.VisitorPattern;

public abstract class Groceries {
	
	public abstract double getprice();
	
	public abstract void Accept(Visitor v,double price);

}
