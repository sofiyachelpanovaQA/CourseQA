package practice_8.task_2;

public class DivideExeptionExemple {
    public static int divide (int a, int b) {
        return b/a;
    }

    static void main(String[] args) {
        try {
            int result = divide(0, 10);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        } finally {
            System.out.println("Операция завершена");
        }
    }
}
