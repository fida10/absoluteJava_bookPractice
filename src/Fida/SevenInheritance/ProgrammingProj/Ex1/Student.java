package Fida.SevenInheritance.ProgrammingProj.Ex1;

public class Student extends Person {
	String courseID;
	String course;
	String teacherName;

	public Student(String firstName, String lastName, String courseID, String course, String teacherName){
		super(firstName, lastName);

		this.courseID = courseID;
		this.course = course;
		this.teacherName = teacherName;
	}

	@Override
	public void displayDetails() {
		System.out.println("NEW STUDENT DETAILS ~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(courseID);
		System.out.println(course);
		System.out.println(teacherName);
	}


}
