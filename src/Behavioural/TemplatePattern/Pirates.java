package Behavioural.TemplatePattern;

public class Pirates implements Works {

	@Override
	public void pickup() {
		System.out.println("pirates pick up Sword");
		
	}

	@Override
	public void Defend() {
		System.out.println("pirates Defends Himself");
		
	}

	@Override
	public void TheWhat() {
		System.out.println("pirates then Jumps off ship");
		
	}

}
