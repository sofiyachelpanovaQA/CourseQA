package practice_9;

public class MainForMathOperation {
    public static void main(String[] args) {
        MathOperation sum = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation div = (a, b) -> (double) a / b;
        MathOperation mul = (a, b) -> a * b;

        System.out.println("Сумма чисел: " + sum.operate(10, 20));
        System.out.println("Разность чисел: " + sub.operate(10, 20));
        System.out.println("Деление чисел: " + div.operate(10, 20));
        System.out.println("Произведение чисел: " + mul.operate(10, 20));
    }
}
