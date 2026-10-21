import java.util.*;
abstract class Employee {
    abstract double salary();

    void display() {
        System.out.println("Salary: " + salary());
    }
}

interface Payable {
    void pay();
}

interface Printable {
    void print();
}

class Manager extends Employee implements Payable, Printable {
    double salary() {
        return 50000;
    }

    public void pay() {
        System.out.println("Payment processed");
    }

    public void print() {
        System.out.println("Manager Details");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
        m.pay();
        m.print();
    }
}
