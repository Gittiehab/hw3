package de.uni.koeln.sse.se;

public class Furniture_Decorator extends Base_Decorator
{
Furniture_Decorator(HouseholdItem h) {
		super(h);
		wrappee=h;
		// TODO Auto-generated constructor stub
	}
private HouseholdItem wrappee;
	
	public void calcPrice()
	{	
		int weight;
		double output=-1;
		
		if(wrappee.getRelevantInfo()[0]=="Furniture")
		{
			weight=Integer.valueOf(wrappee.getRelevantInfo()[1]);
			output = 5*weight/20;
			System.out.println("Total Cost for "+wrappee.getName()+" is: "+output+" Euro.");
			}
		}
	
	
	public void packingInstruction()
	{
		if(wrappee.getRelevantInfo()[0]=="Furniture")
		{
			System.out.println("Furniture Items should be covered with waterproof covers with an area of the furniture");
		}
	}
	
	public String getName() {return "Furniture Decorator";}
	public String[] getRelevantInfo () {return null;}
}
