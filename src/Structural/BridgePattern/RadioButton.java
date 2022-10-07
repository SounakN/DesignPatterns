package Structural.BridgePattern;

public class RadioButton implements Button {

	private ButtonColour BC;
	private ButtonSize BS;
	
	
	public RadioButton(ButtonColour BC, ButtonSize BS)
	{
		this.BC = BC;
		this.BS = BS;
	}
	
	@Override
	public void draw() {
		BC.getColour();
		BS.getsize();
		System.out.println("Drawing a Radiobutton of the above requirements");
	}
}
