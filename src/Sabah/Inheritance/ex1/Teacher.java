package Sabah.Inheritance.ex1;

public class Teacher extends Person{
    private String subject;
    private long salary;

    public Teacher(String firstName, String lastName, String subject, long salary){
        super(firstName, lastName);
        this.subject = subject;
        this.salary = salary;

    }
    public Teacher(String firstName, String lastName){
        super(firstName, lastName);


    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public long getSalary() {
        return this.salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getSubject(){
        return this.subject;
    }

    @Override
    public String displayDetails(){
        return "Name of Teacher: "+ getFirstName() +" "+getlastName()+"\n"+
                "Subject: "+getSubject()+"/n"+ "Salary: "+getSalary();
    }
}
