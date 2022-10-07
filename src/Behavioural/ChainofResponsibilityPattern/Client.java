package Behavioural.ChainofResponsibilityPattern;

public class Client {
	
	public static void main(String[] args) {
		DocHandler check = new Excelhandler(new Powerpointhandler(new Texthandler(null)));
		
		check.OpenDoc("xlsx");
	}

}
