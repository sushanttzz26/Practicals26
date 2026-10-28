import java.util.*;

abstract class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    abstract void display();
}

class Record extends Student {
    Record(String name) {
        super(name);
    }

    void display() {
        System.out.println("Student: " + name);
    }
}

class Practical10 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Record("Ram"));
        list.add(new Record("Shyam"));

        for (Student s : list)
            s.display();
    }
}
