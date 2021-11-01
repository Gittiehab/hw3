package hw3;

public class MyElevator 
{
	public String state="Idle";
	public String idle="Idle";
	public String up="Moving_up";
	public String down="Moving_down";
	public String ex ="Exit";
	
	public int CurrentFloor;
	
	public void go_up()
	{
		CurrentFloor++;
		state=up;
		System.out.println("Current floor: "+CurrentFloor+". State: "+state+".");
	}
	
	public void go_down()
	{
		CurrentFloor--;
		state=down;
		System.out.println("Current floor: "+CurrentFloor+". State: "+state+".");
	}
	
	public void finished()
	{
		state=ex;
		System.out.println("Current floor: "+CurrentFloor+". State: "+state+".");
	}
	
	public void initialise(int current, int dest)
	{
		CurrentFloor=current;
		System.out.println("Current floor: "+CurrentFloor+". State: "+state+".");
		if(current == dest) finished();
		
		if(current< dest)
		{
			while(current< dest)
			{
				go_up();
				current++;
			}
			state=idle;
			System.out.println("Current floor: "+CurrentFloor+". State: "+state+".");
			finished();
		}
		
		if(current > dest)
		{
			while(current > dest)
			{
				go_down();
				current--;
			}
			state=idle;
			System.out.println("Current floor: "+CurrentFloor+". State: "+state+".");
			finished();
		}
	}
}
