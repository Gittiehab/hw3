package hw7Task2;

public class Italy_Mens_Team extends Italy_Team
{
	Italy_Mens_Team() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new Italy_Footbal());
		children.add(new Swimming_Team());
	}
}
