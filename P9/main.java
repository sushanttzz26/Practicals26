import java.util.*;

class Practical9 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);

        System.out.println(a);
        a.remove(Integer.valueOf(20));
        System.out.println(a);
        System.out.println(a.contains(10));
        System.out.println("Size: " + a.size());

        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        System.out.println(names);
    }
}
