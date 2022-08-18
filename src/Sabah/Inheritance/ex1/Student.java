package Sabah.Inheritance.ex1;

public class Student extends Person{
    private int id;
    private String course;
    private Teacher teacher ;


    public Student(int id, String firstName, String lastName, String course, String teacherfName,
                   String teacherlname){
        super(firstName,lastName);
        this.id =id;
        this.course = course;
        this.teacher = new Teacher(teacherfName, teacherlname);

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCourse() {
        return course;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    @Override
    public String displayDetails(){
        return "Name of Student: "+ getFirstName() +" "+getlastName()+"\n"+
                "Id: "+ getId()+" "+"\n"+"Course: "+ getCourse() + " \n" +
                "Teacher: "+ teacher.getFirstName()+" "+teacher.getlastName();
    }
}
