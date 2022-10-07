package Structural.BridgePattern;

public class Main {

	
	public static void main(String...args) {
		
		Button b = new RadioButton(new GreenButton(), new LargeSize());
		Button a = new RadioButton(new BlueButton(), new MediumSize());
		
		b.draw();
		a.draw();
	}
}
