import java.util.*;
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    private int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}

class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int studentId, String researchTopic) {
        super(name, studentId);
        this.researchTopic = researchTopic;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Research Topic: " + researchTopic);
    }
}

class Faculty extends Person {
    private String department;

    public Faculty(String name, String department) {
        super(name);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance (Student) ---");
        Student student = new Student("Tanisha", 101);
        student.display();

        System.out.println("\n--- Multilevel Inheritance (PhDStudent) ---");
        PhDStudent phd = new PhDStudent("Bobi", 102, "Artificial Intelligence");
        phd.display();

        System.out.println("\n--- Single Inheritance (Faculty) ---");
        Faculty faculty = new Faculty("Drathi", "Computer Science");
        faculty.display();
    }
}

