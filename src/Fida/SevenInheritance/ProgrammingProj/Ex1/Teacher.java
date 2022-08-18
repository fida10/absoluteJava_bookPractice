package Fida.SevenInheritance.ProgrammingProj.Ex1;

public class Teacher extends Person{

	String subjectName;
	String salary;

	public Teacher(String firstName, String lastName, String subjectName, String salary){
		super(firstName, lastName);

		this.subjectName = subjectName;
		this.salary = salary;
	}

	@Override
	public void displayDetails(){
		System.out.println("NEW TEACHER DETAILS ~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(subjectName);
		System.out.println(salary);
	}
}
