package Structural.CompositePattern;

public class NonFictionBooks implements Books{
	
	private String Title;
	private boolean isAplay;
	private boolean isCheckout;

	public NonFictionBooks(String title, boolean isAplay) {
		this.Title = title;
		this.isAplay = isAplay;
		this.isCheckout = false;
	}

	@Override
	public void CheckoutBook() {
		if(!isCheckout) {
			System.out.println("Checking out the Non - Fiction Book :: "+this.Title);
			this.isCheckout = true;
		}else {
			System.out.println("\"Already Checkedout\" :: "+this.Title);
		}
		
	}

	@Override
	public void ReturnBook() {
		if(isCheckout) {
			System.out.println("Returning out the Non - Fiction Book :: "+this.Title);
			this.isCheckout = false;
		}else {
			System.out.println("\"Already Returned\" :: "+this.Title);
		}
		
	}

}
