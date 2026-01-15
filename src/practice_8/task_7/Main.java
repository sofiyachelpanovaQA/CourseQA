package practice_8.task_7;

public class Main {
    static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setFirst(10);
        pair1.setSecond("Привет");
        System.out.println("First of pair1: " + pair1.getFirst());
        System.out.println("Second of pair2: " + pair1.getSecond());

        Pair<Double, Boolean> pair2 = new Pair<>();
        pair2.setFirst(2.2);
        pair2.setSecond(true);
        System.out.println("First of pair2: " + pair2.getFirst());
        System.out.println("Second of pair2: " + pair2.getSecond());
    }
}
