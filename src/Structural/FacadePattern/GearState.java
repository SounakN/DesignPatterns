package Structural.FacadePattern;

import Behavioural.StatePattern.Medium;

public interface GearState {
	
	public GearState TurnUp(GearStick gearStick);
	
	public GearState TurnDown(GearStick gearStick);
	
	public class Neutral implements GearState{

		@Override
		public GearState TurnUp(GearStick gearStick) {
			gearStick.setState(new Firstgear());
			System.out.println("Car is Shifted to 1st gear");		
			return gearStick.getState();
		}

		@Override
		public GearState TurnDown(GearStick gearStick) {
			System.out.println("Already at Neutral cannot go down shift");	
			return gearStick.getState();	
		}
		
	}
	public class Firstgear implements GearState{

		@Override
		public GearState TurnUp(GearStick gearStick) {
			gearStick.setState(new Secondgear());
			System.out.println("Car is Shifted to 2nd gear");		
			return gearStick.getState();
		}

		@Override
		public GearState TurnDown(GearStick gearStick) {
			gearStick.setState(new Neutral());
			System.out.println("Car is Shifted to Neutral");		
			return gearStick.getState();	
		}
		
	}
	public class Secondgear implements GearState{

		@Override
		public GearState TurnUp(GearStick gearStick) {
			gearStick.setState(new Thirdgear());
			System.out.println("Car is Shifted to 3rd gear");		
			return gearStick.getState();
		}

		@Override
		public GearState TurnDown(GearStick gearStick) {
			gearStick.setState(new Firstgear());
			System.out.println("Car is Shifted to 1st gear");		
			return gearStick.getState();	
		}
		
	}
	public class Thirdgear implements GearState{

		@Override
		public GearState TurnUp(GearStick gearStick) {
			System.out.println("Car is at 3rd and Max gear cannot go up");		
			return gearStick.getState();
		}

		@Override
		public GearState TurnDown(GearStick gearStick) {
			gearStick.setState(new Secondgear());
			System.out.println("Car is Shifted to 2nd gear");		
			return gearStick.getState();	
		}
		
	}

}
