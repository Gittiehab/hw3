package HW6_T2;

public class Main 
{
	public static void main(String[] args) 
	{
		Game_Chair chair = new Game_Chair();
		
		chair.Start();
		System.out.println("Der Gewinner ist "+chair.findWinner()+". Der Computer hat "+ chair.Computer.currentCard+". Und Player_2 hat "+chair.Player_2.currentCard+".");
		System.out.println("Player_2 hat sich für die "+chair.Player_2.PlayerCardCounter+"-te Karte entschieden.");
	}
}
