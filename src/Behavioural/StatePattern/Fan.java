package Behavioural.StatePattern;

public class Fan {
	
	public States State = new Low();

	public States getState() {
		return State;
	}

	public void setState(States state) {
		State = state;
	}
	
	public void turnUp()
	{
		getState().TurnUp(this);
	}
	
	public void turnDown() {
		getState().TurnDown(this);
	}

}
