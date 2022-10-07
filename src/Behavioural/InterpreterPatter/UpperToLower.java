package Behavioural.InterpreterPatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class UpperToLower implements Interpreter {

	public String returnable = "";

	@Override
	public String interpret(String Context) {

		/* char[] c = Context.toCharArray(); */

		/*
		 * for(char x:c) { if(Character.isUpperCase(x)) { returnable =
		 * returnable+Character.toLowerCase(x); }else { returnable = returnable+x; } }
		 */
		/*
		 * char[] ccc = Context.toCharArray(); List<Character> check = new ArrayList();
		 * 
		 * for(char c: ccc) { check.add(c); }
		 */

		List<String> listString = Arrays.asList(Context.split(" "));

		Iterator<String> ss = listString.iterator();
		

		ArrayList<String> ded = new ArrayList<>(listString);
		
		ded.iterator();

		Function<String, String> MapperString = x -> {
			 String dd = "";
			for (char c : x.toCharArray()) {
				if (Character.isUpperCase(c)) {
					dd += Character.toLowerCase(c);
				} else {
					dd += c;
				}
			}
			return dd;
		};

		/*
		 * check.stream().forEach(x->{
		 * 
		 * if(Character.isUpperCase(x)) { returnable+=Character.toLowerCase(x); }else {
		 * returnable+=x; } });
		 */

		
		 ded.stream().forEach(s-> System.out.print(MapperString.apply(s)+" ")) ;
		
		 returnable= ded.stream().reduce("",(a,c)->a+MapperString.apply(c)+" "); 
		  
		  
		  returnable=  MapperString.apply(Context); 
		 

		return returnable;

	}

}
