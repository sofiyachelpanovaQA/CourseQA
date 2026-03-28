package practice_9;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //2. Использование анонимного класса
        Runnable run1 = () -> System.out.println("Hello from anonymous class!");
        run1.run();

        //3. Лямбда-выражение с Predicate
        int number = 9;
        Predicate<Integer> checkParity = n -> (n % 2 == 0);
        if (checkParity.test(number)) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        //4. Лямбда-выражение с Function
        String string = "Hello!!!";
        Function<String, Integer> strToInt = String::length;
        System.out.println(strToInt.apply(string));

        //5. Использование Consumer
        Consumer<String> printer = System.out::println;
        printer.accept(string);
    }
}
