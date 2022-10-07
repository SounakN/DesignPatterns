package Behavioural.MediatorPattern;

public class Mediator {

	private Plane Plane;
	private PlanesInFlight PlanesInFlight = new PlanesInFlight();
	private PlanesOnGround PlanesOnground = new PlanesOnGround();
	private Runway Runway;
	
	public Mediator(Plane pl) {
		this.Plane = pl;
		Plane.setIsInTheAir(false);
		PlanesOnground.addPlane(Plane);
	    Runway = new Runway();
	}

	 public void takeOff() {
		    if(!Plane.getIsInTheAir() && Runway.getIsAvailable()) {
		      System.out.println("Plane " + Plane.getId() + " is taking off...");
		      PlanesOnground.removePlane(Plane);
		      PlanesInFlight.addPlane(Plane);
		      Plane.setIsInTheAir(true);
		      Runway.setIsAvailable(false);
		    }

	}

}
