package Behavioural.MementoPattern;

public class Calculator {

	int val =0;
	Memento m = new Memento();
	public Calculator(int val) {
		this.val=val;	
		System.out.println("initial Value of Val set to :: "+this.val);
	}
	
	public void add(int val1)
	{
		val+=val1;
		System.out.println("CUrrent value of Val after adding :: "+val1+ " is now :: "+val);
	}
	
	public void sub(int val1)
	{
		val-=val1;
		System.out.println("CUrrent value of Val after substracting :: "+val1+ " is now :: "+val);
	}
	
	public void Save() throws CloneNotSupportedException
	{
		System.out.println("Setting to the State when value of Val was :: "+this.val);
		m.setState(this);
	
	}
	public void undo()
	{
		Calculator cc = m.getState();
		System.out.println("restoring to Old State");
		this.val = cc.val;
		System.out.println("Current restored value of Val is :: "+this.val);
	}
	
	 @Override
	    public Calculator clone() throws CloneNotSupportedException {
		 Calculator temp = new Calculator (this.val);
	      return temp;
	    }
	

}
