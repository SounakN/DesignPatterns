package Structural.AdapterPattern;

public class AsianCity implements City {

	private String name;
	private double temperature;
	private boolean hasWeatherWarning;
	
	public AsianCity(String name, double temperature) {
		this.name = name;
		this.temperature = temperature;
		this.hasWeatherWarning = false;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double gettemperature() {
		return temperature;
	}

	@Override
	public String getTemperaturescale() {
		return "Celcius";
	}

	@Override
	public boolean gethasWeatherWarning() {
		return hasWeatherWarning;
	}

	@Override
	public void sethasWeatherWarning(boolean hasWeatherWarning) {
		this.hasWeatherWarning = hasWeatherWarning;
	}

}
