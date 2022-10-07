package Behavioural.InterpreterPatter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ChecforDigits implements Interpreter {

	public String returnable = "";
	
	public UpperToLower ded = new UpperToLower();
	@Override
	public String interpret(String Context) {
		
		
		
		
		Function<String, String> MapperString = x->{
			
			for(char c:x.toCharArray())
			{
				if(Character.isDigit(c))
				{
					returnable+="HAHAHA";
				}else {
					returnable+=c;
				}
			}
			return returnable;
		};
		
	


		 
		 MapperString.apply(Context);
		
		
		return ded.interpret(returnable);
		
	}
	

}
