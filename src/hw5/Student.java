package hw5;

public class Student 
{
	public String name;
	public int StudentId;
	//@ invariant project.length <= 1 && project.length >= 0;
	public Project[] project;
	//@ invariant courses.length >= 1;
	public Course[] courses; // Jeder Student belegt mindestens 1 Course.
	public Exam[] exam;
	
	public String getName()
	{
		
	}
	
	public Project getProjects()
	{
		
	}
}
