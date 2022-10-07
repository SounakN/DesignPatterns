package Behavioural.MementoPattern;

public class User {

	public static void main(String[] args) throws CloneNotSupportedException {
		Calculator cc = new Calculator(10);
		
		cc.add(20);
		cc.add(20);
		cc.sub(10);
		cc.Save();
		cc.add(20);
		cc.add(20);
		cc.sub(10);
		cc.undo();
		cc.add(20);
		cc.add(20);
		cc.sub(0);
	}

}
