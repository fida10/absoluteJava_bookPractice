package Sabah.Inheritance.ex1;

public class Main {
    public static void main(String[] args) {
        Student tom = new Student(1,"Tom","Sawyer",
                "Science", "Harry","Potter");
        Student sam = new Student(2, "Walter", "White",
                "Maths", "Jack","Sparrow");
        Teacher peter = new Teacher("Peter","Pan", "History", 60000);
        Teacher nova = new Teacher("Nova","Daniel", "Geography", 40000);

        System.out.println(tom.displayDetails());
        System.out.println();
        System.out.println(sam.displayDetails());
        System.out.println();
        System.out.println(peter.displayDetails());
        System.out.println();
        System.out.println(nova.displayDetails());

    }
}
