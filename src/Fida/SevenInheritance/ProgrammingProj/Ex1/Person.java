package Fida.SevenInheritance.ProgrammingProj.Ex1;

public class Person {
	String firstName;
	String lastName;

	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public void displayDetails(){
		System.out.println("First name is: " + firstName);
		System.out.println("Last name is: " + lastName);
	}

}
