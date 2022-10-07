package Behavioural.StatePattern;

public class High implements States {

	@Override
	public States TurnUp(Fan fan) {
		System.out.println("Already at Highest speed");	
		return fan.getState();
		
	}

	@Override
	public States TurnDown(Fan fan) {
		fan.setState(new Medium());
		System.out.println("Fan is on Medium");	
		return fan.getState();		
	}

}
