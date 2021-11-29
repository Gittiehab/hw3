package hw7Task2;

public class China_Team extends Asia_Team
{

	China_Team() 
	{
		super();
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new China_Womens_Team());
		children.add(new China_Mens_Team());
	}
}
