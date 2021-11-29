package hw7Task2;

public class China_Mens_Team extends China_Team 
{
	China_Mens_Team() 
	{
		super();
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new Shooting());
	}
}
