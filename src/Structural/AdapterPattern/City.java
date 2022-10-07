package Structural.AdapterPattern;

public interface City {

	String getName();
	double gettemperature();
	String getTemperaturescale();
	boolean gethasWeatherWarning();
	void sethasWeatherWarning(boolean hasWeatherWarning);
}
