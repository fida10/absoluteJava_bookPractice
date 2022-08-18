package Sabah.Inheritance.ex1;

public class Person {
    private String firstname;
    private String lastname;

    public Person(String firstName, String lastName){
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public String getFirstName(){
        return this.firstname;
    }
    public String setFirstName(){
        return this.firstname;
    }
    public String getlastName(){
        return this.lastname;
    }
    public String setlastName(){
        return this.lastname;
    }


    public String displayDetails(){
        return "Name of Person: "+ firstname +" "+lastname;
    }
}
