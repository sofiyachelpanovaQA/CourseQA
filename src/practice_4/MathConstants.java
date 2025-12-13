package practice_4;

public class MathConstants {
    final static double PI = 3.14159;
    final double E = 2.71828;

    static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    static double  calculateCircumference(double r) {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        System.out.println(calculateCircleArea(10));
        System.out.println(calculateCircleArea(12));
    }
}
