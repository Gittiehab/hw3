package hw7Task2;

public class Germany_Mens_Team extends Germany_Team
{
	Germany_Mens_Team() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new Table_Tennis());
		children.add(new Germany_Footbal());
	}
}
