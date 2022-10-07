package Behavioural.StatePattern;

public class Low implements States {

	@Override
	public States TurnUp(Fan fan) {
		fan.setState(new Medium());
		System.out.println("Fan is on Medium");		
		return fan.getState();
	}

	@Override
	public States TurnDown(Fan fan) {
		System.out.println("Already at Lowest speed");	
		return fan.getState();	
	}

}
