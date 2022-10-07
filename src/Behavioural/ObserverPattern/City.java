package Behavioural.ObserverPattern;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class City  {
	
	
	private String UpdateTraffic ;
	
	public PropertyChangeSupport support = new PropertyChangeSupport(this);
	
	public void UpdateTraffic(String trafficUpdate)
	{
		support.firePropertyChange("UpdateTraffic", this.UpdateTraffic, trafficUpdate);
		this.UpdateTraffic = trafficUpdate;
	}
	
	public void addpropertyChangeListerner(PropertyChangeListener listener)
	{
		support.addPropertyChangeListener(listener);
	}

}
