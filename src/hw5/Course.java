package hw5;

public class Course 
{
	public int id;
	public String name;
	public int maxCapacity;
	public boolean isFull;
	//@ invariant prof.length == 1;
	public Professor[] prof; //A Course can only have exactly one Professor.
	public Student[] student; //Jeder Course hat beliebig viele Student.
	//@ invariant exam.length >= 1;
	public Exam[] exam;
	public Project[] projects;//Jeder Course hat beliebig viele Project.

	public Course(int id, String name, int cap, Professor prof)
	{
		
	}
	
	public void Enroll(Student student)
	{
		
	}
	
	public void Apply(TA ta)
	{
		
	}
	
	public Professor getProf()
	{
		
	}
	//Es gibt weitere Methoden
}
