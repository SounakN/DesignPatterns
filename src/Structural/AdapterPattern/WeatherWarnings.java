package Structural.AdapterPattern;

public class WeatherWarnings {

	public static double MAX_TEMP = 100;
	public static double MIN_TEMP = 16;
	
	public void PostWarning(City City)
	{
		if(City.gettemperature()>MAX_TEMP || City.gettemperature()<MIN_TEMP)
		{
			System.out.println("The city :: "+City.getName()+ " has a Weather Warning with :: "+City.gettemperature() + " of the scale :: "+City.getTemperaturescale());
			City.sethasWeatherWarning(true);
		}else {
			System.out.println("The city :: "+City.getName()+ " has NO Weather Warning :: "+City.gettemperature() + " of the scale :: "+City.getTemperaturescale());
		}
	}
}
