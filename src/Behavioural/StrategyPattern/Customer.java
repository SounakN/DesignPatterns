package Behavioural.StrategyPattern;

public class Customer {
	
	public static void main(String[] args) {
		Payments.paypal.paymentmake(100);
		Payments.PayTM.paymentmake(200);
	}

}
