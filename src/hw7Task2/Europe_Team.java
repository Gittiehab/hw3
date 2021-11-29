package hw7Task2;

public class Europe_Team extends Olympics_Teams
{
	Europe_Team() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new Germany_Team());
		children.add(new Italy_Team());
	}
}
