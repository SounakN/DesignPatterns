package Beahvioural.IteratorPattern;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Employees emp1 = new Employees("Sundar",23);
		Employees emp2 = new Employees("Radhe",24);
		Employees emp3 = new Employees("Shyam",22);
		
		StaffListCollections staffer = new StaffListCollections(emp1,emp2,emp3);
		
		Iterator<Employees> check = staffer.iterator();
		
		while(check.hasNext())
		{
			System.out.println(check.next().getEmpAge());
		}
	}

}
