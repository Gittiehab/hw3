package hw7Task2;

public class Germany_Womens_Team extends Germany_Team
{
	Germany_Womens_Team() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new Cycling());
		children.add(new Tennis());
	}
}
