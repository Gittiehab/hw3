package HW6_T2;

public class Game_Chair 
{
	Player Computer = new Player("Computer");
	Player Player_2 = new Player("Player_2");
	Shuffle MyShuffle = new Shuffle();
	
	void Start()
	{
		Computer.currentCard = Computer.Play();
		Player_2.currentCard = Player_2.Play();
	}
	
	String findWinner()
	{
		return BetMore_Game.returnWinner(Computer, Player_2);
	}
}
