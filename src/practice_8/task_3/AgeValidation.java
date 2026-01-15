package practice_8.task_3;

public class AgeValidation {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Невалидный возраст");
        }
    }

    static void main(String[] args) {
        int age = 160;
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка выполнена. Введенный возраст: " + age);
        }
    }
}
