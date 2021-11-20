package HW6_T2;

public class BetMore_Game 
{
	static int pick_card()
	{
		Shuffle.getShuffle().GoShuffle();
		return Shuffle.getShuffle().number;
	}
	
	static String returnWinner(Player Computer, Player Player_2)
	{
		if(Computer.currentCard<Player_2.currentCard)
		{
			return "Player_2";
		}
		
		else if(Computer.currentCard>Player_2.currentCard)
		{
			return "Computer";
		}
		
		else
		{
			return "unentschieden";
		}
	}
}
