package hw7Task2;

public class Italy_Team extends Europe_Team
{
	Italy_Team() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new Italy_Womens_Team());
		children.add(new Italy_Mens_Team());
	}
}
