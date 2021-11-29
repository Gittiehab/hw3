package hw7Task2;

public class Asia_Team extends Olympics_Teams 
{

	Asia_Team() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new China_Team());
		children.add(new Afghanistan_Team());
	}
}
