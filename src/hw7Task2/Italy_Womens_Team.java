package hw7Task2;

public class Italy_Womens_Team extends Italy_Team
{
	Italy_Womens_Team() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new Alpine_Sky());
	}
}
