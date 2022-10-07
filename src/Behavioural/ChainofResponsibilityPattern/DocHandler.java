package Behavioural.ChainofResponsibilityPattern;

public abstract class DocHandler {
	
	private DocHandler c ;
	
	public DocHandler(DocHandler doc) {
		this.c = doc;
	}
	
	public void OpenDoc(String Fileextension)
	{
		if(c!=null)
		{
			c.OpenDoc(Fileextension);
		}

	}

}
