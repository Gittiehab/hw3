package hw7Task2;

public class Germany_Team extends Europe_Team
{
	Germany_Team() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new Germany_Womens_Team());
		children.add(new Germany_Mens_Team());
	}
}
