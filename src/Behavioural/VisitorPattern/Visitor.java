package Behavioural.VisitorPattern;

public interface Visitor {
	
	public void visit(Bread b,double val);
	
	public void visit(Rice r,double val);
	
	public void visit(GroceryList x);

}
