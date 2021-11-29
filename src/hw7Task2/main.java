package hw7Task2;

public class main 
{

	public static void main(String[] args) 
	{
		// Jeder Blattknoten des Baumes hat per Initialisierung genau 2 Athleten und 1 Gold Medalie.
		
		// 3a)
		IOlympics German_Men = new Germany_Mens_Team();
		System.out.println(German_Men.getNameFromSubClasses());
		System.out.println(German_Men.getNumberAthletesFromSubClasses());
		
		// 3b)
		IOlympics Germany = new Germany_Team();
		System.out.println(Germany.getNameFromSubClasses());
		System.out.println(Germany.getNumberGoldMedalsFromSubClasses());
		
		// 3c)
		IOlympics Asia = new Asia_Team();
		System.out.println(Asia.getNameFromSubClasses());
		System.out.println(Asia.getNumberGoldMedalsFromSubClasses());
		
		// 3d)
		IOlympics Olympic2024 = new Olympics_Teams();
		System.out.println(Olympic2024.getNameFromSubClasses());
		System.out.println(Olympic2024.getNumberAthletesFromSubClasses());
	}
}
