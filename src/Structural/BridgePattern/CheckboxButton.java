package Structural.BridgePattern;

public class CheckboxButton implements Button {

	private ButtonColour BC;
	private ButtonSize BS;
	
	
	public CheckboxButton(ButtonColour BC, ButtonSize BS)
	{
		this.BC = BC;
		this.BS = BS;
	}
	
	@Override
	public void draw() {
		BC.getColour();
		BS.getsize();
		System.out.println("Drawing a Checkbox of the above requirements");
	}

}
