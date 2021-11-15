package hw5;

public class Exam 
{
	public int max_value;
	//@ invariant course.length == 1;
	public Course[] course;
	//@ invariant question.length >= 1;
	public Question[] question;//Anzahl question >= 1.
	public Student[] student;
	public Professor[] prof; //An Exam can be managed by any Number of Professor.
	
	public boolean register(Student s)
	{
		
	}
	
	public void addQuestion(int id, String task, int value)
	{
		Question q = new Question(id, task, value);
		for (int i=0; i<question.length; i++)
		{
			if(question[i]==null)
			{
				question[i]=q;
				break;
			}
		}
	}
	
	public Student getRegisteredStudents()
	{
		
	}
	
	public void setNaxValue(int max)
	{
		
	}
}
