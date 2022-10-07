package Structural.FlyweightPattern;

public class Army implements Players {

	// Intrinsic Attribute
    private final String TASK;
  
    // Extrinsic Attribute
    private String weapon;
	
	public Army() {
		this.TASK = "DIFFUSE BOMB";
		
	}
	@Override
	public void assignWeapon(String weapon) {
		this.weapon=weapon;
		
	}

	@Override
	public void mission() {
		//Work on the Mission
        System.out.println("Army with weapon "
                           + weapon + "|" + " Task is " + TASK);
		
	}

}
