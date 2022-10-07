package Behavioural.ChainofResponsibilityPattern;

public class Texthandler extends DocHandler {

	public Texthandler(DocHandler doc) {
		super(doc);
	}
	
	public void OpenDoc(String Fileextension)
	{
		if(Fileextension.equals("Text"))
		{
			System.out.println("Opening Text");
		}else {
			super.OpenDoc(Fileextension);
		}

	}

}
