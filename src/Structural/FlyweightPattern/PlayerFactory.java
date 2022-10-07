package Structural.FlyweightPattern;

import java.util.HashMap;

class PlayerFactory
{
    private static HashMap <String, Players> hm =
                         new HashMap<String, Players>();
  
    // Method to get a player
    public static Players getPlayer(String type)
    {
        Players p = null;
  
        if (hm.containsKey(type))
                p = hm.get(type);
        else
        {

            switch(type)
            {
            case "Terrorist":
                System.out.println("Terrorist Created");
                p = new Terorrist();
                break;
            case "CounterTerrorist":
                System.out.println("Counter Terrorist Created");
                p = new Army();
                break;
            default :
                System.out.println("Unreachable code!");
            }
  
            // Once created insert it into the HashMap
            hm.put(type, p);
        }
        return p;
    }
}