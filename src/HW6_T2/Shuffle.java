package HW6_T2;
import java.util.concurrent.ThreadLocalRandom;

public class Shuffle 
{
	int number;
	
	private static Shuffle instance;
		
	public static Shuffle getShuffle()
	{
		if(instance == null)
		{
			instance = new Shuffle();
		}
		
		return instance;
	}
	
	void GoShuffle()
	{
		this.number = ThreadLocalRandom.current().nextInt(1, 100);
	}
}
