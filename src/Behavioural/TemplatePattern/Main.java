package Behavioural.TemplatePattern;

public class Main {

	
	public static void main(String args[]) {
		Works w = new Pirates();
		Works e = new Hooman();
		
		w.Procedure();
		e.Procedure();
	}
}
