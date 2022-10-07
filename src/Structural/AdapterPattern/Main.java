package Structural.AdapterPattern;

public class Main {

	public static void main(String[] args) {
		AsianCity c = new AsianCity("Tangra", -4);
		AsianCity d = new AsianCity("Wangra", 101);
		
		NorthAmericanCity c1 = new NorthAmericanCity("Hiusan", 1);
		NorthAmericanCity d1 = new NorthAmericanCity("Wieusan", 101);
		
		WeatherWarnings WW = new WeatherWarnings();
		WW.PostWarning(c);
		WW.PostWarning(d);
		WW.PostWarning(c1);
		WW.PostWarning(d1);
		
		Adapter aa = new Adapter(c);
		Adapter aa1 = new Adapter(d);
		WW.PostWarning(aa);
		WW.PostWarning(aa1);

	}

}
