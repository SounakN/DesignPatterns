package Behavioural.ObserverPattern;

public class Main {

	public static void main(String[] args) {
		City Kolkata = new City();
		City Mumbai = new City();
		trafficUpdater feed =new trafficUpdater();
		
		Kolkata.addpropertyChangeListerner(feed);
		Mumbai.addpropertyChangeListerner(feed);
		
		
		Kolkata.UpdateTraffic("Very heavy traffic");
		Mumbai.UpdateTraffic("Less traffic");
		Mumbai.UpdateTraffic("Less traffic");
		Mumbai.UpdateTraffic("Less traffic");
		Mumbai.UpdateTraffic("Less traffic");
		Kolkata.UpdateTraffic("Very heavy traffic");
		Kolkata.UpdateTraffic("heavy traffic");
		trafficUpdater.getTrafficUpdate();
		

	}

}
