package de.uni.koeln.sse.se;

public class Electronic_Decorator extends Base_Decorator
{
	Electronic_Decorator(HouseholdItem h) {
		super(h);
		wrappee=h;
		// TODO Auto-generated constructor stub
	}
	private HouseholdItem wrappee;
	
	public void calcPrice()
	{	
		int weight;
		double output=-1;
		
		if(wrappee.getRelevantInfo()[0]=="Electronic")
		{
			weight=Integer.valueOf(wrappee.getRelevantInfo()[1]);
			if(wrappee.getRelevantInfo()[0]=="true")
			{
				output = 0.5*weight;
				System.out.println("Total Cost for "+wrappee.getName()+" is: "+output+" Euro.");
			}
			else
			{
				output = 5*weight/15;
				System.out.println("Total Cost for "+wrappee.getName()+" is: "+output+" Euro.");
			}
		}
	}
	
	public void packingInstruction()
	{
		if(wrappee.getRelevantInfo()[0]=="Electronic")
		{
			System.out.println("Electronic Items should be covered with Polyethylene foam film and packed in a box with a dimension of 1 cm larger dimensions of the item.");
		}
	}
	
	public String getName() {return "Electronic Decorator";}
	public String[] getRelevantInfo () {return null;}
}
