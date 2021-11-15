package hw5;

public class Department 
{
	public String name;
	public Employee[] employee;//Ein Department hat beliebig viele Employee.
	//@ invariant chair.length == 1;
	public Professor[] chair;
	public Course[] courses;
}
