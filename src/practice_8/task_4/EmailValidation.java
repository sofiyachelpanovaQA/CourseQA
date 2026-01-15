package practice_8.task_4;

public class EmailValidation {
    static void main(String[] args) {
        checkMail("test1@gmail.com");
    }

    static String email = "test@gmail.com";
    public static void checkMail(String chekedName) throws InvalidEmailValidation {
        if (!email.equals(chekedName)) {
            throw new InvalidEmailValidation("Введен неверный email");
        }
        System.out.println("Адрес введен верно");
    }
}
