package Structural.CompositePattern;

public class Main {
	
	public static void main(String[] args) {
		Books x = new NonFictionBooks("Theory of everything", false);
		Books x1 = new NonFictionBooks("A brief history of time", false);
		
		Books x2 = new FictionBooks("Angels and Demons");
		Books x3 = new FictionBooks("Da Vinci Code");
		
		BooksCollection c = new BooksCollection();
		
		c.addBooks(x);
		c.addBooks(x1);
		c.addBooks(x2);
		c.addBooks(x3);
		
		c.CheckoutBook();
		c.ReturnBook();
		c.ReturnBook();
		
		Main m = new Main();
		m.CheckoutBook(x);
		m.CheckoutBook(x);
		m.returnnBook(x);
		m.returnnBook(x);
	}
	
	public void returnnBook(Books books)
	{
		System.out.println("retruning out:: ");
		books.ReturnBook();
	}
	
	public void CheckoutBook(Books books)
	{
		System.out.println("Checking out:: ");
		books.CheckoutBook();
	}

}
