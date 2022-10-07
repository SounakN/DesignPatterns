package Structural.CompositePattern;

public class FictionBooks implements Books{

	
	private String Title;
	private boolean isCheckout;

	public FictionBooks(String title) {
		this.Title = title;
		this.isCheckout = false;
	}
	
	@Override
	public void CheckoutBook() {
		if(!isCheckout) {
			System.out.println("Checking out the fiction Book :: "+this.Title);
			this.isCheckout = true;
		}else {
			System.out.println("\"Already Checkedout\" :: "+this.Title);
		}
		
	}

	@Override
	public void ReturnBook() {
		if(isCheckout) {
			System.out.println("Returning out the fiction Book :: "+this.Title);
			this.isCheckout = false;
		}else {
			System.out.println("\"Already Returned\" :: "+this.Title);
		}
		
	}

}
