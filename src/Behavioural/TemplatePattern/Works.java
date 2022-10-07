package Behavioural.TemplatePattern;

public interface Works {
	
	public void pickup();
	public void Defend();
	public void TheWhat();
	
	default void Procedure() {
		pickup();
		Defend();
		TheWhat();
	}

}
