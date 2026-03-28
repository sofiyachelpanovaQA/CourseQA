package practice_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AggregationOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(50, 3, 20, 4, 15);
        //1. Поиск максимального элемента
        int foundMax = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println("Максимальное число: " + foundMax);

        //2. Поиск минимального элемента
        int foundMin = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println("Минимальное число: " + foundMin);

        //3. Сумма всех элементов списка
        int sumOfNumbers = numbers.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println("Сумма числ: " + sumOfNumbers);

        //4. Поиск первого элемента, начинающегося на "Б"
        List<String> words = Arrays.asList("Ананас", "Банан", "Яблоко", "Барбарис");
        System.out.println(words.stream()
                .filter(str -> str.toLowerCase().startsWith("б"))
                .findFirst()
                .orElse("Не найдено слов на букву Б")
        );

        //5. Проверка наличия хотя бы одного элемента по условию
        if (numbers.stream()
                .anyMatch(n -> n % 2 == 0)) {
            System.out.println("В списке есть четные числа");
        } else {
            System.out.println("В списке нет четных чисел");
        }

    }
}
