package Behavioural.ObserverPattern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class trafficUpdater implements PropertyChangeListener {
	
	public static ArrayList<String> traffic = new ArrayList<>();
	
	public static void getTrafficUpdate() {
		traffic.forEach(s->System.out.println(s));
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		traffic.add((String) evt.getNewValue());
	}

}
