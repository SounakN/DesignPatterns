package Behavioural.CommandPattern;

public class PlaceOrderCommand implements Command {

	public Apparels Apparles;
	
	public PlaceOrderCommand(Apparels e)
	{
		this.Apparles = e;
	}
	@Override
	public void Invoke() {
		Apparles.PlacedOrder();
		
	}

}
