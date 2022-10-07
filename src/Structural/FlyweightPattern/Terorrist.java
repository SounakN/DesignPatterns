package Structural.FlyweightPattern;

public class Terorrist implements Players {

	// Intrinsic Attribute
    private final String TASK;
  
    // Extrinsic Attribute
    private String weapon;
	
	public Terorrist() {
		this.TASK = "BLAST";
		
	}
	@Override
	public void assignWeapon(String weapon) {
		this.weapon=weapon;
		
	}

	@Override
	public void mission() {
		//Work on the Mission
        System.out.println("Terrorist with weapon "
                           + weapon + "|" + " Task is " + TASK);
		
	}

}
