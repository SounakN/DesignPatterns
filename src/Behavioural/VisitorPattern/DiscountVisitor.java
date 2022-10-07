package Behavioural.VisitorPattern;

public class DiscountVisitor implements Visitor {

	
	@Override
	public void visit(Bread b, double value) {
		b.setprice(b.getprice()-(b.getprice()*value/100));
		
	}

	@Override
	public void visit(Rice r,double value) {
		r.setprice(r.getprice()-(r.getprice()*value/100));
		
	}

	@Override
	public void visit(GroceryList x) {
		System.out.println("Discounter pirce is here");
		
	}

}
