package de.uni.koeln.sse.se;

public interface HouseholdItem 
{
	public abstract String getName();
	public abstract String[] getRelevantInfo ();
	public abstract void calcPrice();
	public abstract void packingInstruction();
}
