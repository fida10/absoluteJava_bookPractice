package Fida.SevenInheritance.ProgrammingProj.Ex1;

public class Main {
	public static void main(String[] args){
		Teacher mathTeacher = new Teacher("Todd", "Bay", "Math", "25k/annum");
		Teacher csTeacher = new Teacher("Ganesh", "Resham", "Computer Science", "30k/annum");

		mathTeacher.displayDetails();
		csTeacher.displayDetails();


		Student Fida = new Student("Fida", "Eshad", "CS241", "Algorithms", "Ganesh");
		Student Sabah = new Student("Sabah", "Ummie", "CS242", "Data Structures", "Jiresha");

		Fida.displayDetails();
		Sabah.displayDetails();
	}
}
