package de.uni.koeln.sse.se;

public class Glass_Decorator extends Base_Decorator
{
	private HouseholdItem wrappee;
	
	Glass_Decorator(HouseholdItem h) {
		super(h);
		// TODO Auto-generated constructor stub
		wrappee=h;
	}
	
	public void calcPrice()
	{	
		int tickness;
		int lenght;
		double output=-1;
		
		if(wrappee.getRelevantInfo()[0]=="Glass")
		{
			tickness = Integer.parseInt(wrappee.getRelevantInfo()[1]);
			lenght = Integer.parseInt(wrappee.getRelevantInfo()[2]);	
			
			if(tickness == 1)
			{
				output= 2*lenght;
			}
			else if(tickness == 2)
			{
				output=  1.2*lenght;
			}
			else if(tickness == 3)
			{
				output=  0.7*lenght;
			}
			
			System.out.println("Total Cost for "+wrappee.getName()+" is: "+output+" Euro.");
		}
	}
	
	public void packingInstruction()
	{
		if(wrappee.getRelevantInfo()[0]=="Glass")
		{
			System.out.println("Glassy Items should be packed in a box with a dimension of 1 cm larger dimensions of the item and filled with Bubble wraps.");
		}
	}
	
	public String getName() {return "Glass Decorator";}
	public String[] getRelevantInfo () {return null;}
}
