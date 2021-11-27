package de.uni.koeln.sse.se;

public class Glass implements HouseholdItem
{
	String name;
	int lenght;
	int width;
	int height;

	int tickness;

	
	public Glass(String name, int lenght, int width, int height, int tickness) {
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.tickness = tickness;
	
	}



//Getters and Setters =

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLenght() {
		return lenght;}

	public void setLenght(int lenght) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public Integer getTickness() {
		return tickness;}

	public void setTickness(int tickness) {
		this.tickness = tickness;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getRelevantInfo ()
	{
		String[] output = new String[3];
		output[0]="Glass";
		output[1]= String.valueOf(tickness);
		output[2]= String.valueOf(lenght);
		return output;
	}
	
	public void calcPrice() {}
	public void packingInstruction() {}
}
