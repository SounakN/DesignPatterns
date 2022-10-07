package Behavioural.StatePattern;

public class Medium implements States{

	@Override
	public States TurnUp(Fan fan) {
		fan.setState(new High());
		System.out.println("Fan is on high");
		return fan.getState();	
		
	}

	@Override
	public States TurnDown(Fan fan) {
		fan.setState(new Low());
		System.out.println("Fan is on Low");	
		return fan.getState();	
		
	}

}
