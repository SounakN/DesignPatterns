package Behavioural.ChainofResponsibilityPattern;

public class Excelhandler extends DocHandler {

	public Excelhandler(DocHandler doc) {
		super(doc);
	}
	public void OpenDoc(String Fileextension)
	{
		if(Fileextension.equals("XLSX"))
		{
			System.out.println("Opening XLSX");
		}else {
			super.OpenDoc(Fileextension);
		}

	}
}
