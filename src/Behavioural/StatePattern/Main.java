package Behavioural.StatePattern;

public class Main {
	
	public static void main(String[] args) {
		Fan fan = new Fan();
		
		//fan.getState().TurnDown(fan).TurnDown(fan).TurnUp(fan);
		fan.turnUp();
		fan.turnUp();
		fan.turnUp();
		fan.turnUp();
		fan.turnDown();
		fan.turnDown();
		fan.turnDown();
	}

}
