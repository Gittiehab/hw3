package HW6_T2;
import java.util.concurrent.ThreadLocalRandom;

public class Player 
{
	String name;
	int currentCard = -1;
	boolean user_selected = false;
	int PlayerCardCounter = 0;
	
	Player(String PlayerName)
	{
		this.name=PlayerName;
	}
	
	int Play()
	{
		
		if(name=="Computer" && user_selected == false)
		{
			currentCard = BetMore_Game.pick_card();
			user_selected = true;
		}
		
		else if(name=="Player_2" && user_selected == false)
		{
			while(user_selected == false)
			{
				if(PlayerCardCounter<5)
				{
					currentCard = BetMore_Game.pick_card();
					PlayerCardCounter++;
					user_selected = ThreadLocalRandom.current().nextBoolean();
				}
				
				else
				{
					user_selected = true;
				}
			}
		}
		return currentCard;
	}
}
