package Structural.FacadePattern;

public class FacadeClasss {
	
	public void facilitate() {
		Accelerator accelerator = new Accelerator();
		Clutch clutch = new Clutch();
		GearStick gearstick = new GearStick();
		
		clutch.Press();
		gearstick.turnDown();
		clutch.LiftUp();
		accelerator.Press();
		
		accelerator.LiftUp();
		clutch.Press();
		gearstick.turnUp();
		clutch.LiftUp();
		accelerator.Press();
		
		accelerator.LiftUp();
		clutch.Press();
		gearstick.turnUp();
		clutch.LiftUp();
		accelerator.Press();

		accelerator.LiftUp();
		clutch.Press();
		gearstick.turnDown();
		clutch.LiftUp();
		accelerator.Press();

		accelerator.LiftUp();
		clutch.Press();
		gearstick.turnUp();
		clutch.LiftUp();
		accelerator.Press();
		
		accelerator.LiftUp();
		clutch.Press();
		gearstick.turnUp();
		clutch.LiftUp();
		accelerator.Press();
		
		accelerator.LiftUp();
		clutch.Press();
		gearstick.turnUp();
		clutch.LiftUp();
		accelerator.Press();

		accelerator.LiftUp();
		clutch.Press();
		gearstick.turnUp();
		clutch.LiftUp();
		accelerator.Press();
		
		accelerator.LiftUp();
		clutch.Press();
		gearstick.turnDown();
		clutch.LiftUp();
		accelerator.Press();
	}

}
