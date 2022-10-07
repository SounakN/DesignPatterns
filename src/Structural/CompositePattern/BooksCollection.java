package Structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class BooksCollection implements Books{

	private List<Books> b = new ArrayList<>();
	
	public void addBooks(Books b)
	{
		this.b.add(b);
	}
	@Override
	public void CheckoutBook() {
		b.stream().forEach(Books::CheckoutBook);
		
	}

	@Override
	public void ReturnBook() {
		b.stream().forEach(Books::ReturnBook);
		
	}

}
