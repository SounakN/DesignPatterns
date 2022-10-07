package Behavioural.CommandPattern;

public class ChoiceFactory {
	
	public static Apparels Apparels = null;
	
	public static Apparels chooseApparles(String type)
	{
		switch(type)
		{
			case "Packet": Apparels = new Packet(); break;
			case "Jacket": Apparels = new Jacket();	break;
		}
		return Apparels;
	}

}
