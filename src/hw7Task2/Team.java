package hw7Task2;

import java.util.ArrayList;
import java.util.List;

public class Team implements IOlympics
{
	String name;
	int numberAthletes;
	int numberGoldMedals;
	public List<IOlympics> children = new ArrayList<>();
	
	Team()
	{
		instantiateChildren();
		this.name = "";
		char[] nameArray = this.getClass().toString().toCharArray();
		
		for(int i = 15; i < nameArray.length; i++)
		{
			if(nameArray[i] == '_')
			{
				nameArray[i] = ' ';
			}
			
			this.name += nameArray[i];
		}
		
		for(IOlympics io: children)
		{
			this.numberAthletes += io.getNumberAthletes();
			this.numberGoldMedals += io.getNumberGoldMedals();
		}
	}
	
	public String getNameFromSubClasses()
	{
		String output = this.name;
		output += "\n";
		for(IOlympics io: children)
		{
			output +="SubTeam: ";
			output += io.getName();
			output+=  ". \n";
		}
		
		return output;
	}
	
	public String getNumberAthletesFromSubClasses()
	{
		String output = this.name;
		output += "\n";
		for(IOlympics io: children)
		{
			output += io.getName();
			output +=": has ";
			output+= io.getNumberAthletes() ;
			output+=  " Athletes. \n";
		}
		
		return output;
	}
	
	public String getNumberGoldMedalsFromSubClasses()
	{
		String output = this.name;
		output += "\n";
		for(IOlympics io: children)
		{
			output += io.getName();
			output +=": has ";
			output+= io.getNumberGoldMedals() ;
			output+=  " Gold Medals. \n";
		}
		
		return output;
	}
	
	public void instantiateChildren()
	{
		
	}
	
	public int getNumberAthletes()
	{
		return numberAthletes;
	}
	
	public int getNumberGoldMedals()
	{
		return numberGoldMedals;
	}
	
	public String getName()
	{
		return name;
	}
}
