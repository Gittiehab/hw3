package hw7Task2;

public class China_Womens_Team extends China_Team
{

	China_Womens_Team() 
	{
		super();
	}
	
	@Override
	public void instantiateChildren()
	{
		children.add(new Teakwondo());
		children.add(new Waterpolo());
		children.add(new Artistic_Gymnastics());
	}
}
