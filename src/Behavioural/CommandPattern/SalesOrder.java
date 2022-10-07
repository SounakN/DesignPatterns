package Behavioural.CommandPattern;

import java.util.Scanner;

public class SalesOrder {
	
	
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner( System.in );
		String sentence = user_input.nextLine();
		Apparels now = ChoiceFactory.chooseApparles(sentence);
		
		PlaceOrderCommand PlacedOrder = new PlaceOrderCommand(now);
		CancelledOrderCommand CancelledOrder = new CancelledOrderCommand(now);
		
		PlacedOrder.Invoke();
		CancelledOrder.Invoke();
	}

}
