package de.uni.koeln.sse.se;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client
{
	
public static void main(String[] args) 
{
		//Initialise some household
		List<HouseholdItem> householdItmes= new ArrayList<>();
		List<HouseholdItem> householdItmes2= new ArrayList<>();

		
		Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false);
		Electronic tv= new Electronic("TV",122, 73, 15, 18, true);
		Electronic_Decorator ed1 = new Electronic_Decorator(microwaveOven);
		Electronic_Decorator ed2 = new Electronic_Decorator(tv);
		
		
		Glass wineGlass= new Glass("Wine glasses",33,28,23,1);
		Glass coffeeTable= new Glass("Glass Coffee Table ",80,80,45,3);
		Glass_Decorator gd1 = new Glass_Decorator(wineGlass);
		Glass_Decorator gd2 = new Glass_Decorator(coffeeTable);
		
		Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);
		Furniture_Decorator fd1 = new Furniture_Decorator(bed);    
		Furniture_Decorator fd2 = new Furniture_Decorator(cupboard);  
		
        List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard );
        List<HouseholdItem> namesList2 = Arrays.asList(ed1,ed2,gd1,gd2,fd1,fd2);
        householdItmes.addAll(namesList);  
        householdItmes2.addAll(namesList2);  
       
        for (int i = 0; i<householdItmes2.size(); i++)
        {
        	householdItmes2.get(i).calcPrice();
        	householdItmes2.get(i).packingInstruction();
        	System.out.println("");
        }
}
}
