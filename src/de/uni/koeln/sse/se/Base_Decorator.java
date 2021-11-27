package de.uni.koeln.sse.se;

public abstract class Base_Decorator implements HouseholdItem
{
	private HouseholdItem wrappee;
	Base_Decorator(HouseholdItem h)
	{
		this.wrappee = h;
	}
	public abstract void calcPrice ();
	public abstract void packingInstruction();
}
