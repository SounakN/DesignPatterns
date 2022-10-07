package Behavioural.MementoPattern;

public class Memento {

	private Calculator cals;
	public Memento() {
	}
	
	public void setState(Calculator Cals1) throws CloneNotSupportedException
	{ 
		cals = Cals1.clone();
	}
	
	public Calculator getState()
	{
		return cals;
	}

}
