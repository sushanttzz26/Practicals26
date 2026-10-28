
class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    void setValue(T value) {
        this.value = value;
    }
}

class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void display() {
        System.out.println(key + " : " + value);
    }
}

public class Practical7 {
    static <T> void display(T value) {
        System.out.println(value);
    }

    static double sum(Box<? extends Number> box) {
        return box.getValue().doubleValue();
    }

    static void add(Box<? super Integer> box, Integer value) {
        box.setValue(value);
        System.out.println("Added: " + value);
    }

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Ram");

        System.out.println(b1.getValue());
        System.out.println(b2.getValue());

        Pair<Integer, String> p = new Pair<>(1, "Shyam");
        p.display();

        display(25);
        display("Mohit");
        display(12.5);

        Box<Double> b3 = new Box<>(45.5);
        System.out.println("Number: " + sum(b3));

        Box<Number> b4 = new Box<>(10);
        add(b4, 50);
        System.out.println(b4.getValue());
    }
}
