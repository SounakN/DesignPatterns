package Structural.AdapterPattern;

public class Adapter implements City {
	City City;
	
	public Adapter(AsianCity City)
	{
		this.City = City;
	}
	@Override
	public String getName() {
		return City.getName();
	}

	@Override
	public double gettemperature() {
		return City.gettemperature()*1.8+32;
	}

	@Override
	public String getTemperaturescale() {
		return "Farhenheit";
	}

	@Override
	public boolean gethasWeatherWarning() {
		return City.gethasWeatherWarning();
	}

	@Override
	public void sethasWeatherWarning(boolean hasWeatherWarning) {
		City.sethasWeatherWarning(hasWeatherWarning);
	}

}
