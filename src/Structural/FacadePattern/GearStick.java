package Structural.FacadePattern;

import Behavioural.StatePattern.States;

public class GearStick {
	
	GearState gearState = new GearState.Neutral();

	public GearState getState() {
		return gearState;
	}
	public void setState(GearState gearState) {
		this.gearState = gearState;
	}

	public void turnUp()
	{
		getState().TurnUp(this);
	}
	
	public void turnDown() {
		getState().TurnDown(this);
	}
}
