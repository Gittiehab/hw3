package hw7Task2;
import java.util.*;

public class Olympics_Teams extends Team
{
	Olympics_Teams() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public void instantiateChildren()
	{
		children.add(new Asia_Team());
		children.add(new Africa_Team());
		children.add(new Europe_Team());
		children.add(new South_America_Team());
	}
}
