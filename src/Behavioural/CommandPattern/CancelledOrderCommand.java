package Behavioural.CommandPattern;

public class CancelledOrderCommand implements Command {

	public Apparels Apparles;
	
	public CancelledOrderCommand(Apparels e)
	{
		this.Apparles = e;
	}
	@Override
	public void Invoke() {
		Apparles.CancelledOrder();
		
	}

}
