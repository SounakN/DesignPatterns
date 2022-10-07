package Behavioural.StrategyPattern;

public interface Payments {
	
	void paymentmake(int amount);
	
	Payments paypal = (amount)-> System.out.println("payment done through paypal of amount : "+amount);
	Payments PayTM = (amount)->System.out.println("payment done through PayTM of amount : "+amount);

}
