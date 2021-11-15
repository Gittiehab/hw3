package hw5;

public class Question //Composition with Exam
{
	public String task;
	public int maxValue;
	public int q_id;
	
	public Question(int id, String task, int value)
	{
		this.task=task;
		this.maxValue=value;
		this.q_id=id;
	}
}
