package Behavioural.ChainofResponsibilityPattern;

public class Powerpointhandler extends DocHandler {

	public Powerpointhandler(DocHandler doc) {
		super(doc);
	}
	
	public void OpenDoc(String Fileextension)
	{
		if(Fileextension.equals("PPT"))
		{
			System.out.println("Opening PPT");
		}else {
			super.OpenDoc(Fileextension);
		}

	}

}
